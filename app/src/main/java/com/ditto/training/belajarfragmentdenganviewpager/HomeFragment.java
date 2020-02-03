package com.ditto.training.belajarfragmentdenganviewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public TextView tvHome;

    public static HomeFragment newInstance(int pos, String data){
        HomeFragment homeFragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt("position", pos);
        args.putString("data", data);
        homeFragment.setArguments(args);
        return homeFragment;
    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootViewku = inflater.inflate(R.layout.fragment_home, container, false);

        tvHome = rootViewku.findViewById(R.id.tv_home);
        tvHome.setText(getArguments().getString("data"));
        return rootViewku;
    }

}
