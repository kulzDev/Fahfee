package com.example.fah_fee.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fah_fee.R;
import com.example.fah_fee.model.PlayedNumbers;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NumbersPlayedRecyclerAdapter extends RecyclerView.Adapter<NumbersPlayedRecyclerAdapter.NumberPlayedViewHolder> {

    Context mContext;
    private List<PlayedNumbers> playedNumbers;

    public NumbersPlayedRecyclerAdapter(Context mContext, List<PlayedNumbers> playedNumbers) {
        this.mContext = mContext;
        this.playedNumbers = playedNumbers;
    }

    @NonNull
    @Override
    public NumberPlayedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.previous_number, viewGroup, false);
        return new NumbersPlayedRecyclerAdapter.NumberPlayedViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberPlayedViewHolder numberPlayedViewHolder, int i) {

        numberPlayedViewHolder.played_number_img.setImageResource(playedNumbers.get(i).getImage());
        numberPlayedViewHolder.played_number_txt.setText(playedNumbers.get(i).getNumberPlayedPrevious());
        numberPlayedViewHolder.date_played_txt.setText(playedNumbers.get(i).getDate());
        numberPlayedViewHolder.draw_time_txt.setText(playedNumbers.get(i).getDrawTime());
        numberPlayedViewHolder.bet_status_txt.setText(playedNumbers.get(i).getPlayStatus().toString());

    }

    @Override
    public int getItemCount() {
        return playedNumbers.size();
    }

    public class NumberPlayedViewHolder extends RecyclerView.ViewHolder {

        CircleImageView played_number_img;
        TextView played_number_txt;
        TextView date_played_txt, draw_time_txt, bet_status_txt;

        public NumberPlayedViewHolder(@NonNull View itemView) {
            super(itemView);
            played_number_img = (CircleImageView) itemView.findViewById(R.id.played_number_img);
            played_number_txt = (TextView) itemView.findViewById(R.id.played_number_txt);
            date_played_txt = (TextView)itemView.findViewById(R.id.date_text);
            draw_time_txt = (TextView)itemView.findViewById(R.id.draw_text);
            bet_status_txt = (TextView)itemView.findViewById(R.id.bet_status_text);

        }


    }

}
