package com.baggers.bagboy;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class HomeActivity extends FragmentActivity {
	MyPageAdapter pageAdapter;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		// Removes title bar - must keep ABOVE setContentView
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		// set default screen to login GUI
		setContentView(R.layout.activity_home);

		Button createList = (Button) findViewById(R.id.createList);

		createList.setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						
						
						Intent i = new Intent(HomeActivity.this, ListActivity.class);
						startActivity(i);
					}
				});

		List<Fragment> fragments = getFragments();
		pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragments);
		ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
		pager.setAdapter(pageAdapter);
	}

	private List<Fragment> getFragments() {
		List<Fragment> fList = new ArrayList<Fragment>();

		//create the fragments we want to use for display content
		Fragment StoreFragment = new StoreActivity();
		Fragment MapFragment = new MapActivity();
		Fragment MyListFragment = new MyListActivity();

		fList.add(StoreFragment);
		fList.add(MapFragment);
		fList.add(MyListFragment);

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
				tabTitle = "Stores";
				break;
			case 1:
				tabTitle = "Map";
				break;
			case 2:
				tabTitle = "Lists";
				break;
			default:
				tabTitle = "Default";
				break;
			}
			return tabTitle;
		}
	}
}