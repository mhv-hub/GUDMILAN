package com.mhv.apps.gudmilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


import android.os.Bundle;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    AppCompatButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38;
    int female_index = -1;
    int male_index;
    ProgressDialog p;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_second);

        male_index = Integer.parseInt(getIntent().getExtras().getString("response"));


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
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.one : female_index = 1;
                sendData(female_index);
                break;
            case R.id.two : female_index = 2;
                sendData(female_index);
                break;
            case R.id.three : female_index = 3;
                sendData(female_index);
                break;
            case R.id.four : female_index = 4;
                sendData(female_index);
                break;
            case R.id.five : female_index = 5;
                sendData(female_index);
                break;
            case R.id.six : female_index = 6;
                sendData(female_index);
                break;
            case R.id.seven : female_index = 7;
                sendData(female_index);
                break;
            case R.id.eight : female_index = 8;
                sendData(female_index);
                break;
            case R.id.nine : female_index = 9;
                sendData(female_index);
                break;
            case R.id.ten : female_index = 10;
                sendData(female_index);
                break;
            case R.id.eleven : female_index = 11;
                sendData(female_index);
                break;
            case R.id.twelve : female_index = 12;
                sendData(female_index);
                break;
            case R.id.thirteen : female_index = 13;
                sendData(female_index);
                break;
            case R.id.fourteen : female_index = 14;
                sendData(female_index);
                break;
            case R.id.fiveteen : female_index = 15;
                sendData(female_index);
                break;
            case R.id.sixteen : female_index = 16;
                sendData(female_index);
                break;
            case R.id.seventeen : female_index = 17;
                sendData(female_index);
                break;
            case R.id.eighteen : female_index = 18;
                sendData(female_index);
                break;
            case R.id.nineteen : female_index = 19;
                sendData(female_index);
                break;
            case R.id.twenty : female_index = 20;
                sendData(female_index);
                break;
            case R.id.twentyone : female_index = 21;
                sendData(female_index);
                break;
            case R.id.twentytwo : female_index = 22;
                sendData(female_index);
                break;
            case R.id.twentythree : female_index = 23;
                sendData(female_index);
                break;
            case R.id.twentyfour : female_index = 24;
                sendData(female_index);
                break;
            case R.id.twentyfive : female_index = 25;
                sendData(female_index);
                break;
            case R.id.twentysix : female_index = 26;
                sendData(female_index);
                break;
            case R.id.twentyseven : female_index = 27;
                sendData(female_index);
                break;
            case R.id.twentyeight : female_index = 28;
                sendData(female_index);
                break;
            case R.id.twentynine : female_index = 29;
                sendData(female_index);
                break;
            case R.id.thirty : female_index = 30;
                sendData(female_index);
                break;
            case R.id.thirtyone : female_index = 31;
                sendData(female_index);
                break;
            case R.id.thirtytwo : female_index = 32;
                sendData(female_index);
                break;
            case R.id.thirtythree :female_index = 33;
                sendData(female_index);
                break;
            case R.id.thirtyfour : female_index = 34;
                sendData(female_index);
                break;
            case R.id.thirtyfive : female_index = 35;
                sendData(female_index);
                break;
            case R.id.thirtysix : female_index = 36;
                sendData(female_index);
                break;
            case R.id.thirtyseven : female_index = 37;
                sendData(female_index);
                break;
            case R.id.thirtyeight : female_index = 38;
                sendData(female_index);
                break;
            default:
                break;
        }
    }


    public void sendData(int ind){

        intent = new Intent(SecondActivity.this,ResultActivity.class);
        intent.putExtra("male",""+male_index);
        intent.putExtra("female",""+female_index);

        p  = new ProgressDialog(SecondActivity.this);
        p.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        p.setMessage("          कृप्या कुछ देर प्रतिक्षा करे");
        p.setIndeterminate(true);
        p.setCancelable(false);
        p.show();

        final CountDownTimer mTimer = new CountDownTimer(2000, 1000) {

            @Override
            public void onTick(final long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                p.cancel();
                p.hide();
                startActivity(intent);
            }
        };
        mTimer.start();


    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.slidethree,R.anim.slidefour);
    }
}