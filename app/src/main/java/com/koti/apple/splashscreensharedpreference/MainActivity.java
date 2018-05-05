package com.koti.apple.splashscreensharedpreference;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class MainActivity extends Activity {

    /**
     * Duration of wait
     **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the HomeScreenActivity. */
                SharedpreferenceRootApplication.mEditor.putBoolean(Constants.SPLASH_SCREEN_DISPLAYED_BOOLEN_VAL, true).commit();
                SharedpreferenceRootApplication.mEditor.putString(Constants.STRING_VAL, "koti").commit();
                SharedpreferenceRootApplication.mEditor.putFloat(Constants.FLOAT_VAL, 27.07F).commit();
                SharedpreferenceRootApplication.mEditor.putLong(Constants.LONG_VAL, 1234567890).commit();
                SharedpreferenceRootApplication.mEditor.putInt(Constants.INT_VAL, 12345678).commit();
                startActivity(new Intent(MainActivity.this, HomeScreenActivity.class));
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
