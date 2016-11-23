package br.com.simplepass.mapfragmentwrapper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.SupportMapFragment;

import org.jetbrains.annotations.NotNull;

/**
 * Created by hinovamobile on 23/11/16.
 */

public class CustomMapFragment extends SupportMapFragment {
    private View mOriginalView;
    private MapFragmentWrapper mMapWrapperLayout;

    private boolean mIgnoreFirstRelease = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mOriginalView = super.onCreateView(inflater, container, savedInstanceState);

        mMapWrapperLayout = new MapFragmentWrapper(getActivity());
        mMapWrapperLayout.addView(mOriginalView);

        mMapWrapperLayout.setOnDragListener(new MapFragmentWrapper.OnDragListener() {
            @Override
            public void onDragStart(@NotNull MotionEvent motionEvent) {
                mMapWrapperLayout.animateUp();
            }

            @Override
            public void onDragEnd(@NotNull MotionEvent motionEvent) {
                mMapWrapperLayout.animateDown();
            }
        });

        return mMapWrapperLayout;
    }

    @Override
    public View getView() {
        return mOriginalView;
    }

}
