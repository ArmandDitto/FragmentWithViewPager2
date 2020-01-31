package com.ditto.training.belajarfragmentdenganviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
        HomeFragment homeFragmentku = new HomeFragment();
        FavoriteFragment favoriteFragmentku = new FavoriteFragment();
        Fragment itemku = null;
        switch (position){
            case 0:
                itemku = homeFragmentku;
                break;
            case 1:
                itemku = favoriteFragmentku;
                break;
            default:
                itemku = homeFragmentku;
                break;
        }
        return itemku;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String titleku = null;
        switch (position){
            case 0:
                titleku = "Home";
                break;
            case 1:
                titleku = "Favorite";
                break;
            default:
                titleku = "Default";
                break;
        }
        return titleku;
    }

    @Override
    public int getCount() { //Untuk Menghitung jumlah item
        return 5;
    }
}
