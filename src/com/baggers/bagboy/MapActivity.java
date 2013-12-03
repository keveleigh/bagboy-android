package com.baggers.bagboy;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapActivity extends Fragment {
	
    private GoogleMap map;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {        
		// Inflate the layout for this fragment
		View v = inflater.inflate(R.layout.activity_map, container, false);
		
		map = ((SupportMapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		
//		int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getBaseContext());
//		if (status == ConnectionResult.SUCCESS) {
//	      SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
//	      map = supportMapFragment.getMap();
//	    }
//	    else {
//	      int requestCode = 10;
//	      Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, this, requestCode);
//	      dialog.show();
//	    }
		
	    
	    return v;
	}
}