package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        TextView textFinal = (TextView) findViewById(R.id.textFinal);
        Intent intent = getIntent();
        textFinal.setText(intent.getIntExtra("userBasket",0));
    }
}
