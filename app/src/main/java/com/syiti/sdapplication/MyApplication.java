package com.syiti.sdapplication;

import android.app.Application;

import com.syiti.sdapplication.utils.DensityUtils;

/**
 * description: <一句话功能简述>
 *
 * @author Chenz
 * @date 2018/7/20 0020
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DensityUtils.setDensity(this);
    }
}
