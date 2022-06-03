package com.diazna.utspraktik_if6_10119229_diazmaulidzann;

//Tanggal Pengerjaan : 3 juni 2022
//NIM                : 10119229
//Nama               : Diaz Maulidzan Nugraha
//Kelas              : IF-6

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cekDataActivity extends AppCompatActivity {

    private Button lanjut2;
    private Button ubah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_data);

        lanjut2=findViewById(R.id.lanjut2);
        lanjut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(cekDataActivity.this, successActivity.class);
                startActivity(intent2);
            }
        });

        ubah=findViewById(R.id.ubah);
        ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cekDataActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}