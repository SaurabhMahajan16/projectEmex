package com.example.saurabh.uipractise;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * this class is login
 */
public class MainActivity extends AppCompatActivity {
    private final int DELAY = 2000;
    private Button btnLogin, btnSignUp;
    private Intent intent;

    /**
     * this on create function
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                btnLogin.setVisibility(View.VISIBLE);
                btnSignUp.setVisibility(View.VISIBLE);

            }
        }, DELAY);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            /**
             * it works on clicking login button
             * @param v view
             */
            @Override
            public void onClick(View v) {
                 intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();

            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            /**
             * on click of signup
             * @param v view
             */
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    /**
     * find ids of all elements
     */
    public void init(){
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnSignUp = (Button) findViewById(R.id.btn_signUp);
    }

    }

