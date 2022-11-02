package com.uts.si5b.uts2024240097mia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText etNamaLengkap;
    EditText etNomorPendaftaran;
    TextView tvInformasiPendaftaran;
    CheckBox cbFacebook;
    CheckBox cbInstagram;
    CheckBox cbWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTSMiaDivia");

        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        tvInformasiPendaftaran = findViewById(R.id.tv_informasi_pendaftaran);
        cbFacebook = findViewById(R.id.cb_facebook);
        cbInstagram = findViewById(R.id.cb_instagram);
        cbWebsite = findViewById(R.id.cb_website);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Switch (view.getId()){
                    case R.id.cb_facebook;
                        if(cbFacebook.isChecked())
                            Toast.makeText(MainActivity.this, "Facebook", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cb_instagram;
                        if(cbInstagram.isChecked())
                            Toast.makeText(MainActivity.this, "Instagram", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cb_website;
                        if (cbWebsite.isChecked())
                            Toast.makeText(MainActivity.this, "Website", Toast.LENGTH_SHORT).show();
                }
                String namaLengkap = etNamaLengkap.getText(),toString();
                String nomorPendaftaran = etNomorPendaftaran.getText().toString();
                String informasipendaftaran = tvInformasiPendaftaran.getText().toString();

                if (namaLengkap.trim().equals("")){
                    etNamaLengkap.setError("Nama Harus Diisi");
                }
                else if (nomorPendaftaran.trim().equals(" ")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran Harus Diisi");
                }
                else if (informasipendaftaran.trim().equals(" ")){
                    tvInformasiPendaftaran.getText().toString();
                }
                else {
                    Intent pindah = new Intent(MainActivity.this, SecMainActivity.class);
                    pindah.putExtra("NamaLengkap",namaLengkap);
                    pindah.putExtra("NomorPendaftaran",nomorPendaftaran);
                    startActivity(pindah);
                }

            }
        });

    }
}