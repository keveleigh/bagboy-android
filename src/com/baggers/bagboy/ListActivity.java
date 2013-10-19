package com.baggers.bagboy;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

public class ListActivity extends Activity{

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
        
        //sets up all the drop downs with values that are set in the activities from home 
        //http://developer.android.com/guide/topics/ui/controls/spinner.html
        Spinner spinner = (Spinner) findViewById(R.id.storeSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadStores());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        
        Spinner spinner1 = (Spinner) findViewById(R.id.categorySpinner);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadCategories());
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        
        Spinner spinner2 = (Spinner) findViewById(R.id.itemSpinner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadItemsFromCategory(ListManager.currCategory));
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        
        //TODO: make spinners update content based on other spinners
       
    }

    /*
     * Sets which activity the title bar back button goes to
     */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent myIntent = new Intent(getApplicationContext(), HomeActivity.class);
	    startActivityForResult(myIntent, 0);
	    return true;
	}
    
}