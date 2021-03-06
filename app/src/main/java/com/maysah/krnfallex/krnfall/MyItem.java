package com.maysah.krnfallex.krnfall;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterItem;

public class MyItem implements ClusterItem {
    private final LatLng mPosition;



    public MyItem(double lat, double lng) {
        mPosition = new LatLng(lat, lng);

    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }

}