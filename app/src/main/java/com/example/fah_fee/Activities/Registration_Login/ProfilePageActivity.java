package com.example.fah_fee.Activities.Registration_Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fah_fee.EditProfilePageActivity;
import com.example.fah_fee.R;

public class ProfilePageActivity extends AppCompatActivity {

    Button edit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        edit_btn = (Button) findViewById(R.id.editBtn);
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilePageActivity.this, EditProfilePageActivity.class);
                startActivity(intent);
            }
        });
    }
}
