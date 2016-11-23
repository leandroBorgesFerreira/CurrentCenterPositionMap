package br.com.simplepass.mapfragmentwrapper

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.TargetApi
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

/**
 * Created by hinovamobile on 04/11/16.
 */
class MapFragmentWrapper : RelativeLayout {

    interface OnDragListener {
        fun onDragStart(motionEvent: MotionEvent)
        fun onDragEnd(motionEvent: MotionEvent)
    }

    var mOnDragListener: OnDragListener? = null

    private var mMarkImageView : ImageView? = null
    private var mShadowView : View? = null
    lateinit var params : RelativeLayout.LayoutParams

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context)
    }

    @TargetApi(23)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)

        removeView(mMarkImageView)
        removeView(mShadowView)
        addView(mMarkImageView, -1 , params)
        addView(mShadowView, -1, params)
    }

    private fun init(context: Context) {
        mMarkImageView = ImageView(context)
        mMarkImageView?.setImageResource(R.drawable.ic_marker_centered)

        params = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        params.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);

        mShadowView = View(context)
        mShadowView?.setBackgroundResource(R.drawable.map_pin_shadow)

    }

    fun animateUp() {
        if(mMarkImageView != null && mShadowView != null) {
            val translateY = ObjectAnimator.ofFloat(mMarkImageView,
                    "translationY",
                    -(mMarkImageView!!.height.toFloat())/10)

            val alphaShadow = ObjectAnimator.ofFloat(mShadowView,
                    "alpha",
                    1f,
                    0.6f)

            val animatorSet = AnimatorSet()
            animatorSet.playTogether(translateY, alphaShadow)
            animatorSet.start()
        }
    }

    fun animateDown(){
        if(mMarkImageView != null && mShadowView != null) {
            val translateYInverse = ObjectAnimator.ofFloat(mMarkImageView,
                    "translationY",
                    mMarkImageView!!.height.toFloat()/25)

            val alphaShadowInverse = ObjectAnimator.ofFloat(mShadowView,
                    "alpha",
                    0.6f,
                    1f)

            val animatorSet = AnimatorSet()
            animatorSet.playTogether(translateYInverse, alphaShadowInverse)
            animatorSet.start()
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        when (ev.getAction()) {
            MotionEvent.ACTION_DOWN -> mOnDragListener?.onDragStart(ev)
            MotionEvent.ACTION_UP -> mOnDragListener?.onDragEnd(ev)
        }

        return super.dispatchTouchEvent(ev)
    }

    fun setOnDragListener(mOnDragListener: OnDragListener) {
        this.mOnDragListener = mOnDragListener
    }

}
