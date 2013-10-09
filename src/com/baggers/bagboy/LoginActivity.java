package com.baggers.bagboy;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity{
        
        /**
         * OnCreate takes in a Bundle and determines what is presented when the 
         * login screen is initially created.
         * 
         * @param Bundle savedInstanceState
         */
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                // set default screen to login GUI
                setContentView(R.layout.activity_login);

                
                TextView registerScreen = (TextView) findViewById(R.id.link_to_register);
                final TextView loginFeedbackMessage = (TextView)findViewById(R.id.loginFeedback);
                
                Button loginButton = (Button)findViewById(R.id.loginButton);
                
                //Sets listener for login button. 
                loginButton.setOnClickListener(
                                new View.OnClickListener() {
                                        
                                        
                                        private String username;
                                        private String password;
                                        /**
                                         * This method determines what is done upon click on the
                                         * Login button. The username and password are both tested
                                         * to determine whther an account matches that data.
                                         * 
                                         * @param View v
                                         */
                                        public void onClick(View v) {
                                                EditText usernameEdit = (EditText)findViewById(R.id.username);
                                                EditText passwordEdit = (EditText)findViewById(R.id.password);
                                                
                                                username = usernameEdit.getText().toString();
                                                password = passwordEdit.getText().toString();
                                                
                                              /*  int response = MasterControlProgram.login(username, password);
                                                
                                                if(response==0){
                                                        loginFeedbackMessage.setText("Login Successful!");
                                                        //Link to Home
                                                        Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                                                        startActivity(i);
                                                }
                                                else if(response==1){
                                                        loginFeedbackMessage.setText("Incorrect Password");
                                                }
                                                else if(response==2){
                                                        loginFeedbackMessage.setText("Incorrect Username");
                                                }
                                                else{
                                                        loginFeedbackMessage.setText("Invalid Login Attempt");
                                                }*/
                                                }
                                        });
                
                //Listener for register link
                registerScreen.setOnClickListener(new View.OnClickListener() {
                        
                        /**
                         * This method switches the screen to the register screen if the
                         * user decides to create a new ToDone account.
                         * 
                         * @param View v
                         */
                        public void onClick(View v) {

                                
                                
                        }
                });
        }
        
}