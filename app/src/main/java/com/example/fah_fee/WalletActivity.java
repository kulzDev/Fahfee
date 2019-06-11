package com.example.fah_fee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WalletActivity extends AppCompatActivity {

    TextView winnings_txt, balance_txt;
    Button history_btn, withdraw_btn, top_up_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
        winnings_txt = (TextView)findViewById(R.id.wins_txt);
        balance_txt = (TextView)findViewById(R.id.balance_txt);
        top_up_btn = (Button)findViewById(R.id.top_up);
        withdraw_btn = (Button)findViewById(R.id.withdraw);
        history_btn = (Button)findViewById(R.id.history);
    }
}
