package com.ditto.training.belajarfragmentdenganviewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vpAku;
    private ViewPagerAdapter vpAdapterku;
    private TabLayout tabLayoutku;
    private ArrayList<String> titleAku, dataAku;

    private ArrayList<MenuAku> kumpulanMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleAku = new ArrayList<>();
        dataAku = new ArrayList<>();
        kumpulanMenu = new ArrayList<>();

        generateTitle();
        generateData();
        generateMenu();

        vpAku = findViewById(R.id.vp_aku);
        //vpAdapterku = ViewPagerAdapter.newInstance(getSupportFragmentManager(), titleAku, dataAku);
        vpAdapterku = ViewPagerAdapter.newInstance(getSupportFragmentManager(), kumpulanMenu);

        vpAku.setAdapter(vpAdapterku);

        tabLayoutku = findViewById(R.id.tab_layout);
        tabLayoutku.setupWithViewPager(vpAku);
    }

    //Dummy Data
    private void generateData(){
        dataAku.add("Data 1");
        dataAku.add("Data 2");
        dataAku.add("Data 3");
        dataAku.add("Data 4");
        dataAku.add("Data 5");
    }

    //Dummy Title
    private void generateTitle(){
        titleAku.add("Home");
        titleAku.add("Favorite");
        titleAku.add("Genre");
        titleAku.add("Download");
        titleAku.add("Kids");
    }

    //Dummy Menu Aku
    private void generateMenu(){
        kumpulanMenu.add(new MenuAku("Home", "Data 001"));
        kumpulanMenu.add(new MenuAku("Favorite", "Data 002"));
        kumpulanMenu.add(new MenuAku("Genre", "Data 003"));
        kumpulanMenu.add(new MenuAku("Download", "Data 004"));
        kumpulanMenu.add(new MenuAku("Kids", "Data 005"));
    }
}
