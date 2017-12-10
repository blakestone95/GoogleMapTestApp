/**
 * MainActivity
 * Created by: Blake Sawyer
 *
 * Purpose: Put a list fragment and a Google Maps map fragment to display on the same page
 *
 * Last updated: 12/10/2017
 **/

package com.example.blake.googlemaptestapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MyMapFragment mapFrag;
    private MyListFragment listFrag;
    private FragmentManager manager;
    private FragmentTransaction txn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Fragments
        mapFrag = new MyMapFragment();
        listFrag = new MyListFragment();

        // Get Transaction
        manager = getSupportFragmentManager();
        txn = manager.beginTransaction();
        txn.add(R.id.text_list, listFrag, "List_Frag");
        txn.add(R.id.map, mapFrag, "Map_Frag");
        txn.commit();
    }

}