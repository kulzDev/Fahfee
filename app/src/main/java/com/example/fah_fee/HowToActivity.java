package com.example.fah_fee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HowToActivity extends AppCompatActivity {

    TextView header_txt, description_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);
        header_txt = (TextView) findViewById(R.id.howTo_txt);
        description_txt = (TextView) findViewById(R.id.desc_txt);

        header_txt.setText("What do numbers mean \n" +
                "in dreams?");

        description_txt.setText("Most often, dreaming of numbers\n" +
                "means you are searching for logic\n" +
                "and understanding in your life.\n" +
                "\n" +
                "Numbers point to organization \n" +
                "and their appearance \n" +
                "in a dream can signify a\n" +
                "need to create order.\n" +
                "\n" +
                "Each number also has its own \n" +
                "power and significance, and it \n" +
                "could appear to convey that \n" +
                "message."
                + "Play by selecting any number \n" +
                "and place a bet of any \n" +
                "amount.");
    }
}
