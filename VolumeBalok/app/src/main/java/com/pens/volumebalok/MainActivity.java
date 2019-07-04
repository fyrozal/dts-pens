package com.pens.volumebalok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtPanjang, edtLebar, edtTinggi;

    Button btnHitung;

    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtPanjang = findViewById(R.id.ed_panjang);
        edtLebar = findViewById(R.id.ed_lebar);
        edtTinggi = findViewById(R.id.ed_tinggi);

        tvHasil = findViewById(R.id.tv_hasil);

        btnHitung = findViewById(R.id.btn_hitung);

        btnHitung.setOnClickListener(this);


    }

    Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_hitung) {
            String inputPanjang = edtPanjang.getText().toString().trim();
            String inputLebar = edtLebar.getText().toString().trim();
            String inputTinggi = edtTinggi.getText().toString().trim();


            boolean isEmptyField = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputPanjang)) {
                isEmptyField = true;
                edtPanjang.setError(getString(R.string.txt_field_kosong));
            }

            if (TextUtils.isEmpty(inputLebar)) {
                isEmptyField = true;
                edtLebar.setError(getString(R.string.txt_field_kosong));
            }

            if (TextUtils.isEmpty(inputTinggi)) {
                isEmptyField = true;
                edtTinggi.setError(getString(R.string.txt_field_kosong));
            }

            Double panjang = toDouble(inputPanjang);
            Double lebar = toDouble(inputLebar);
            Double tinggi = toDouble(inputTinggi);

            if (panjang == null) {
                isInvalidDouble = true;
                edtPanjang.setError("Nilai harus berupa angka yang valid ");
            }

            if (lebar == null) {
                isInvalidDouble = true;
                edtLebar.setError("Nilai harus berupa angka yang valid ");
            }

            if (tinggi == null) {
                isInvalidDouble = true;
                edtTinggi.setError("Nilai harus berupa angka yang valid ");
            }


            if (!isInvalidDouble && !isEmptyField) {
                double volume = lebar * tinggi * panjang;

                tvHasil.setText("" + volume);
//                tvHasil.setText(String.valueOf(volume));
            }


        }

    }
}
