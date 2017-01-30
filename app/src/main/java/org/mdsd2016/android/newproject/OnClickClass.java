package org.mdsd2016.android.newproject;

import android.util.Log;
import android.view.View;

/**
 * Created by paulinaberger on 2017-01-30. Implemets class we were using before. called when a view has b een clicked.
 */

public class OnClickClass implements View.OnClickListener{
    @Override
    public void onClick(View whichView) {

        if(whichView.getId() == R.id.btn_main_activity_start_activity) {

            Log.e("OnClickClass", "Button 1 Clicked");

        }else if(whichView.getId() == R.id.BUTTON2){
            Log.e("OnClickClass", "Button 2 Clicked");

        }

    }
}
