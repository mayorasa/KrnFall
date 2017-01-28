package com.example.krnfallex.krnfall;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GpsFall extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String centerLatString, centerLngString, nameFallString;
    private double fallLatADouble, fallLngADouble;
    private LatLng centerLatLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps_fall);

        //Setup
        centerLatString = getIntent().getStringExtra("Lat");
        centerLngString = getIntent().getStringExtra("Lng");
        nameFallString = getIntent().getStringExtra("NameFall");
        fallLatADouble = Double.parseDouble(centerLatString);
        fallLngADouble = Double.parseDouble(centerLngString);

        Log.d("28janV2", "Name ==> " + nameFallString);
        Log.d("28janV2", "Lat ==> " + centerLatString);
        Log.d("28janV2", "Lng ==> " + centerLngString);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }   // Main Method

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Setup Center Map
        centerLatLng = new LatLng(fallLatADouble, fallLngADouble);

        //Create Map
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(centerLatLng, 16));

        //Create All Marker
        createMarker();

    }   // onMapReady

    private void createMarker() {

        //For Fall
        mMap.addMarker(new MarkerOptions().position(centerLatLng)
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.build10))
        .title(nameFallString));

    }   // createMarker

}   // Main Class
