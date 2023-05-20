package com.example.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(getApplicationContext(),
                "onCreate() is called " ,Toast.LENGTH_LONG).show();

    }

    protected void onResume(){
        super.onResume();

        Toast.makeText(getApplicationContext(),
                "onResume() is called " ,Toast.LENGTH_LONG).show();

    }
    protected void onPause(){
        super.onPause();

        Toast.makeText(this,
                "onPause() is called ", Toast.LENGTH_SHORT).show();
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),
                "onStart() is called " ,Toast.LENGTH_LONG).show();
    }

    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this,
                "onRestart() is called ", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(this,
                "onRestart() is called ", Toast.LENGTH_SHORT).show();

    }

    protected void onDestroy(){
        super.onDestroy();

        Toast.makeText(this,
                "onDestroy() is called ", Toast.LENGTH_SHORT).show();
    }
}