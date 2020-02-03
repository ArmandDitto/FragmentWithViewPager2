package com.ditto.training.belajarfragmentdenganviewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public ListView lvHome;
    //public ArrayAdapter<MenuAku.MenuMakanan> arrayAdapterku;
    public CustomListAdapter customListAdapter;
    public static ArrayList<MenuAku.MenuMakanan> arrayListku;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootViewku = inflater.inflate(R.layout.fragment_home, container, false);
        //arrayAdapterku = new ArrayAdapter<>(getContext(), R.layout.layout_menuku,R.id.tv_makanan, arrayListku);
        customListAdapter = new CustomListAdapter(getContext(), arrayListku);
        lvHome = rootViewku.findViewById(R.id.lv_home);
        lvHome.setAdapter(customListAdapter);

        return rootViewku;
    }

    public static HomeFragment newInstance(ArrayList<MenuAku.MenuMakanan> menuMakananku){
        HomeFragment homeFragment = new HomeFragment();
        arrayListku = menuMakananku;
        return homeFragment;
    }
}
