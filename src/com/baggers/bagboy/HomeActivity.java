package com.baggers.bagboy;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        // set default screen to login GUI
        setContentView(R.layout.activity_home);
        
        //need to figure out what buttons go on the home screen 
        Button createList = (Button) findViewById(R.id.createList);
        
        createList.setOnClickListener(
        		new OnClickListener() {
        			
        			public void onClick(View v) {
        				Intent i = new Intent(HomeActivity.this, ListActivity.class);
                    	startActivity(i); 
        			}    			

    	});
    }
    
}