package com.pens.digitaltalent;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActitivity extends AppCompatActivity {

    Button btnLogin;

    TextInputEditText tedtEmail, tedtPassword;
    TextView tvforgotPassword, tvSignUp;

    private int REQUEST_CODE = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        tedtEmail = findViewById(R.id.tedt_email);
        tedtPassword = findViewById(R.id.tedt_password);
        tvforgotPassword = findViewById(R.id.tv_forgot_password);
        tvSignUp = findViewById(R.id.tv_sign_up);


        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActitivity.this, SignUpActivity.class);

                startActivity(i);
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == SignUpActivity.RESULT_CODE) {
                String selectedValue = data.getStringExtra(SignUpActivity.EXTRA_SELECTED_VALUE);
                tedtEmail.setText(selectedValue);
            }
        }
    }

    public void postLogin(View view) {
        if (TextUtils.isEmpty(tedtEmail.getText().toString().trim())
                && TextUtils.isEmpty(tedtPassword.getText().toString().trim())) {
            tedtEmail.setError("Email tidak boleh kosong!");
            tedtPassword.setError("Password tidak boleh kosong!");

        } else if (TextUtils.isEmpty(tedtEmail.getText().toString().trim())) {

            tedtEmail.setError("Email tidak boleh kosong!");

        } else if (!isValidEmail(tedtEmail.getText().toString().trim())) {

            tedtEmail.setError("Email tidak valid!");

        } else if (TextUtils.isEmpty(tedtPassword.getText().toString())) {

            tedtPassword.setError("Password tidak boleh kosong!");

        } else {
            Toast.makeText(view.getContext(), "Sukses Login", Toast.LENGTH_LONG).show();
        }
    }

    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
