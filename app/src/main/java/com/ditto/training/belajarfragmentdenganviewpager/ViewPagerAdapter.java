package com.ditto.training.belajarfragmentdenganviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    //Constructor
    public ViewPagerAdapter(FragmentManager fragmentManagerku){
        super(fragmentManagerku, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    //Hasil Implements Method
    @NonNull
    @Override
    public Fragment getItem(int position) { //Untuk Mengambil Item
        return null;
    }

    @Override
    public int getCount() { //Untuk Menghitung jumlah item
        return 0;
    }
}
