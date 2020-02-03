package com.ditto.training.belajarfragmentdenganviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
         import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static ArrayList<String> myDataX;
    private static ArrayList<String> myTitleX;
    private static ArrayList<MenuAku> myMenuX;
    private static int numOfItems = 0;

    public static ViewPagerAdapter newInstance(FragmentManager fm, ArrayList <String> myTitle, ArrayList <String> myData){
        ViewPagerAdapter viewPagerAdapterku = new ViewPagerAdapter(fm);
        myTitleX = myTitle;
        myDataX = myData;
        numOfItems = myTitle.size();
        return viewPagerAdapterku;
    }

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
        homeFragmentku = HomeFragment.newInstance(position, myMenuX.get(position).getData());

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
