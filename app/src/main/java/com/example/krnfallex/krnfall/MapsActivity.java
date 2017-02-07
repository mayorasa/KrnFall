package com.example.krnfallex.krnfall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements GoogleMap.OnMarkerClickListener,OnMapReadyCallback {

    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng thailand = new LatLng(14.845893, 98.809198);
        mMap.addMarker(new MarkerOptions()
                .position(thailand)
                .title("KANCHABURI")
                .snippet(getString(R.string.app_name))
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.iconmapnull))

        );
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(14.845893, 98.809198), 9));


       // GoogleMap mMap = ((SupportMapFragment) getSupportFragmentManager()
        //        .findFragmentById(R.id.map)).getMap();

        GoogleMap mMap = ((SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map)).getMap();


        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.30034, 98.44858))
                .title("TAKIEN THONG FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap1eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.98318, 98.62522))
                .title("DAI CHONG THONG FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap2eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.98160, 98.63283))
                .title("KROENGKAWIA FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap3eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.67236, 98.60069))
                .title("KHAO YAI FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap4eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.35751, 98.68011))
                .title("CLITI FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap5eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.023064, 98.597783))
                .title("KRA TENG JENG FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap6eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.68614, 98.38082))
                .title("JOKKRADIN FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap7eng))

                );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.63808, 98.98662))
                .title("MAEKHAMIN FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap8eng))

        );

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.66461, 98.38507))
                .title("PARPAE FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap9eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.533612, 98.655967))
                .title("PONGKRADANGNGA FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap10eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.69191, 98.40564))
                .title("LARGE RAW FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap11eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.90583, 98.72114))
                .title("THUNG NANG KRUAN FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap12eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.67623, 98.37843))
                .title("PI TENG FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap13eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.667999, 99.287217))
                .title("TRAI TRUENG FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap14eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.23972, 99.34012))
                .title("PHALAD FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap15eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.65151, 98.77558))
                .title("PHATAD FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap16eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.67118, 99.28865))
                .title("THAN NGERN THAN THONG FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap17eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.36864, 99.14397))
                .title("ERAWAN FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap18eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.43859, 98.85107))
                .title("SAI YOK YAI FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap19eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.23912, 99.05742))
                .title("SAI YOK NOI FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap20eng))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.75921, 98.75492))
                .title("PHA SAWAN FALL")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap21eng))

        );
        mMap.setOnMarkerClickListener(this);
    }
    @Override
    public boolean onMarkerClick(final Marker marker) {


        Intent intent;

        String name= marker.getTitle();
        if (name.equalsIgnoreCase("TAKIEN THONG FALL FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 1);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("DAI CHONG THONG FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 2);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("KROENGKAWIA FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 3);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("KHAO YAI FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 4);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("CLITI FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 5);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("KRA TENG JENG FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 6);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("JOKKRADIN FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 7);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("MAEKHAMIN FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 8);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("PARPAE FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 9);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("PONGKRADANGNGA FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 10);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("LARGE RAW FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 11);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("THUNG NANG KRUAN FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 12);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("PI TENG FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 13);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("TRAI TRUENG FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 14);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("PHALAD FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 15);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("PHATAD FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 16);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("THAN NGERN THAN THONG FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 17);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("ERAWAN FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 18);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("SAI YOK YAI FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 19);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("SAI YOK NOI FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 20);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("PHA SAWAN FALL"))
        {
            intent = new Intent(MapsActivity.this, PageInfoEngActivity.class);
            intent.putExtra("waterfall_id", 21);
            startActivity(intent);
        }
        return false;

    }
    public void buttonlist(View view) {
        startActivity(new Intent(MapsActivity.this, ListEngActivity.class));
    }
    }
