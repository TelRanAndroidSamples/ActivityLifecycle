package com.sheygam.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("MY_LOG","SecondActivity : onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MY_LOG","SecondActivity : onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MY_LOG","SecondActivity : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MY_LOG","SecondActivity : onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MY_LOG","SecondActivity : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MY_LOG","SecondActivity : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MY_LOG","SecondActivity : onDestroy()");
    }
}
