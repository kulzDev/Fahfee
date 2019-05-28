package com.example.fah_fee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

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


    }
}
