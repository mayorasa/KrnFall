package com.example.krnfallex.krnfall;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsthlistActivity extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapsthlist);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng thailand = new LatLng(14.845893, 98.809198);
        mMap.addMarker(new MarkerOptions()
                .position(thailand)
                .title("จังหวัดกาญจนบุรี")
                .snippet("อำเภอเมือง")
                .snippet(getString(R.string.app_name))
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.iconmapnull))
        );
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(14.845893, 98.809198), 9));



        GoogleMap mMap = ((SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map)).getMap();


        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.30034, 98.44858))
                .title("น้ำตกตะเคียนทอง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap1th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.98318, 98.62522))
                .title("น้ำตกไดช่องถ่อง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap2th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.98160, 98.63283))
                .title("น้ำตกเกริงกระเวีย")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap3th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.67236, 98.60069))
                .title("น้ำตกเขาใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap4th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.35751, 98.68011))
                .title("น้ำตกคลีตี้")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap5th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.023064, 98.597783))
                .title("น้ำตกกระเต็งเจ็ง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap6th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.68614, 98.38082))
                .title("น้ำตกจ๊อกกระดิ่น")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap7th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.63808, 98.98662))
                .title("น้ำตกห้วยแม่ขมิ้น")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap8th))

        );

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.66461, 98.38507))
                .title("น้ำตกผาแป")
                .snippet("อำเภอทองผาภูมิ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap9th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.533612, 98.655967))
                .title("น้ำตกโป่งกระดังงา")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap10th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.69191, 98.40564))
                .title("น้ำตกดิบใหญ่")
                .snippet("อำเภอทองผาภูมิ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap11th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.90583, 98.72114))
                .title("น้ำตกทุ่งนางครวญ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap12th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.67623, 98.37843))
                .title("น้ำตกปิเต็ง")
                .snippet("อำเภอทองผาภูมิ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap13th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.667999, 99.287217))
                .title("น้ำตกไตรตรึงษ์")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap14th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.23972, 99.34012))
                .title("น้ำตกผาลาด")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap15th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.65151, 98.77558))
                .title("น้ำตกผาตาด")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap16th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.67118, 99.28865))
                .title("น้ำตกธารเงิน-ธารทอง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap17th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.36864, 99.14397))
                .title("น้ำตกเอราวัณ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap18th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.43859, 98.85107))
                .title("น้ำตกไทรโยคใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap19th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.23912, 99.05742))
                .title("น้ำตกไทรโยคน้อย")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap20th))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(14.75921, 98.75492))
                .title("น้ำตกผาสวรรค์")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.imap21th))

        );
        mMap.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(final Marker marker) {

        Intent intent;
        String name = marker.getTitle();
        if (name.equalsIgnoreCase("น้ำตกตะเคียนทอง"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 1);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกไดช่องถ่อง"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 2);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกเกริงกระเวีย"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 3);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกเขาใหญ่"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 4);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกคลีตี้"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 5);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกกระเต็งเจ็ง"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 6);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกจ๊อกกระดิ่น"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 7);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกห้วยแม่ขมิ้น"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 8);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกผาแป"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 9);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกโป่งกระดังงา"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 10);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกดิบใหญ่"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 11);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกทุ่งนางครวญ"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 12);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกปิเต็ง"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 13);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกไตรตรึงษ์"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 14);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกผาลาด"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 15);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกผาตาด"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 16);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกธารเงิน-ธารทอง"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 17);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกเอราวัณ"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 18);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกไทรโยคใหญ่"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 19);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกไทรโยคน้อย"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 20);
            startActivity(intent);
        }
        else if (name.equalsIgnoreCase("น้ำตกผาสวรรค์"))
        {
            intent = new Intent(MapsthlistActivity.this, PageInfoActivity.class);
            intent.putExtra("waterfall_id", 21);
            startActivity(intent);
        }
        return false;
    }
    public void buttonlist(View view) {
        startActivity(new Intent(MapsthlistActivity.this, ListthActivity.class));
    }


}
