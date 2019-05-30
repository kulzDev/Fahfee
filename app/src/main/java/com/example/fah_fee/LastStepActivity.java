package com.example.fah_fee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class LastStepActivity extends AppCompatActivity {


    CircleImageView mBetNumImage;
    TextView betDate, betNumber, betPrice, success_msg;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_step);

        mBetNumImage = (CircleImageView) findViewById(R.id.final_image);
        success_msg = (TextView) findViewById(R.id.set_off_msg);
        success_msg.setText("Your bet has been placed!" +
                "\n" + "Thank you for playing");
        betDate = (TextView) findViewById(R.id.date);
        betNumber = (TextView) findViewById(R.id.bet_number);
        betPrice = (TextView) findViewById(R.id.bet_pricee);
        cardView = (CardView) findViewById(R.id.carddd);

        Intent intent = getIntent();
        betDate.setText("Bet time: " + intent.getStringExtra("date"));

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), HomePageActivity.class);
                startActivity(intent1);
            }
        });

    }
}
