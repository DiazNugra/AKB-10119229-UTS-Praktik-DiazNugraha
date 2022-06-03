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
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button lanjut1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lanjut1=findViewById(R.id.lanjut1);
        lanjut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, cekDataActivity.class);
                startActivity(intent);
            }
        });

    }
}