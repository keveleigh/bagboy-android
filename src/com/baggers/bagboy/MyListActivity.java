package com.baggers.bagboy;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemLongClickListener;

public class MyListActivity extends Fragment {
	ArrayList<String> lists;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//loads all the lists
		lists = ListManager.loadLists();
		
		View V = inflater.inflate(R.layout.activity_mylist, container, false);
		final ListView listList = (ListView) V.findViewById(R.id.listList);
       
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String> (getActivity(), android.R.layout.simple_list_item_1, lists);
        		 
        listList.setAdapter(listAdapter); 
        listList.setLongClickable(true);
        
        listList.setOnItemLongClickListener(new OnItemLongClickListener() {
        
			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				
				System.out.println("item " + listList.getAdapter().getItem(arg2).toString());
				ListManager.deleteFromList(listList.getAdapter().getItem(arg2).toString());
				listList.invalidateViews();
				return false;
			}
        	
        });
		

		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.activity_mylist, container, false);
	}
}