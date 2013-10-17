package com.baggers.bagboy;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StoreActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        // set default screen to login GUI
        setContentView(R.layout.activity_store);
        
        //loads all the list
        ArrayList<String> lists = ListManager.loadStores();
        
        //TODO: figure out how to display all the loaded stores and make them clickable

    }
    
}