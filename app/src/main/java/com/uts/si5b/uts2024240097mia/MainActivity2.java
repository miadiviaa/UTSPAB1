package com.uts.si5b.uts2024240097mia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecMainActivity extends AppCompatActivity {
    TextView tvNamaLengkap;
    TextView tvNomorPendaftaran;
    TextView tvInformasiPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNamaLengkap = findViewById(R.id.tv_tampil_nama_lengkap;
        tvNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        tvInformasiPendaftaran = findViewById(R.id.tv_informasi_pendaftaran);

        Intent terima = getIntent();
        String yNamaLengkap = terima.getStringExtra("xNamaLengkap");
        String yNomorPendaftaran = terima.getStringExtra("xNomorPendaftaran");
        String yInformasiPendaftaran = terima.getStringExtra("xInformasiPendaftaran");
        tvNamaLengkap.setText(yNamaLengkap);
        tvNomorPendaftaran.setText(yNomorPendaftaran);
        tvInformasiPendaftaran.setText(yInformasiPendaftaran);
    }
}