package com.pens.intentdts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edNama, edInstitusi;
    Button btnPindahTanpaData, btnPindahData;

    public static final String EXTRA_NAMA = "extra_age";
    public static final String EXTRA_INSTITUSI = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.ed_nama);
        edInstitusi = findViewById(R.id.ed_institusi);

        btnPindahData = findViewById(R.id.btn_pindah_data);
        btnPindahTanpaData = findViewById(R.id.btn_pindah_tanpa_data);

        btnPindahTanpaData.setOnClickListener(this);
        btnPindahData.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_pindah_data:
                pindaActivityData();
                break;
            case R.id.btn_pindah_tanpa_data:
                pindahActivityTanpaData();
                break;
            default:
                break;
        }
    }

    private void pindahActivityTanpaData() {
        Intent moveIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(moveIntent);
    }

    private void pindaActivityData() {
        String nama = edNama.getText().toString().trim();
        String institusi = edInstitusi.getText().toString().trim();
        Intent moveIntentWithData = new Intent(MainActivity.this, SecondActivity.class);


        moveIntentWithData.putExtra(this.EXTRA_NAMA, nama);
        moveIntentWithData.putExtra(this.EXTRA_INSTITUSI, institusi);

        startActivity(moveIntentWithData);

    }
}
