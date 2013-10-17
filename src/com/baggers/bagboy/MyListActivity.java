package com.baggers.bagboy;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;

public class MyListActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        // set default screen to login GUI
        setContentView(R.layout.activity_mylist);
        
        //loads all the list
        ArrayList<String> lists = ListManager.loadLists();
        
        //TODO: figure out how to display all the loaded lists and make them clickable
    }
    
}