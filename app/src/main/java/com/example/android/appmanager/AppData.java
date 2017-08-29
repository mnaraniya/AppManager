package com.example.android.appmanager;

/**
 * Created by Mukesh on 8/28/2017.
 */

import android.app.Application;
import android.content.pm.PackageInfo;

public class AppData extends Application {

    PackageInfo packageInfo;

    public PackageInfo getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(PackageInfo packageInfo) {
        this.packageInfo = packageInfo;
    }
}
