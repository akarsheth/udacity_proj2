package com.example.akar.popularmovie_2.utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by rajan on 6/6/2016.
 */
public class Utils {

    public static boolean isStringEmpty(String str) {
        if (str != null && str.length() > 0) {
            return false;
        }
        return true;
    }


    public static boolean isInternetAvailable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        return isConnected;
    }
}
