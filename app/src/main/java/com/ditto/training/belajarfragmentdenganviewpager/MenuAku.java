package com.ditto.training.belajarfragmentdenganviewpager;

import java.util.ArrayList;

class MenuAku {
    private String judulMenu;
    private String dataMenu;

    public class MenuMakanan{

    }

    public MenuAku(String judul, String data){
        this.judulMenu = judul;
        this.dataMenu = data;
    }

    public String getJudulMenu() {
        return judulMenu;
    }

    public String getData() {
        return dataMenu;
    }
}
