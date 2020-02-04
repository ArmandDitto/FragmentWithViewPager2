package com.ditto.training.belajarfragmentdenganviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    TextView tvDeskripsiIsi, tvDeskripsiJudul, tvDeskripsiHarga;
    ImageView ivDeskripsiGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        MenuAku.MenuMakanan deskripsiMenuMakanan = getIntent().getParcelableExtra("DeskripsiMenuMakanan");
        String isideskripsiku = deskripsiMenuMakanan.getDeskripsiMakanan();
        String juduldeskripsiku = deskripsiMenuMakanan.getNamaMakanan();
        String hargadeskripsiku = deskripsiMenuMakanan.getHargaMakanan();
        int gambardeskripsiku = deskripsiMenuMakanan.getGambarMakanan();

        tvDeskripsiIsi = findViewById(R.id.tv_deskripsi_isi);
        tvDeskripsiIsi.setText(isideskripsiku);
        tvDeskripsiJudul = findViewById(R.id.tv_deskripsi_judul);
        tvDeskripsiJudul.setText(juduldeskripsiku);
        tvDeskripsiHarga = findViewById(R.id.tv_deskripsi_harga);
        tvDeskripsiHarga.setText(hargadeskripsiku);
        ivDeskripsiGambar = findViewById(R.id.iv_deskripsi_gambar);
        ivDeskripsiGambar.setImageResource(gambardeskripsiku);

    }
}
