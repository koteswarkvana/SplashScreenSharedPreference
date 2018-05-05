package com.koti.apple.splashscreensharedpreference;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeScreenActivity extends Activity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.home_screen_activity);

        // Receiving stored data from the Shared preference.
        boolean isscreenDisplayed = SharedpreferenceRootApplication.mPref.getBoolean(Constants.SPLASH_SCREEN_DISPLAYED_BOOLEN_VAL, false);
        String strVal = SharedpreferenceRootApplication.mPref.getString(Constants.STRING_VAL, "");
        float floatVal = SharedpreferenceRootApplication.mPref.getFloat(Constants.FLOAT_VAL, 0);
        // Do not have getDouble() method
        // double doubleVal = SharedpreferenceRootApplication.mPref.getLong(Constants.DOUBLE_VAL, 0);
        long longVal = SharedpreferenceRootApplication.mPref.getLong(Constants.LONG_VAL, 0);
        // Do not have getChar() method
        // char charVal = SharedpreferenceRootApplication.mPref.getChar(Constants.CHAR_VAL, '');
        int intVal = SharedpreferenceRootApplication.mPref.getInt(Constants.INT_VAL, 0);
        if (isscreenDisplayed) {
            Toast.makeText(this, "Displaying home screen " + isscreenDisplayed, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Displaying strVal " + strVal, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Displaying floatVal " + floatVal, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Displaying longVal " + longVal, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Displaying intVal " + intVal, Toast.LENGTH_SHORT).show();
        }
    }
}
