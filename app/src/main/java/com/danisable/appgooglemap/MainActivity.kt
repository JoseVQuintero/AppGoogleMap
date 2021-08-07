package com.danisable.appgooglemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        //mapFragment.getMapAsync(this)

    }

    override fun onMapReady(google: GoogleMap) {
        val defaultLocatation = LatLng(39.481186,-0.340987)
        google.addMarker(MarkerOptions().position(defaultLocatation).title("My first location"))
        google.moveCamera(CameraUpdateFactory.newLatLng(defaultLocatation))
    }
}