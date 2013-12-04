package com.baggers.bagboy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RouteMapFragment extends Fragment {

	private Context cxt;
	ArrayList<String> itemsList;

	@SuppressWarnings("unchecked")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View V = inflater
				.inflate(R.layout.fragment_route_map, container, false);

		// loads all the lists
		itemsList = ListManager.loadItemsFromList();
		itemsList = (ArrayList<String>) itemsList.clone();
		Collections.sort(itemsList, new CustomComparator());

		cxt = getActivity();

		MyListAdapter itemsListAdapter = new MyListAdapter();
		ViewPager itemsPager = (ViewPager) V.findViewById(R.id.itemspager);
		itemsPager.setAdapter(itemsListAdapter);

		// Return the layout for this fragment
		return V;
	}

	private class MyListAdapter extends PagerAdapter {
		@Override
		public Object instantiateItem(ViewGroup collection, int position) {
			TextView tv = new TextView(cxt);
			tv.setText("     " + itemsList.get(position) + "   -   Aisle " + ListManager.loadAislesFromProductName(itemsList.get(position)));
			tv.setTextColor(Color.BLACK);
			tv.setTextSize(20);
			tv.setBackgroundColor(Color.rgb(211, 211, 211));
			tv.setGravity(Gravity.CENTER_VERTICAL);
			collection.addView(tv, 0);

			return tv;
		}

		@Override
		public void destroyItem(ViewGroup collection, int position, Object view) {
			collection.removeView((TextView) view);
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return (view == object);
		}

		@Override
		public int getCount() {
			return itemsList.size();
		}
	}
	
	public class CustomComparator implements Comparator<String> {
		@Override
		public int compare(String lhs, String rhs) {
			return ((Integer)(ListManager.loadAislesFromProductName(lhs))).compareTo(((Integer)(ListManager.loadAislesFromProductName(rhs))));
		}
	}
}