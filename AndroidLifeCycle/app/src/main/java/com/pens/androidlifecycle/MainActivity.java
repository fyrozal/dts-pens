package com.pens.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"App on Start",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"App on Stop",Toast.LENGTH_SHORT).show();
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