package com.example.fah_fee.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fah_fee.R;
import com.example.fah_fee.model.BetTime;

import java.util.List;

public class DrawTimeRecyclerAdapter extends RecyclerView.Adapter<DrawTimeRecyclerAdapter.DrawTimeViewHolder> {

    private Context mContext;
    private List<BetTime> mBetTimes;

    public DrawTimeRecyclerAdapter(Context mContext, List<BetTime> mBetTimes) {
        this.mContext = mContext;
        this.mBetTimes = mBetTimes;
    }

    @NonNull
    @Override
    public DrawTimeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.time_bet_layout, viewGroup, false);
        return new DrawTimeRecyclerAdapter.DrawTimeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DrawTimeViewHolder drawTimeViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mBetTimes.size();
    }

    public class DrawTimeViewHolder extends RecyclerView.ViewHolder{

        private TextView txt_cut_off;
        private TextView txt_bet_time;

        public DrawTimeViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_cut_off = (TextView)itemView.findViewById(R.id.txt_cutOffTime);
            txt_bet_time = (TextView)itemView.findViewById(R.id.txt_bet_time);
        }
    }

}
