package com.si5b.pendaftaranmaba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran, etNama;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNama = findViewById(R.id.et_nama);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomorPendaftaran = etNomorPendaftaran.getText().toString();
                String nama = etNama.getText().toString();

                if (nomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran Wajib Diisi");
                }
                else if (nama.trim().equals("")){
                    etNama.setError("Nama Wajib Diisi");
                }
                else {
                    Toast.makeText(MainActivity.this, "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show();
                }
               }
        });

    }
}