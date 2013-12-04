package com.baggers.bagboy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RouteListFragment extends Fragment {
	ArrayList<String> itemsList;

	@SuppressWarnings("unchecked")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View V = inflater.inflate(R.layout.fragment_route_list, container, false);
		
		//loads all the lists
		itemsList = ListManager.loadItemsFromList();
		itemsList = (ArrayList<String>) itemsList.clone();
		Collections.sort(itemsList, new CustomComparator());
		
		ArrayList<ListItem> listItemItemsList = new ArrayList<ListItem>();
		for (String s : itemsList)
		{
			listItemItemsList.add(new ListItem(s));
		}

        ArrayAdapter<ListItem> adapter = new ArrayAdapter<ListItem>(getActivity(), android.R.layout.simple_list_item_1, listItemItemsList);
		
		ListView itemsList = (ListView) V.findViewById(R.id.itemslist);
		itemsList.setBackgroundColor(Color.rgb(211, 211, 211));
		itemsList.setAdapter(adapter);
		
		// Return the layout for this fragment
		return V;
	}
	
	public class CustomComparator implements Comparator<String> {
		@Override
		public int compare(String lhs, String rhs) {
			return ((Integer)(ListManager.loadAislesFromProductName(lhs))).compareTo(((Integer)(ListManager.loadAislesFromProductName(rhs))));
		}
	}
}