package com.baggers.bagboy;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EndActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
	
        super.onCreate(savedInstanceState);
        
        // set default screen to login GUI
        setContentView(R.layout.activity_end);

	    // Sets up action bar back button
	    ActionBar actionBar = this.getActionBar();
	    actionBar.setDisplayHomeAsUpEnabled(true);
	    
	    Button retHomeBtn = (Button) findViewById(R.id.retHomeBtn);
	    retHomeBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(EndActivity.this, HomeActivity.class);
				startActivity(i);
			}
	    	
	    });
       
    }
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent i = new Intent(getApplicationContext(), RouteActivity.class);
	    startActivityForResult(i, 0);
	    return true;
	}
    
}