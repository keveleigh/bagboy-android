package com.baggers.bagboy;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Dialog;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapActivity extends Fragment {
	
    private GoogleMap gm;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {        
		// Inflate the layout for this fragment
		View v = inflater.inflate(R.layout.activity_map, container, false);
		
		// Checking play services status
		int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity());
		if(status!=ConnectionResult.SUCCESS){ // Google Play Services are not available

	        int requestCode = 10;
	        Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, getActivity(), requestCode);
	        dialog.show();

	    } else { // Play services available
	    	gm = ((SupportMapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
			gm.setMyLocationEnabled(true);
			
			gm.moveCamera( CameraUpdateFactory.newLatLngZoom(new LatLng(33.7749832,-84.3966354) , 14.0f) );
			gm.addMarker(new MarkerOptions()
		     .position(new LatLng(33.7749832,-84.3966354))
		     .title("Georgia Institute of Technology")
		     .snippet("4 stores nearby"));
			
//			// Getting LocationManager object from System Service LOCATION_SERVICE
//	        LocationManager locationManager = (LocationManager) getActivity().getSystemService(getActivity().LOCATION_SERVICE);
//
//	        // Creating a criteria object to retrieve provider
//	        Criteria criteria = new Criteria();
//
//	        // Getting the name of the best provider
//	        String provider = locationManager.getBestProvider(criteria, true);
//
//	        // Getting Current Location
//	        Location location = locationManager.getLastKnownLocation(provider);
//
//	        LocationListener ll = new LocationListener() {
//		          public void onLocationChanged(Location location) {
//		          // redraw the marker when get location update.
//		          drawMarker(location);
//		          }
//	        };
//
//	        if(location!=null){
//	           //PLACE THE INITIAL MARKER              
//	           drawMarker(location);
//	        }
//	        locationManager.requestLocationUpdates(provider, 20000, 0, ll);
	    }
	    
	    return v;
	}
	
	private void drawMarker(Location location){
		gm.clear();
		LatLng currentPosition = new LatLng(location.getLatitude(), location.getLongitude());
		gm.addMarker(new MarkerOptions()
			.position(currentPosition)
			.snippet("Lat:" + location.getLatitude() + "Lng:"+ location.getLongitude()));
	}
}