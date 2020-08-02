package com.example.hw3_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init () {
        final TextView result = findViewById(R.id.result);
        Button nineBtn = findViewById(R.id.nineBtn);
        Button eightBtn = findViewById(R.id.eightBtn);
        Button sevenBtn = findViewById(R.id.sevenBtn);
        Button sixBtn = findViewById(R.id.sixBtn);
        Button fiveBtn = findViewById(R.id.fiveBtn);
        Button fourBtn = findViewById(R.id.fourBtn);
        Button threeBtn = findViewById(R.id.threeBtn);
        Button twoBtn = findViewById(R.id.twoBtn);
        Button oneBtn = findViewById(R.id.oneBtn);
        Button zeroBtn = findViewById(R.id.zeroBtn);
        Button decimalPointBtn = findViewById(R.id.decimalPointBtn);
        Button clearingBtn = findViewById(R.id.clearingBtn);

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("9");
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("8");
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("7");
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("6");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("5");
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("4");
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("3");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("2");
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("1");
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
            }
        });

        decimalPointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(".");
            }
        });

        clearingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
    }
}