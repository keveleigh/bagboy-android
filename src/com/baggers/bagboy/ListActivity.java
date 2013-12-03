package com.baggers.bagboy;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;

public class ListActivity extends Activity{
	Spinner spinner1;
	Spinner spinner2;
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        // set default screen to login GUI
        setContentView(R.layout.activity_list);
        
        // Sets up action bar back button
        ActionBar actionBar = this.getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        
        // Checkbox functionality
        CheckBox coldCheck = (CheckBox) findViewById(R.id.coldCheck);
        
        coldCheck.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
        	
		});
        
        Button routeButton = (Button) findViewById(R.id.routeButton);
        
        routeButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(ListActivity.this, RouteActivity.class);
            	startActivity(i); 
			}
        	
        });
        
        
        //sets up all the drop downs with values that are set in the activities from home 
        //http://developer.android.com/guide/topics/ui/controls/spinner.html
        Spinner spinner = (Spinner) findViewById(R.id.storeSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadStores());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        
        //set the spinner to the value of the current store 
        spinner.setSelection(adapter.getPosition(ListManager.currStore));
        
        spinner1 = (Spinner) findViewById(R.id.categorySpinner);
        spinner2 = (Spinner) findViewById(R.id.itemSpinner);
        
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadCategories());
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        ListManager.currCategory = spinner1.getSelectedItem().toString();
        
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadItemsFromCategory(ListManager.currCategory));
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);    
        
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            	ListManager.currCategory = spinner1.getSelectedItem().toString();
            	refreshSpinner2();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                ListManager.currCategory = "";
            }
        });  

        //TODO: make spinners update content based on other spinners
        
        // Populate item list view
        final ListView itemList = (ListView) findViewById(R.id.itemList);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, ListManager.loadItemsFromList());
        itemList.setAdapter(listAdapter); 
        itemList.setLongClickable(true);
        
        itemList.setOnItemLongClickListener(new OnItemLongClickListener() {
        
			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				
				System.out.println("item " + itemList.getAdapter().getItem(arg2).toString());
				ListManager.deleteFromList(itemList.getAdapter().getItem(arg2).toString());
				itemList.invalidateViews();
				return false;
			}
        	
        });
        
        Button addButton = (Button) findViewById(R.id.addToListButton);
        addButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				ListManager.addToList(spinner2.getSelectedItem().toString());
				itemList.invalidateViews();
			}
        	
        });
    }

    /*
     * Sets which activity the title bar back button goes to
     */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_save:
	            // Input save list logic here
	        	
	            return true;
	        default:
	        	// Else, back button was pressed, change activity
	        	Intent it = new Intent(getApplicationContext(), HomeActivity.class);
	    	    startActivityForResult(it, 0);
	            return true;
	    }
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu items for use in the action bar
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.listactivity_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	public void refreshSpinner2() {  
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadItemsFromCategory(ListManager.currCategory));
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);    
	}    
}