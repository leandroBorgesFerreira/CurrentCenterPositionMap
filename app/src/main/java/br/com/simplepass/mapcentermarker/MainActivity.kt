package br.com.simplepass.mapcentermarker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback


import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.maps.SupportMapFragment


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
        val mapFragment : SupportMapFragment =
                supportFragmentManager.findFragmentById(R.id.main_fragment_map) as SupportMapFragment

        mapFragment.getMapAsync(this)


    }

    override fun onMapReady(googleMap: GoogleMap?) {

    }
}
