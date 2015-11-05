package cn.mobile_frame_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class StartUpActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(StartUpActivity.this, LogonActivity.class);
                StartUpActivity.this.startActivity(intent);
                StartUpActivity.this.finish();
            }
        }, 1500);


    }



}