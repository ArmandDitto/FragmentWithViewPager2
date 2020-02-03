package com.ditto.training.belajarfragmentdenganviewpager;

import java.util.ArrayList;

class MenuAku {
    private String judulMenu;
    private ArrayList <MenuMakanan> dataMenu;

    static class MenuMakanan{
        private String namaMakanan;
        private String hargaMakanan;

        public MenuMakanan(String namaMakananku, String hargaMakananku){
            this.namaMakanan = namaMakananku;
            this.hargaMakanan = hargaMakananku;
        }

        public String getNamaMakanan() {
            return namaMakanan;
        }

        public String getHargaMakanan() {
            return hargaMakanan;
        }
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
