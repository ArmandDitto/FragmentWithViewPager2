package com.ditto.training.belajarfragmentdenganviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    TextView tvDeskripsiIsi;
    TextView tvDeskripsiJudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        MenuAku.MenuMakanan deskripsiMenuMakanan = getIntent().getParcelableExtra("DeskripsiMenuMakanan");
        String isideskripsiku = deskripsiMenuMakanan.getDeskripsiMakanan();
        String juduldeskripsiku = deskripsiMenuMakanan.getNamaMakanan();
        tvDeskripsiIsi = findViewById(R.id.tv_deskripsi_isi);
        tvDeskripsiIsi.setText(isideskripsiku);
        tvDeskripsiJudul = findViewById(R.id.tv_deskripsi_judul);
        tvDeskripsiJudul.setText(juduldeskripsiku);
    }
}
