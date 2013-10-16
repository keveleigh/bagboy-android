package com.baggers.bagboy;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        // set default screen to login GUI
        setContentView(R.layout.activity_register);
        
        Button registerButton = (Button) findViewById(R.id.registerButton);
        
        //Sets listener for login button. 
        registerButton.setOnClickListener(
	           
        		new View.OnClickListener() {
	                
	                
                private String username;
                private String password;
                private String passwordConfirm;

                public void onClick(View v) {
                	
                        EditText usernameEdit = (EditText)findViewById(R.id.username);
                        EditText passwordEdit = (EditText)findViewById(R.id.password);
                        EditText passwordConfirmEdit = (EditText)findViewById(R.id.passwordConfirm);
                        
                        username = usernameEdit.getText().toString();
                        password = passwordEdit.getText().toString();
                        passwordConfirm = passwordConfirmEdit.getText().toString();
                        
                        //options the user has from this point
                        //1. invalid user name/password
                        //2. correct user name/password in which case it goes to the home screen 
                        
                        //check userID and password
                        if (LoginManager.registerUser(username, password, passwordConfirm)) {
	                        Intent i = new Intent(RegisterActivity.this, HomeActivity.class);
	                    	startActivity(i); 
                        }
                        else {
                        	//message stating something went wrong 
                        }
              
                }
        		});
        
  
    }
    
}