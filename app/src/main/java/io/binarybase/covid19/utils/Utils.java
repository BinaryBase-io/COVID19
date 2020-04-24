package io.binarybase.covid19.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.List;

public class Utils {

    public static boolean isConnected(Context context) {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            return connected = true;
        } else
            return connected = false;
    }

    public static Boolean isAppInstalled(Context context, String appName) {
        PackageManager pm = context.getPackageManager();
        boolean installed = false;
        List<PackageInfo> packages = pm.getInstalledPackages(0);

        for (PackageInfo packageInfo : packages) {
            if (packageInfo.packageName.equals(appName)) {
                installed = true;
                break;
            }
        }

        return installed;
    }

}
