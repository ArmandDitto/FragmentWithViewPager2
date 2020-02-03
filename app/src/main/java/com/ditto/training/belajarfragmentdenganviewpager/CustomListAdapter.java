package com.ditto.training.belajarfragmentdenganviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MenuAku.MenuMakanan> makanan;

    public CustomListAdapter(Context contextku, ArrayList<MenuAku.MenuMakanan> makananku) {
        this.context = contextku;
        this.makanan = makananku;
    }

    @Override
    public int getCount() {
        return makanan.size();
    }

    @Override
    public Object getItem(int position) {
        return makanan.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tvMakanan;
        TextView tvHarga;
        MenuAku.MenuMakanan currentMenuMakanan = (MenuAku.MenuMakanan) getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_menuku, parent, false);
        }
        tvMakanan = convertView.findViewById(R.id.tv_makanan);
        tvHarga = convertView.findViewById(R.id.tv_harga);

        tvMakanan.setText(currentMenuMakanan.getNamaMakanan());
        tvHarga.setText(currentMenuMakanan.getHargaMakanan());
        return convertView;
    }
}
