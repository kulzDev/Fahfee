package com.example.fah_fee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;


import com.example.fah_fee.adapter.BetTimeRecyclerAdapter;

import de.hdodenhof.circleimageview.CircleImageView;

public class PlaceBetActivity extends AppCompatActivity {

    private RecyclerView price_rv;
    private TextView betNumber;
    private CircleImageView imageView;
    private BetTimeRecyclerAdapter betAdapter;
    private GridView gridView;
    private String[] prices ={"R5 pays R120","R10 pays R240","R15 pays R350","R20 pays R480","R25 pays R600","R30 pays R720","R35 pays R840","R40 pays R960",
            "R45 pays R1080","R50 pays R1260","R100 pays R2400","R200 pays R4800","R300 pays R7200","R400 pays R9600","R500 pays R12000","R600 pays R14400",
            "R700 pays R16800","R800 pays R19200","R900 pays R21600","R1000 pays R24000"};

    private float[] priceList ={5f,10f,15f,20f,25f,30f,35f,40f,45f,50,100f,200f,300f,400f,500f,600f,700f,800f,900f,1000f};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_bet);

        betNumber = (TextView)findViewById(R.id.betNumber);
        imageView = (CircleImageView) findViewById(R.id.image_view) ;
        gridView = (GridView)findViewById(R.id.gridview);

        CustomGridAdapter customAdapter = new CustomGridAdapter();
        gridView.setAdapter(customAdapter);

        Intent i =  getIntent();
        final String mIntent = getIntent().getExtras().getString("selectedNumber");
        betNumber.setText(mIntent);
        final int image = getIntent().getExtras().getInt("image");
        imageView.setImageResource(image);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), BetTimeActivity.class);
                intent.putExtra("prices",prices[position]);
                intent.putExtra("priceList",priceList[position]);
                intent.putExtra("betNum",mIntent);
                intent.putExtra("image",image);
                startActivity(intent);
            }
        });



    }


    private class CustomGridAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return prices.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.price_layout_row, null);
            TextView namee = view.findViewById(R.id.txt_price);

            namee.setText(prices[position]);
            return  view;
        }
    }
}
