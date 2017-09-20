package com.example.christianhernandez.votingapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        TextView helloWorld = (TextView) findViewById(R.id.helloWorld);
        final TextView email_textbox1 = (TextView) findViewById(R.id.email_textbox1);
        final TextView password_textbox1 = (TextView) findViewById(R.id.password_textbox1);
        final Button login_button1 = (Button) findViewById(R.id.login_button1);
        Button signup_button1 = (Button) findViewById(R.id.signup_button1);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(),"OxygenMono-Regular.ttf");
        helloWorld.setTypeface(font);
        email_textbox1.setTypeface(font);
        password_textbox1.setTypeface(font);
        login_button1.setTypeface(font);
        signup_button1.setTypeface(font);


        // Login button captures text inside of email_textbox and password_textbox
        login_button1.setOnClickListener(
                new View.OnClickListener()
                {

                    @Override
                    public void onClick(View v){
                        Log.v("Email EditText",email_textbox1.getText().toString());
                        Log.v("Password EditText",password_textbox1.getText().toString());
                    }
                }
        );


    }


    protected void OnStart(Bundle savedInstanceState) {
           ;
    }

    protected void OnResume(Bundle savedInstanceState){
        ;
    }

    protected void onPause(Bundle savedInstanceState) {
        ;
    }

    protected void onStop(Bundle savedInstanceState) {
        ;
    }

    protected void onDestroy(Bundle savedInstanceState) {
        ;
    }
}


