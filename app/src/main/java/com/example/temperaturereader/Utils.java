package com.example.temperaturereader;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import java.util.Random;

class Utils {

    public static final Random RANDOM = new Random();
    public static float convertDpToPixel(float dp, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp=( (float) metrics.densityDpi/DisplayMetrics.DENSITY_DEFAULT);
    }
    public static int randInt(int min, int max){

        return RANDOM.nextInt((max-min) - 1) + min;
    }
}
