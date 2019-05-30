package com.example.fah_fee.Activities.Registration_Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.fah_fee.HomePageActivity;
import com.example.fah_fee.R;

public class LoginActivity extends AppCompatActivity {

    private ImageView mLogo;
    private EditText mPhone, mPin;
    private Button mLogin, mForgotPin, mCancel_button, mRegister_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLogo = findViewById(R.id.logo);
        mPhone = findViewById(R.id.txtPhone);
        mPin = findViewById(R.id.txtPin);
        mLogin = findViewById(R.id.loginBtn);
        mForgotPin = findViewById(R.id.forgotPinBtn);
        mCancel_button =  findViewById(R.id.cancelBtn);
        mRegister_button =  findViewById(R.id.registerBtn);

        //events

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });

        mRegister_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intent);
            }
        });

        mForgotPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,PinRetrievalPageActivity.class);
                startActivity(intent);
            }
        });

    }
}
