package com.example.fah_fee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.fah_fee.adapter.DrawTimeRecyclerAdapter;
import com.example.fah_fee.model.BetTime;

import java.util.ArrayList;

public class DrawTimeActivity extends AppCompatActivity {

    RecyclerView drawTimes_rv;
    private DrawTimeRecyclerAdapter drawTimeRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_time);
        drawTimes_rv = (RecyclerView)findViewById(R.id.draw_time_rv);

        drawTimeRecyclerAdapter = new DrawTimeRecyclerAdapter(this, betTimes());
        drawTimes_rv.setLayoutManager(new GridLayoutManager(this, 1));
        drawTimes_rv.setItemAnimator(new DefaultItemAnimator());
        drawTimes_rv.setAdapter(drawTimeRecyclerAdapter);

    }

    private ArrayList<BetTime> betTimes(){
        ArrayList<BetTime> bet = new ArrayList<>();
        bet.add(new BetTime("Cut off time \n\t 12:45","13:00"));
        bet.add(new BetTime("Cut off time \n\t 17:45","18:00"));
        return  bet;
    }

}
