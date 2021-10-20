package com.example.magicfragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

import static android.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN;

public class HomeFragment extends Fragment {
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button button1 = view.findViewById(R.id.item_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.right_content, DetailFragment.newInstance("item_1"))
                        .setTransition(TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });
        Button button2 = view.findViewById(R.id.item_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.right_content, DetailFragment.newInstance("item_2"))
                        .setTransition(TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });
        return view;
    }
}
