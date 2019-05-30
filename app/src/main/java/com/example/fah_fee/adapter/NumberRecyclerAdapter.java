package com.example.fah_fee.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fah_fee.PlaceBetActivity;
import com.example.fah_fee.R;
import com.example.fah_fee.model.PlayNumber;

import java.util.List;

public class NumberRecyclerAdapter extends RecyclerView.Adapter<NumberRecyclerAdapter.NumberViewHolder> {

    private Context mContext;
    List<PlayNumber> mdata;

    public NumberRecyclerAdapter(List<PlayNumber> mdata) {
        this.mdata = mdata;
    }

    public NumberRecyclerAdapter(Context mContext, List<PlayNumber> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //View view = LayoutInflater.from(mContext).inflate(R.layout.number, viewGroup, false);
        View v = LayoutInflater.from(mContext).inflate(R.layout.view, viewGroup, false);
        return new NumberViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final NumberViewHolder numberViewHolder, final int i) {

        numberViewHolder.dreamNumber.setImageResource(mdata.get(i).getImage());//TODO: error
        numberViewHolder.number.setText(mdata.get(i).getNumber());
        numberViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedNumber = mdata.get(i).getNumber();
                int images = mdata.get(i).getImage();
                String img = String.valueOf(images);

                Intent intent = new Intent(mContext, PlaceBetActivity.class);
                intent.putExtra("selectedNumber", selectedNumber);
                intent.putExtra("image", images);
                mContext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder {
        private CardView card_view;
        private ImageView dreamNumber;
        private TextView number;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);

            dreamNumber = (ImageView) itemView.findViewById(R.id.img);
            number = (TextView) itemView.findViewById(R.id.number);
            card_view = (CardView) itemView.findViewById(R.id.card);

        }
    }

}
