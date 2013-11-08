package com.baggers.bagboy;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EndActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
	
        super.onCreate(savedInstanceState);
        
//        if (android.os.Build.VERSION.SDK_INT >= 9) {
//    		System.out.println("Hi");
//    		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//    		StrictMode.setThreadPolicy(policy);
//    	}
        
        // Removes title bar - must keep ABOVE setContentView
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        // set default screen to login GUI
        setContentView(R.layout.activity_end);

       
    }
    
}