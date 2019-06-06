package com.example.fah_fee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.fah_fee.adapter.BetTimeRecyclerAdapter;
import com.example.fah_fee.model.BetTime;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class BetTimeActivity extends AppCompatActivity {

    private CircleImageView betImage;
    private TextView betNumber;
    private TextView betPrice;
    private RecyclerView bet_time_rw;
    private BetTimeRecyclerAdapter betTimeRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bet_time);

        betImage = (CircleImageView)findViewById(R.id.image_view02);
        betNumber = (TextView)findViewById(R.id.betNumber0);
        betPrice = (TextView)findViewById(R.id.bet_Price);
        bet_time_rw = (RecyclerView)findViewById(R.id.bet_time_rv);

        Intent intent = getIntent();
//
        betImage.setImageResource(intent.getIntExtra("image",0));
        betNumber.setText(intent.getStringExtra("betNum"));
        betPrice.setText(intent.getStringExtra("prices"));
        //betPrice.setText((int) intent.getFloatExtra("priceList",0f));//TODO: error

        //Recycler View
        betTimeRecyclerAdapter = new BetTimeRecyclerAdapter(this, betTimes());
        bet_time_rw.setLayoutManager(new GridLayoutManager(this, 1));
        bet_time_rw.setItemAnimator(new DefaultItemAnimator());
        bet_time_rw.setAdapter(betTimeRecyclerAdapter);
    }

    private ArrayList<BetTime> betTimes(){
        ArrayList<BetTime> bet = new ArrayList<>();
        bet.add(new BetTime("Cut off time \n\t 12:45","13:00"));
        bet.add(new BetTime("Cut off time \n\t 17:45","18:00"));
        return  bet;
    }
}
