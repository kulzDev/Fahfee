package com.example.fah_fee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditProfilePageActivity extends AppCompatActivity {

    EditText mFirstName, mLastName, mPhoneNum, mIDNum, mEmail,mPin, mAddress, mCity
            , mPinConfirm;
    Button btn_submit, btn_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_page);

        btn_submit = (Button)findViewById(R.id.submitBtn);
        btn_cancel = (Button)findViewById(R.id.cancelBtn);

        mFirstName = (EditText)findViewById(R.id.inputFirstName);
        mLastName = (EditText)findViewById(R.id.inputSurname);
        mPhoneNum = (EditText)findViewById(R.id.inputPhone);
        mIDNum = (EditText)findViewById(R.id.inputId);
        mEmail = (EditText)findViewById(R.id.inputEmail);
        mAddress = (EditText)findViewById(R.id.input_address);
        mCity = (EditText)findViewById(R.id.inputPin);
        mPinConfirm = (EditText)findViewById(R.id.input_confirmPin);
    }
}
