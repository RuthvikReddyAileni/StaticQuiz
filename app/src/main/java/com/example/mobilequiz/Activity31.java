package com.example.mobilequiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity31 extends AppCompatActivity {
    Button ans1 , ans2 , ans3 , ans4 , submit ;
    TextView op1 , op2 , op3 , op4 ;
    static int cround1 ;
    Button secans1 , secans2 , secans3 , secans4 ;
    TextView secop1 , secop2 , secop3 , secop4 ;
    Button thirans1 , thirans2 , thirans3 , thirans4 , next , previous ;
    TextView thirop1 , thirop2 , thirop3 , thirop4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_31);
        MainActivity.score = 0;

        ans1 = findViewById(R.id.op1);
        ans2 = findViewById(R.id.op2);
        ans3 = findViewById(R.id.op3);
        ans4 = findViewById(R.id.op4);
        op1 = (TextView) findViewById(R.id.op1);
        op2 = (TextView) findViewById(R.id.op2);
        op3 = (TextView) findViewById(R.id.op3);
        op4 = (TextView) findViewById(R.id.op4);
        secans1 = findViewById(R.id.secop1);
        secans2 = findViewById(R.id.secop2);
        secans3 = findViewById(R.id.secop3);
        secans4 = findViewById(R.id.secop4);
        secop1 = (TextView) findViewById(R.id.secop1);
        secop2 = (TextView) findViewById(R.id.secop2);
        secop3 = (TextView) findViewById(R.id.secop3);
        secop4 = (TextView) findViewById(R.id.secop4);
        thirans1 = findViewById(R.id.thirop1);
        thirans2 = findViewById(R.id.thirop2);
        thirans3 = findViewById(R.id.thirop3);
        thirans4 = findViewById(R.id.thirop4);
        thirop1 = (TextView) findViewById(R.id.thirop1);
        thirop2 = (TextView) findViewById(R.id.thirop2);
        thirop3 = (TextView) findViewById(R.id.thirop3);
        thirop4 = (TextView) findViewById(R.id.thirop4);

        next = findViewById(R.id.next1);

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1.setTextColor(Color.parseColor("#FD0707"));
                op2.setVisibility(View.GONE);
                op3.setVisibility(View.GONE);
                op4.setVisibility(View.GONE);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1.setVisibility(View.GONE);
                op2.setTextColor(Color.parseColor("#FD0707"));
                op3.setVisibility(View.GONE);
                op4.setVisibility(View.GONE);
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op3.setTextColor(Color.parseColor("#14E31C"));
                MainActivity.score =  MainActivity.score + 1 ;
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op3.setVisibility(View.GONE);
                op1.setVisibility(View.GONE);
                op2.setVisibility(View.GONE);
                op4.setTextColor(Color.parseColor("#FD0707"));
            }
        });
        secans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secop1.setTextColor(Color.parseColor("#FD0707"));
                secop2.setVisibility(View.GONE);
                secop3.setVisibility(View.GONE);
                secop4.setVisibility(View.GONE);
            }
        });
        secans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secop2.setTextColor(Color.parseColor("#14E31C"));
                MainActivity.score =  MainActivity.score + 1 ;
            }
        });
        secans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secop1.setVisibility(View.GONE);
                secop2.setVisibility(View.GONE);
                secop3.setTextColor(Color.parseColor("#FD0707"));
                secop4.setVisibility(View.GONE);
            }
        });
        secans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secop1.setVisibility(View.GONE);
                secop2.setVisibility(View.GONE);
                secop3.setVisibility(View.GONE);
                secop4.setTextColor(Color.parseColor("#FD0707"));
            }
        });
        thirans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirop1.setTextColor(Color.parseColor("#FD0707"));
                thirop2.setVisibility(View.GONE);
                thirop3.setVisibility(View.GONE);
                thirop4.setVisibility(View.GONE);
            }
        });
        thirans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirop1.setVisibility(View.GONE);
                thirop2.setTextColor(Color.parseColor("#FD0707"));
                thirop3.setVisibility(View.GONE);
                thirop4.setVisibility(View.GONE);
            }
        });
        thirans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirop3.setTextColor(Color.parseColor("#14E31C"));
                MainActivity.score =  MainActivity.score + 1 ;
            }
        });
        thirans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirop1.setVisibility(View.GONE);
                thirop2.setVisibility(View.GONE);
                thirop3.setVisibility(View.GONE);
                thirop4.setTextColor(Color.parseColor("#FD0707"));
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Activity311.class));
            }
        });

    }
}