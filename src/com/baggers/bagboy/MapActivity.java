package com.baggers.bagboy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapActivity extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {        
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.activity_map, container, false);
	}
}