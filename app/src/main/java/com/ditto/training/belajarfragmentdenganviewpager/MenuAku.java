package com.ditto.training.belajarfragmentdenganviewpager;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

class MenuAku {
    private String judulMenu;
    private ArrayList <MenuMakanan> dataMenu;

    public static class MenuMakanan implements Parcelable {
        private String namaMakanan;
        private String hargaMakanan;
        private String deskripsiMakanan;
        private int gambarMakanan;

        public MenuMakanan(String namaMakananku, String hargaMakananku, String deskripsiMakananku, int gambarMakananku){
            this.namaMakanan = namaMakananku;
            this.hargaMakanan = hargaMakananku;
            this.deskripsiMakanan = deskripsiMakananku;
            this.gambarMakanan = gambarMakananku;
        }

        public String getNamaMakanan() {
            return namaMakanan;
        }

        public String getHargaMakanan() {
            return hargaMakanan;
        }

        public String getDeskripsiMakanan() {
            return deskripsiMakanan;
        }

        public int getGambarMakanan() {
            return gambarMakanan;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.namaMakanan);
            dest.writeString(this.hargaMakanan);
            dest.writeString(this.deskripsiMakanan);
            dest.writeInt(this.gambarMakanan);
        }

        protected MenuMakanan(Parcel in) {
            namaMakanan = in.readString();
            hargaMakanan = in.readString();
            deskripsiMakanan = in.readString();
            gambarMakanan= in.readInt();
        }

        public static final Creator<MenuMakanan> CREATOR = new Creator<MenuMakanan>() {
            @Override
            public MenuMakanan createFromParcel(Parcel in) {
                return new MenuMakanan(in);
            }

            @Override
            public MenuMakanan[] newArray(int size) {
                return new MenuMakanan[size];
            }
        };
    }

    public MenuAku(String judul, ArrayList<MenuMakanan> data){
        this.judulMenu = judul;
        this.dataMenu = data;
    }

    public String getJudulMenu() {
        return judulMenu;
    }

    public ArrayList<MenuMakanan> getData() {
        return dataMenu;
    }
}
