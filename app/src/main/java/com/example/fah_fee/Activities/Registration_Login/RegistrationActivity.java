package com.example.fah_fee.Activities.Registration_Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fah_fee.HomePageActivity;
import com.example.fah_fee.R;

public class RegistrationActivity extends AppCompatActivity {

    EditText mFirstName;
    EditText mLastName;
    EditText mMobileNum;
    EditText mIdNum;
    EditText mEmail;
    EditText mPin, mPinConfirm;
    Button btn_Register, btn_Cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mFirstName = (EditText)findViewById(R.id.inputFirstName);
        mLastName = (EditText)findViewById(R.id.inputSurname);
        mMobileNum = (EditText)findViewById(R.id.inputPhone);
        mIdNum = (EditText)findViewById(R.id.inputId);
        mEmail = (EditText)findViewById(R.id.inputEmail);
        mPin = (EditText)findViewById(R.id.inputPin);
        mPinConfirm = (EditText)findViewById(R.id.input_confirmPin);

        btn_Register = (Button)findViewById(R.id.registerBtn);
        btn_Cancel = (Button)findViewById(R.id.cancelBtn);

        //Events
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });


    }
}
