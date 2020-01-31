package com.ditto.training.belajarfragmentdenganviewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager vpAku;
    private ViewPagerAdapter vpAdapterku;
    private TabLayout tabLayoutku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpAku = findViewById(R.id.vp_aku);
        vpAdapterku = new ViewPagerAdapter(getSupportFragmentManager());

        vpAku.setAdapter(vpAdapterku);

        tabLayoutku = findViewById(R.id.tab_layout);
        tabLayoutku.setupWithViewPager(vpAku);
    }
}
