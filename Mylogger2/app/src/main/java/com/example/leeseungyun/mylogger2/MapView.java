package com.example.leeseungyun.mylogger2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by Lee Seung Yun on 2016-11-10.
 */
public class MapView extends FragmentActivity {
    GoogleMap gmap;

    LatLng location = new LatLng(37.559603, 126.982203);
    MarkerOptions marker;
    CameraPosition cp = new CameraPosition.Builder().target(location).zoom(11).build();

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_map);

        gmap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        gmap.animateCamera(CameraUpdateFactory.newCameraPosition(cp));

//        FragmentManager myFM = getSupportFragmentManager();
//        SupportMapFragment mySMF = (SupportMapFragment)myFM.findFragmentById(R.id.map);
//        gmap = mySMF.getMap();
    }

}
