package com.sheygam.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
        Log.d("MY_LOG","MainActivity : onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MY_LOG","MainActivity : onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MY_LOG","MainActivity : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MY_LOG","MainActivity : onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MY_LOG","MainActivity : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MY_LOG","MainActivity : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MY_LOG","MainActivity : onDestroy()");
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}
