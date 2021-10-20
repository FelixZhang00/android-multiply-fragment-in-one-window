package com.example.magicfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import static android.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN;

public class DetailFragment extends Fragment {
    private static final String ARG_TITLE = "ARG_TITLE";
    private String title;

    public static DetailFragment newInstance(String title) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getArguments().getString(ARG_TITLE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        ((TextView)view.findViewById(R.id.title)).setText(title);

        Button button3 = view.findViewById(R.id.item_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.left_content, DetailFragment.newInstance("item_3"))
                        .setTransition(TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });
        return view;
    }
}
