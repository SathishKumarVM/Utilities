package com.example.debugutil;

import android.util.Log;

public class DebugUtility {
    private final static String TAG = "Awesome App";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
