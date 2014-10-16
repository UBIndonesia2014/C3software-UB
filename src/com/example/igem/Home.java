package com.example.igem;

import org.apache.cordova.*;
import android.os.Bundle;
//import android.app.Activity;
import android.view.Menu;

public class Home extends DroidGap {

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
super.loadUrl("file:///android_asset/www/index.html");
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
	//getMenuInflater().inflate(R.menu.app_main, menu);
getMenuInflater().inflate(R.menu.home, menu);

return true;
}

}