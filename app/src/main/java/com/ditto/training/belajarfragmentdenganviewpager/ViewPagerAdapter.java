package com.ditto.training.belajarfragmentdenganviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static ArrayList<MenuAku> myMenuX;
    private static int numOfItems = 0;

    //Overloading
    public static ViewPagerAdapter newInstance(FragmentManager fm, ArrayList <MenuAku> myMenu){
        ViewPagerAdapter menuAku = new ViewPagerAdapter(fm);
        myMenuX = myMenu;
        numOfItems = myMenu.size();
        return menuAku;
    }

    //Constructor
    public ViewPagerAdapter(FragmentManager fragmentManagerku){
        super(fragmentManagerku, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

    }

    //Hasil Implements Method
    @NonNull
    @Override
    public Fragment getItem(int position) { //Untuk Mengambil Item
        HomeFragment homeFragmentku = null;

        homeFragmentku = HomeFragment.newInstance(myMenuX.get(position).getData());

        return homeFragmentku;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        title = myMenuX.get(position).getJudulMenu();
        return title;
    }

    @Override
    public int getCount() { //Untuk Menghitung jumlah item
        return numOfItems;
    }
}
