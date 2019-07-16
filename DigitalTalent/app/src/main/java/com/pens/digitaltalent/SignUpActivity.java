package com.pens.digitaltalent;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    TextInputEditText tedtEmail, tedtPassword;

    Button btnSignUp;

    public static int RESULT_CODE = 110;
    public static String EXTRA_SELECTED_VALUE = "extra_selected_value";


    RadioGroup rgGender;
    RadioButton rdnMale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_up);
        this.setTitle("Sign In");

        tedtEmail = findViewById(R.id.tedt_email);
        tedtPassword = findViewById(R.id.tedt_password);
        btnSignUp = findViewById(R.id.btn_sign_up);

        rgGender = findViewById(R.id.radio_gender);
        rdnMale = findViewById(R.id.radioButton2);

        rdnMale.setChecked(true);



//        btnSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent resultIntent = new Intent();
//                resultIntent.putExtra(EXTRA_SELECTED_VALUE, tedtEmail.getText().toString().trim());
//                setResult(RESULT_CODE, resultIntent);
//                finish();
//            }
//        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void postSignUp(View view) {

        if (rgGender.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(this,"blm cek",Toast.LENGTH_LONG).show();
        }
        else
        {
            // one of the radio buttons is checked
        }
    }
}
