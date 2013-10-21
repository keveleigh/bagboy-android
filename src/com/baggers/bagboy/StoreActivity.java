package com.baggers.bagboy;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StoreActivity extends Fragment {
	ArrayList<String> lists;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		lists = ListManager.loadStores();

		//TODO: figure out how to display all the loaded stores and make them clickable

		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.activity_store, container, false);
	}
}