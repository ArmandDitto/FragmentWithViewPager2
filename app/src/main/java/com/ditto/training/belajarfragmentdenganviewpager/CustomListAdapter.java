package com.ditto.training.belajarfragmentdenganviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

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
    public MenuAku.MenuMakanan getItem(int position) {
        MenuAku.MenuMakanan menuMakanan = makanan.get(position);
        return menuMakanan;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        MenuAku.MenuMakanan currentMenuMakanan = (MenuAku.MenuMakanan) getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_menuku, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }


        viewHolder.tvMakanan.setText(position+". "+currentMenuMakanan.getNamaMakanan());
        viewHolder.tvHarga.setText(currentMenuMakanan.getHargaMakanan());
        return convertView;
    }

    private class ViewHolder{
        TextView tvMakanan;
        TextView tvHarga;

        public ViewHolder(View view){
            tvMakanan = view.findViewById(R.id.tv_makanan);
            tvHarga = view.findViewById(R.id.tv_harga);
        }
    }
}
