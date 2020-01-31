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
    private static int numOfItems = 0;
    //
    public static ViewPagerAdapter newInstance(FragmentManager fm, ArrayList myTitle, ArrayList myData){
        ViewPagerAdapter viewPagerAdapterku = new ViewPagerAdapter(fm);
        myTitleX = myTitle;
        myDataX = myData;
        numOfItems = myData.size();
        return viewPagerAdapterku;
    }

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
        return myTitleX.get(position);
    }

    @Override
    public int getCount() { //Untuk Menghitung jumlah item
        return numOfItems;
    }
}
