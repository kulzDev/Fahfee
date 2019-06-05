package com.example.fah_fee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {

    GridLayout menuGrid;
    Button play_btn;

    //GridLayout Buttons
    Button profile_btn, numbers_btn, draw_times_btn, wallet_btn, how_to_btn, contact_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        play_btn = (Button) findViewById(R.id.btn_play);
        menuGrid = (GridLayout) findViewById(R.id.grid);
        profile_btn = (Button)findViewById(R.id.profile_btn);
        numbers_btn = (Button)findViewById(R.id.numbers_btn);
        draw_times_btn = (Button)findViewById(R.id.draw_times_btn);
        wallet_btn = (Button)findViewById(R.id.wallet_btn);
        how_to_btn = (Button)findViewById(R.id.how_to_btn);
        contact_btn = (Button)findViewById(R.id.contact_btn);


        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        menuItems();



//        menuGrid.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()){
//                    case R.id.profile_btn:
//                        Intent profile = new Intent(HomePageActivity.this,EditProfilePageActivity.class);
//                        startActivity(profile);
//                        break;
//                    case R.id.numbers_btn:
//                        Intent numbers = new Intent(HomePageActivity.this, EditProfilePageActivity.class);
//                        startActivity(numbers);
//                        break;
//                    case R.id.draw_times_btn:
//                        Intent draw = new Intent(HomePageActivity.this, DrawTimeActivity.class);
//                        startActivity(draw);
//                        break;
//                    case  R.id.wallet_btn:
//                        Intent wallet = new Intent(HomePageActivity.this, WalletActivity.class);
//                        startActivity(wallet);
//                        break;
//                    case R.id.how_to_btn:
//                        Intent howTo = new Intent(HomePageActivity.this, HowToActivity.class);
//                        startActivity(howTo);
//                        break;
//                    case R.id.contact_btn:
//                        Intent contact = new Intent(HomePageActivity.this, ContactActivity.class);
//                        startActivity(contact);
//                        break;
//                }
//            }
//        });
    }

    public void menuItems(){
        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(HomePageActivity.this,EditProfilePageActivity.class);
                startActivity(profile);
            }
        });

        numbers_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers = new Intent(HomePageActivity.this, NumbersActivity.class);
                startActivity(numbers);
            }
        });
        draw_times_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent draw = new Intent(HomePageActivity.this, DrawTimeActivity.class);
                startActivity(draw);
            }
        });
        wallet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wallet = new Intent(HomePageActivity.this, WalletActivity.class);
                startActivity(wallet);
            }
        });
        how_to_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent howTo = new Intent(HomePageActivity.this, HowToActivity.class);
                startActivity(howTo);
            }
        });

        contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HomePageActivity.this, ContactActivity.class);
                startActivity(contact);
            }
        });
    }
}
