package com.mhv.apps.gudmilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    AppCompatButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38;
    int male_index = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        b1 = (AppCompatButton) findViewById(R.id.one);
        b1.setOnClickListener(this);

        b2 = (AppCompatButton) findViewById(R.id.two);
        b2.setOnClickListener(this);

        b3 = (AppCompatButton) findViewById(R.id.three);
        b3.setOnClickListener(this);

        b4 = (AppCompatButton) findViewById(R.id.four);
        b4.setOnClickListener(this);

        b5 = (AppCompatButton) findViewById(R.id.five);
        b5.setOnClickListener(this);

        b6 = (AppCompatButton) findViewById(R.id.six);
        b6.setOnClickListener(this);

        b7 = (AppCompatButton) findViewById(R.id.seven);
        b7.setOnClickListener(this);

        b8 = (AppCompatButton) findViewById(R.id.eight);
        b8.setOnClickListener(this);

        b9 = (AppCompatButton) findViewById(R.id.nine);
        b9.setOnClickListener(this);

        b10 = (AppCompatButton) findViewById(R.id.ten);
        b10.setOnClickListener(this);

        b11 = (AppCompatButton) findViewById(R.id.eleven);
        b11.setOnClickListener(this);

        b12 = (AppCompatButton) findViewById(R.id.twelve);
        b12.setOnClickListener(this);

        b13 = (AppCompatButton) findViewById(R.id.thirteen);
        b13.setOnClickListener(this);

        b14 = (AppCompatButton) findViewById(R.id.fourteen);
        b14.setOnClickListener(this);

        b15 = (AppCompatButton) findViewById(R.id.fiveteen);
        b15.setOnClickListener(this);

        b16 = (AppCompatButton) findViewById(R.id.sixteen);
        b16.setOnClickListener(this);

        b17 = (AppCompatButton) findViewById(R.id.seventeen);
        b17.setOnClickListener(this);

        b18 = (AppCompatButton) findViewById(R.id.eighteen);
        b18.setOnClickListener(this);

        b19 = (AppCompatButton) findViewById(R.id.nineteen);
        b19.setOnClickListener(this);

        b20 = (AppCompatButton) findViewById(R.id.twenty);
        b20.setOnClickListener(this);

        b21 = (AppCompatButton) findViewById(R.id.twentyone);
        b21.setOnClickListener(this);

        b22 = (AppCompatButton) findViewById(R.id.twentytwo);
        b22.setOnClickListener(this);

        b23 = (AppCompatButton) findViewById(R.id.twentythree);
        b23.setOnClickListener(this);

        b24 = (AppCompatButton) findViewById(R.id.twentyfour);
        b24.setOnClickListener(this);

        b25 = (AppCompatButton) findViewById(R.id.twentyfive);
        b25.setOnClickListener(this);

        b26 = (AppCompatButton) findViewById(R.id.twentysix);
        b26.setOnClickListener(this);

        b27 = (AppCompatButton) findViewById(R.id.twentyseven);
        b27.setOnClickListener(this);

        b28 = (AppCompatButton) findViewById(R.id.twentyeight);
        b28.setOnClickListener(this);

        b29 = (AppCompatButton) findViewById(R.id.twentynine);
        b29.setOnClickListener(this);

        b30 = (AppCompatButton) findViewById(R.id.thirty);
        b30.setOnClickListener(this);

        b31 = (AppCompatButton) findViewById(R.id.thirtyone);
        b31.setOnClickListener(this);

        b32 = (AppCompatButton) findViewById(R.id.thirtytwo);
        b32.setOnClickListener(this);

        b33 = (AppCompatButton) findViewById(R.id.thirtythree);
        b33.setOnClickListener(this);

        b34 = (AppCompatButton) findViewById(R.id.thirtyfour);
        b34.setOnClickListener(this);

        b35 = (AppCompatButton) findViewById(R.id.thirtyfive);
        b35.setOnClickListener(this);

        b36 = (AppCompatButton) findViewById(R.id.thirtysix);
        b36.setOnClickListener(this);

        b37 = (AppCompatButton) findViewById(R.id.thirtyseven);
        b37.setOnClickListener(this);

        b37 = (AppCompatButton) findViewById(R.id.thirtyeight);
        b37.setOnClickListener(this);

        Toast.makeText(MainActivity.this, "SCROLL DOWN FOR MORE", Toast.LENGTH_LONG).show();


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.one : male_index = 1;
                sendData(male_index);
                break;
            case R.id.two : male_index = 2;
                sendData(male_index);
                break;
            case R.id.three : male_index = 3;
                sendData(male_index);
                break;
            case R.id.four : male_index = 4;
                sendData(male_index);
                break;
            case R.id.five : male_index = 5;
                sendData(male_index);
                break;
            case R.id.six : male_index = 6;
                sendData(male_index);
                break;
            case R.id.seven : male_index = 7;
                sendData(male_index);
                break;
            case R.id.eight : male_index = 8;
                sendData(male_index);
                break;
            case R.id.nine : male_index = 9;
                sendData(male_index);
                break;
            case R.id.ten : male_index = 10;
                sendData(male_index);
                break;
            case R.id.eleven : male_index = 11;
                sendData(male_index);
                break;
            case R.id.twelve : male_index = 12;
                sendData(male_index);
                break;
            case R.id.thirteen : male_index = 13;
                sendData(male_index);
                break;
            case R.id.fourteen : male_index = 14;
                sendData(male_index);
                break;
            case R.id.fiveteen : male_index = 15;
                sendData(male_index);
                break;
            case R.id.sixteen : male_index = 16;
                sendData(male_index);
                break;
            case R.id.seventeen : male_index = 17;
                sendData(male_index);
                break;
            case R.id.eighteen : male_index = 18;
                sendData(male_index);
                break;
            case R.id.nineteen : male_index = 19;
                sendData(male_index);
                break;
            case R.id.twenty : male_index = 20;
                sendData(male_index);
                break;
            case R.id.twentyone : male_index = 21;
                sendData(male_index);
                break;
            case R.id.twentytwo : male_index = 22;
                sendData(male_index);
                break;
            case R.id.twentythree : male_index = 23;
                sendData(male_index);
                break;
            case R.id.twentyfour : male_index = 24;
                sendData(male_index);
                break;
            case R.id.twentyfive : male_index = 25;
                sendData(male_index);
                break;
            case R.id.twentysix : male_index = 26;
                sendData(male_index);
                break;
            case R.id.twentyseven : male_index = 27;
                sendData(male_index);
                break;
            case R.id.twentyeight : male_index = 28;
                sendData(male_index);
                break;
            case R.id.twentynine : male_index = 29;
                sendData(male_index);
                break;
            case R.id.thirty : male_index = 30;
                sendData(male_index);
                break;
            case R.id.thirtyone : male_index = 31;
                sendData(male_index);
                break;
            case R.id.thirtytwo : male_index = 32;
                sendData(male_index);
                break;
            case R.id.thirtythree :male_index = 33;
                sendData(male_index);
                break;
            case R.id.thirtyfour : male_index = 34;
                sendData(male_index);
                break;
            case R.id.thirtyfive : male_index = 35;
                sendData(male_index);
                break;
            case R.id.thirtysix : male_index = 36;
                sendData(male_index);
                break;
            case R.id.thirtyseven : male_index = 37;
                sendData(male_index);
                break;
            case R.id.thirtyeight : male_index = 38;
                sendData(male_index);
                break;
            default:
                break;
        }
    }

    public void sendData(int ind){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("response",""+ind);
        startActivity(intent);
        overridePendingTransition(R.anim.slideone,R.anim.slidetwo);
    }
}