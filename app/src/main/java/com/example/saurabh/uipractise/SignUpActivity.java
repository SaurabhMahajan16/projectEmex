package com.example.saurabh.uipractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * sign up class in which signUp form is filled
 */
public class SignUpActivity extends AppCompatActivity {
    private TextView tvConditions, tvToolbar;
    private EditText etfname, etlName, etContactNo, etContactName, etPass, etConfirmPass;
    private ImageButton imgCheck, imgbtnBack;
    private Button btnSignUp;
    private Intent intent;
    private boolean isPressed = false;
    /**
     * on start of an activity
     *
     * @param savedInstanceState bun dle type
     */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        String accept = "I accept";
        String terms = " Terms of Service";
        String privacy = "Privacy Policy ";
        init();
        String sourceString = accept + "<b>" + "<u>" + terms + "</u>" + "</b> " + " and " + "<b>"
                + "<u>" + privacy + "</u>" + "</b> ";
        tvConditions.setText(Html.fromHtml(sourceString));
        tvToolbar.setText(R.string.SignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SignUpActivity.this, NavDrawerActivity.class);
                startActivity(intent);
            }
        });
        imgbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        imgCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPressed)
                    imgCheck.setBackgroundResource(R.drawable.btn_accepted_terms);
                else
                    imgCheck.setBackgroundResource(R.drawable.btn_accepted_terms_normal);

                isPressed = !isPressed;
            }
        });

    }

    /**
     * for getting all ids
     */
    public void init() {
        tvConditions = (TextView) findViewById(R.id.tv_conditions);
        tvToolbar = (TextView) findViewById(R.id.tv_title);
        etfname = (EditText)  findViewById(R.id.et_fName);
        etlName = (EditText) findViewById(R.id.et_lName);
        etConfirmPass = (EditText) findViewById(R.id.et_confirmpassword);
        etContactName = (EditText) findViewById(R.id.et_contact_name);
        etContactNo = (EditText) findViewById(R.id.et_contact_no);
        etPass = (EditText) findViewById(R.id.et_password);
        btnSignUp = (Button) findViewById(R.id.btn_signUp);
        imgbtnBack = (ImageButton) findViewById(R.id.ib_back);
        imgCheck = (ImageButton) findViewById(R.id.imgBtn_check);
    }

}
