package com.example.magicfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment homeFragment = HomeFragment.newInstance();
        RelatedFragment relatedFragment = RelatedFragment.newInstance();

        getSupportFragmentManager().beginTransaction().add(R.id.left_content, homeFragment)
                .add(R.id.right_content, relatedFragment)
                .commit();
    }
}