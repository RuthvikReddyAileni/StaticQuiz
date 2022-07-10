package com.example.mobilequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity433 extends AppCompatActivity {
    Button ans1 , ans2 , ans3 , ans4 , submit ;
    TextView op1 , op2 , op3 , op4 ;
    Button secans1 , secans2 , secans3 , secans4 ;
    TextView secop1 , secop2 , secop3 , secop4 ;
    Button thirans1 , thirans2 , thirans3 , thirans4 , next , previous ;
    TextView thirop1 , thirop2 , thirop3 , thirop4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_433);

        ans1 = findViewById(R.id.sevenop1);
        ans2 = findViewById(R.id.sevenop2);
        ans3 = findViewById(R.id.sevenop3);
        ans4 = findViewById(R.id.sevenop4);
        op1 = (TextView) findViewById(R.id.sevenop1);
        op2 = (TextView) findViewById(R.id.sevenop2);
        op3 = (TextView) findViewById(R.id.sevenop3);
        op4 = (TextView) findViewById(R.id.sevenop4);
        secans1 = findViewById(R.id.eightop1);
        secans2 = findViewById(R.id.eightop2);
        secans3 = findViewById(R.id.eightop3);
        secans4 = findViewById(R.id.eightop4);
        secop1 = (TextView) findViewById(R.id.eightop1);
        secop2 = (TextView) findViewById(R.id.eightop2);
        secop3 = (TextView) findViewById(R.id.eightop3);
        secop4 = (TextView) findViewById(R.id.eightop4);
        thirans1 = findViewById(R.id.nineop1);
        thirans2 = findViewById(R.id.nineop2);
        thirans3 = findViewById(R.id.nineop3);
        thirans4 = findViewById(R.id.nineop4);
        thirop1 = (TextView) findViewById(R.id.nineop1);
        thirop2 = (TextView) findViewById(R.id.nineop2);
        thirop3 = (TextView) findViewById(R.id.nineop3);
        thirop4 = (TextView) findViewById(R.id.nineop4);

        next = findViewById(R.id.next3);


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
                op2.setTextColor(Color.parseColor("#FD0707"));
                op3.setVisibility(View.GONE);
                op1.setVisibility(View.GONE);
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
                secop1.setVisibility(View.GONE);
                secop2.setTextColor(Color.parseColor("#FD0707"));
                secop3.setVisibility(View.GONE);
                secop4.setVisibility(View.GONE);
            }
        });
        secans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secop3.setTextColor(Color.parseColor("#14E31C"));
                MainActivity.score =  MainActivity.score + 1 ;
            }
        });
        secans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secop4.setTextColor(Color.parseColor("#FD0707"));
                secop2.setVisibility(View.GONE);
                secop3.setVisibility(View.GONE);
                secop1.setVisibility(View.GONE);

            }
        });
        thirans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirop1.setTextColor(Color.parseColor("#14E31C"));
                MainActivity.score =  MainActivity.score + 1 ;
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
                thirop1.setVisibility(View.GONE);
                thirop2.setVisibility(View.GONE);
                thirop3.setTextColor(Color.parseColor("#FD0707"));
                thirop4.setVisibility(View.GONE);
            }
        });
        thirans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirop4.setTextColor(Color.parseColor("#FD0707"));
                thirop2.setVisibility(View.GONE);
                thirop3.setVisibility(View.GONE);
                thirop4.setVisibility(View.GONE);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Activity434.class));
            }
        });


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder altdial = new AlertDialog.Builder(Activity433.this);
        altdial.setMessage("Do you want to exit the round?").setCancelable(false)
                .setPositiveButton("Yes ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(),Activity43.class));
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = altdial.create();
        alert.setTitle("Alert ! ");
        alert.show();
    }
}