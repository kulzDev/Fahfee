package com.example.fah_fee.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.fah_fee.LastStepActivity;
import com.example.fah_fee.R;
import com.example.fah_fee.model.BetTime;

import java.util.List;

public class BetTimeRecyclerAdapter extends RecyclerView.Adapter<BetTimeRecyclerAdapter.BetTimeViewHolder>{

    private Context mContext;
    private List<BetTime> mBetTimes;
    private  List<Number> mNumber;

    public BetTimeRecyclerAdapter( List<Number> mNumber) {
        //this.mContext = mContext;
        this.mNumber = mNumber;
    }

    public BetTimeRecyclerAdapter(Context mContext, List<BetTime> mBetTimes) {
        this.mContext = mContext;
        this.mBetTimes = mBetTimes;
    }

    @NonNull
    @Override
    public BetTimeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.time_bet_layout, viewGroup, false);
        return new BetTimeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BetTimeViewHolder betTimeViewHolder, final int i) {

        betTimeViewHolder.txt_cut_off.setText(mBetTimes.get(i).getCutOffTime());
        betTimeViewHolder.txt_bet_time.setText(mBetTimes.get(i).getBetTime().toString());

        betTimeViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String date = mBetTimes.get(i).getBetTime();

                Intent intent = new Intent(mContext, LastStepActivity.class);
                intent.putExtra("date",date);


                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mBetTimes.size();
    }

    public class BetTimeViewHolder extends RecyclerView.ViewHolder {

        private TextView txt_cut_off;
        private TextView txt_bet_time;

        public BetTimeViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_cut_off = (TextView)itemView.findViewById(R.id.txt_cutOffTime);
            txt_bet_time = (TextView)itemView.findViewById(R.id.txt_bet_time);
        }
    }

}
