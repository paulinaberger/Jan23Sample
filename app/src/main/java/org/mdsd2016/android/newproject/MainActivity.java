package org.mdsd2016.android.newproject;

import android.app.Activity;
import android.content.Intent;
import android.icu.text.LocaleDisplayNames;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by paulinaberger on 2017-01-23.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private static final String TAG ="My MainActivity is running";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//       Button btnStartActivity = (Button) findViewById(R.id.btn_main_activity_start_activity);
//       btnStartActivity.setOnClickListener();

        Button btnStartActivity = (Button) findViewById(R.id.btn_main_activity_start_activity);
        btnStartActivity.setOnClickListener(this);
//            @Override
//            public void onClick(View v) {
//                 Log.d(MainActivity.TAG, "A POTATO JUST EXPLODED");
//            }
//        });


        Button btnStartActivity2 = (Button) findViewById(R.id.BUTTON2);
        btnStartActivity2.setOnClickListener(this);
//            @Override
//            public void onClick(View v) {
//                final int d = Log.d(MainActivity.TAG, "BUTTON 2 HAS BEEN CLICKED");
//
//                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//                startActivity(intent);
//            }
//        });


//        Button btnStartActivity3 = (Button) findViewById(R.id.BUTTON3);
//        btnStartActivity3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(MainActivity.TAG, "Third button has been clicked");
//
//                Intent intent2 = new Intent(getApplicationContext(), ThirdActivity.class);
//                startActivity(intent2);
//
//
//            }
//        });

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d(MainActivity.TAG, "In-onCreate()");

    }


    @Override
    protected void onStart() {
        super.onStart();// ATTENTION: This was auto-generated to implement the App Indexing API.
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d(MainActivity.TAG, "In-onResume()");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();// ATTENTION: This was auto-generated to implement the App Indexing API.
// See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();

    }

    public void startSecondActivity(View View) {
        Intent activityIntent = new Intent(this, SecondActivity.class);

        startActivity(activityIntent);

    }

    @Override
    public void onClick(View whichView) {
        if (whichView.getId() == R.id.btn_main_activity_start_activity) {
            startSecondActivity(whichView);
            Log.e("OnClickClass", "Button 1 Clicked");

        } else if (whichView.getId() == R.id.BUTTON2) {
            Log.e("OnClickClass", "Button 2 Clicked");

            Intent intent = new Intent(this, SecondActivity.class);
  //        startActivity(intent);
            startActivityForResult(intent, 0);

        }
    }

    @Override
    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        Log.w(MainActivity.TAG, "In-OnActivityResult");

        if(requestCode == 0 && resultCode == 55){
            String returnData = data.getStringExtra("my data");
            Log.e(MainActivity.TAG, "return String" + returnData);
        }
    }
}

