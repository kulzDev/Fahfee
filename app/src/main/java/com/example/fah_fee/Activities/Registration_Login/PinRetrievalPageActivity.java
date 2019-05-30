package com.example.fah_fee.Activities.Registration_Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.fah_fee.R;

public class PinRetrievalPageActivity extends AppCompatActivity {

    EditText mMobileNum;
    EditText mPin;
    Button btn_sendPin;
    Button btn_register, btn_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_retrieval_page);

        mMobileNum = (EditText)findViewById(R.id.txtPhone);
        mPin = (EditText)findViewById(R.id.txtPin);

        btn_sendPin = (Button)findViewById(R.id.send_pin_Btn);
        btn_register = (Button)findViewById(R.id.registerBtn);
        btn_cancel = (Button)findViewById(R.id.cancelBtn);
    }
}
