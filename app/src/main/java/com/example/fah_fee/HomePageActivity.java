package com.example.fah_fee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomePageActivity extends AppCompatActivity {

    GridView menuGrid;
    Button play_btn;

    String[] muneItem = {"My profile", "Numbers ", "Draw times", "Wallet", "How to!", "Contact Us"};
    int[] itemList = {R.drawable.one, R.drawable.two, R.drawable.three,
            R.drawable.four, R.drawable.five, R.drawable.six};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        play_btn = (Button)findViewById(R.id.btn_play);

        menuGrid = (GridView) findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        menuGrid.setAdapter(customAdapter);

        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    //GridView Adapter
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return itemList.length;
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
            View view = getLayoutInflater().inflate(R.layout.menu_item, null);
            TextView namee = view.findViewById(R.id.fruits);
            ImageView image = view.findViewById(R.id.images);

            namee.setText(muneItem[position]);
            image.setImageResource(itemList[position]);
            return view;

        }
    }
}
