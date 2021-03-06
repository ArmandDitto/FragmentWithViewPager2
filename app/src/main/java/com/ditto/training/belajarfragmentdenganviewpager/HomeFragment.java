package com.ditto.training.belajarfragmentdenganviewpager;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
    public ArrayList<MenuAku.MenuMakanan> arrayListku;

    public HomeFragment() {
        // Required empty public constructor
    }

    public void setData(ArrayList<MenuAku.MenuMakanan> menuMakanans){
        this.arrayListku = menuMakanans;
    }

    public void cek(){
        lvHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent deskripsiActivity = new Intent(getActivity(),DescriptionActivity.class);
                deskripsiActivity.putExtra("DeskripsiMenuMakanan", customListAdapter.getItem(position));
                startActivity(deskripsiActivity);
            }
        });
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
        cek();

        return rootViewku;
    }

    public HomeFragment newInstance(ArrayList<MenuAku.MenuMakanan> menuMakananku){
        HomeFragment homeFragment = new HomeFragment();
        arrayListku = menuMakananku;
        return homeFragment;
    }
}
