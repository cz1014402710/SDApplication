package com.syiti.sdapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;

import com.syiti.sdapplication.utils.DensityUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DensityUtils.setDefault(this);
        setContentView(R.layout.activity_main);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int heightPixels = dm.heightPixels;
        int widthPixels = dm.widthPixels;
        float heightDP = heightPixels / dm.density;
        float widthDP = widthPixels / dm.density;
        Log.e("widthDP=============", widthDP + "");
        Log.e("density=============", dm.density + "");
    }
}
