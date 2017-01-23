package org.mdsd2016.android.newproject;

import android.app.Activity;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

    /**
     * Created by paulinaberger on 2017-01-23.
     */

    public class MainActivity extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
            super.onCreate(savedInstanceState, persistentState);

            setContentView(R.layout.activity_main2);
        }
    }
