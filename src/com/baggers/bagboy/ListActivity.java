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
        //String [] arr = (String[]) ListManager.loadStores().toArray();
        Spinner spinner = (Spinner) findViewById(R.id.storeSpinner);
     // Create an ArrayAdapter using the string array and a default spinner layout
     ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, ListManager.loadStores());
     // Specify the layout to use when the list of choices appears
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     // Apply the adapter to the spinner
     spinner.setAdapter(adapter);
       
    }
    
}