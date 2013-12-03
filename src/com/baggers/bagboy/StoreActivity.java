package com.baggers.bagboy;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class StoreActivity extends Fragment {
	ArrayList<String> lists;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		lists = ListManager.loadStores();
		
		//TODO: figure out how to display all the loaded stores and make them clickable
		View view = inflater.inflate(R.layout.activity_store, container, false);
		
		Button krogerBtn = (Button) view.findViewById(R.id.krogerButton);
		krogerBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				ListManager.currStore = "Kroger";
				Intent i = new Intent((HomeActivity)getActivity(), ListActivity.class);
            	getActivity().startActivity(i); 
			}
			
		});

		Button publixBtn = (Button) view.findViewById(R.id.publixButton);
		publixBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				ListManager.currStore = "Publix";
				Intent i = new Intent((HomeActivity)getActivity(), ListActivity.class);
            	getActivity().startActivity(i); 
			}
			
		});
		
		Button targetBtn = (Button) view.findViewById(R.id.targetButton);
		targetBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				ListManager.currStore = "Super Target";
				Intent i = new Intent((HomeActivity)getActivity(), ListActivity.class);
            	getActivity().startActivity(i); 
			}
			
		});
		
		Button walmartBtn = (Button) view.findViewById(R.id.walmartButton);
		walmartBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				ListManager.currStore = "Walmart Supercenter";
				Intent i = new Intent((HomeActivity)getActivity(), ListActivity.class);
            	getActivity().startActivity(i); 
			}
			
		});
		
		// Inflate the layout for this fragment
		return view;
	}
}