package br.com.simplepass.mapcentermarker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import br.com.simplepass.mapfragmentwrapper.CustomMapFragment
import br.com.simplepass.mapfragmentwrapper.MapFragmentWrapper
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback


import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.maps.MapFragment



class MainActivity : AppCompatActivity(), OnMapReadyCallback {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapInit()
    }

    /**
     * Initializes the map.
     */
    private fun mapInit() {
        val mapFragment : CustomMapFragment =
                supportFragmentManager.findFragmentById(R.id.main_fragment_map) as CustomMapFragment

        mapFragment.getMapAsync(this)


    }

    override fun onMapReady(googleMap: GoogleMap?) {

    }
}
