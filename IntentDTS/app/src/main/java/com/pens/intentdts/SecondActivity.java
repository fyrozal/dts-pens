package com.pens.intentdts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvNama, tvInstitusi;

    Button btnActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);

        btnActivity3 = findViewById(R.id.btn_activity3);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if (TextUtils.isEmpty(nama)) {
            tvNama.setText("Nama : ");
        } else {
            tvNama.setText("Nama : " + nama);
        }

        if (TextUtils.isEmpty(institusi)) {
            tvInstitusi.setText("Asal Institusi : ");
        } else {
            tvInstitusi.setText("Asal Institusi : " + institusi);
        }

        btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(moveIntent);
            }
        });


    }
}
