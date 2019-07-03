package com.pens.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"MainActivity onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"MainActivity onStart");
        Toast.makeText(this, "App on Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"MainActivity onStop");
        Toast.makeText(this, "App on Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"MainActivity onPause");
        Toast.makeText(this, "App on Pause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"MainActivity onResume");
        Toast.makeText(this, "App on Resume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"MainActivity onRestart");
        Toast.makeText(this, "App on Restart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"MainActivity onDestroy");
        Toast.makeText(this, "App on Destroy", Toast.LENGTH_SHORT).show();

    }

    /*
    Pada bagian ini, buatlah sebuah fungsi override seperti fungsi diatas dengan menyatakan
    bahwa activity tersebut dalam keadaan Pause, Resume, Restart dan Destroy.
    - onPause()
    - onResume()
    - onRestart()
    - on Destroy()
     */

}