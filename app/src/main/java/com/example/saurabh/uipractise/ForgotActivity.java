package com.example.saurabh.uipractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * this screen forgot password is there and input of contact on this
 * screen
 */
public class ForgotActivity extends AppCompatActivity {
    private TextView tvToolbar;
    private Button btnContinue;
    private EditText etContact;
    private Intent intent;
    private ImageButton imgbtnBack;
    /**
     * starts on creation of an activity
     * @param savedInstanceState it is of type bundle which holds the data
     */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        init();
        tvToolbar.setText(R.string.tv_forgotPass);
        btnContinue.setOnClickListener(new View.OnClickListener() {

            /**
             * function runs on click of abutton and action perform on click is written here
             * @param v view type
             */
            @Override
            public void onClick(final View v) {
                String contact = etContact.getText().toString();
                if (contact.isEmpty()) {
                    Toast.makeText(ForgotActivity.this, "Enter correct contact number",
                            Toast.LENGTH_SHORT).show();
                }
            else {
                    intent = new Intent(getApplicationContext(),ResetPassActivity.class);
                    startActivity(intent);
                }
            }
        });

        imgbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    /**
     * find all ids
     */
    public void init(){
        tvToolbar = (TextView) findViewById(R.id.tv_title);
        btnContinue = (Button) findViewById(R.id.btn_continue);
        etContact = (EditText) findViewById(R.id.et_contact);
        imgbtnBack = (ImageButton) findViewById(R.id.ib_back);
    }
}
