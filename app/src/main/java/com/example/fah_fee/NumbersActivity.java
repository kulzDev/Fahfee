package com.example.fah_fee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.fah_fee.adapter.NumbersPlayedRecyclerAdapter;
import com.example.fah_fee.model.PlayedNumbers;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
//fetch played numbers from Firebase database

    RecyclerView playedNumber_rw;
    private NumbersPlayedRecyclerAdapter playedNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        playedNumber_rw = (RecyclerView) findViewById(R.id.number_played_rv);

        playedNumbers = new NumbersPlayedRecyclerAdapter(this, playedPreviously()); //TODO: Create corret constructor

        playedNumber_rw.setLayoutManager(new GridLayoutManager(this, 1));
        playedNumber_rw.setItemAnimator(new DefaultItemAnimator());
        playedNumber_rw.setAdapter(playedNumbers);
    }

    private ArrayList<PlayedNumbers> playedPreviously() {
        //TODO: use a Firebase RecyclerView
        ArrayList<PlayedNumbers> played = new ArrayList<>();
        //    public PlayedNumbers(int image, String date, String numberPlayedPrevious, Boolean playStatus, String drawTime) {
        played.add(new PlayedNumbers(R.drawable.big_water, "06/06/2019", "Big Water", true, "13:00"));

        return played;
    }

}
