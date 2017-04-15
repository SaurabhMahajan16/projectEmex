package com.example.saurabh.uipractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * login activity class
 */
public class LoginActivity extends AppCompatActivity {
    private TextView tvForgot, tvSignUp;
    private Button btnLogin;
    private EditText etEmail, etPassword;
    private String email, password;
    private Intent intent;


    /**
     * works on creation of an app
     */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int check = 0;
                email = etEmail.getText().toString();
                if (!(android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())) {
                    Toast.makeText(getApplicationContext(), "Enter correct email id", Toast.
                            LENGTH_SHORT).show();
                    check = 1;
                }
                password = etPassword.getText().toString().trim();
                if (password.length() < 6 && password.length() > 24 && check == 0) {
                    Toast.makeText(LoginActivity.this, "type password correctly", Toast.
                            LENGTH_SHORT).show();
                    check = 1;
                }
                if (check == 0) {
                    intent = new Intent(LoginActivity.this, NavDrawerActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        tvForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(LoginActivity.this, ForgotActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * find all ids of views
     */
    public void init() {
        tvForgot = (TextView) findViewById(R.id.tv_frgt);
        tvSignUp = (TextView) findViewById(R.id.tv_signUp);
        btnLogin = (Button) findViewById(R.id.btn_login);
        etEmail = (EditText) findViewById(R.id.et_email);
        etPassword = (EditText) findViewById(R.id.et_password);

    }
}
