package com.anr.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anr.mylibrary.MyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyToast myToast = new MyToast();
        myToast.makeNewToast(getApplicationContext(),"Hello");
    }
}