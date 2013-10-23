package com.baggers.bagboy;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class RouteActivity extends FragmentActivity {
	MyPageAdapter pageAdapter;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		// set default screen to login GUI
		setContentView(R.layout.activity_route);

		// Sets up action bar back button
		ActionBar actionBar = this.getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);

		List<Fragment> fragments = getFragments();
		pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragments);
		ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
		pager.setAdapter(pageAdapter);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent myIntent = new Intent(getApplicationContext(), ListActivity.class);
		startActivityForResult(myIntent, 0);
		return true;
	}

	private List<Fragment> getFragments() {
		List<Fragment> fList = new ArrayList<Fragment>();

		//create the fragments we want to use for display content
		Fragment MapFragment = new RouteMapFragment();
		Fragment ListFragment = new RouteListFragment();

		fList.add(MapFragment);
		fList.add(ListFragment);

		return fList;
	}

	private class MyPageAdapter extends FragmentPagerAdapter {

		private List<Fragment> fragments;

		public MyPageAdapter(FragmentManager fm, List<Fragment> fragments) {
			super(fm);

			this.fragments = fragments;
		}

		@Override
		public Fragment getItem(int position) {
			return this.fragments.get(position);
		}

		@Override
		public int getCount() {
			return this.fragments.size();
		}

		@Override
		public CharSequence getPageTitle(int position) {
			String tabTitle;
			switch(position) {
			case 0:
				tabTitle = "Map";
				break;
			case 1:
				tabTitle = "List";
				break;
			default:
				tabTitle = "Default";
				break;
			}
			return tabTitle;
		}
	}
}