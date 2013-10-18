package com.baggers.bagboy;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ListActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        // set default screen to login GUI
        setContentView(R.layout.activity_list);
        
       //sets up all the drop downs with values that are set in the activities from home 
        //http://developer.android.com/guide/topics/ui/controls/spinner.html
        Spinner spinner = (Spinner) findViewById(R.id.storeSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadStores());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        
        Spinner spinner1 = (Spinner) findViewById(R.id.categorySpinner);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadCategories());
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        
        Spinner spinner2 = (Spinner) findViewById(R.id.itemSpinner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadItems(ListManager.currCategory));
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter2);
       
    }
    
}