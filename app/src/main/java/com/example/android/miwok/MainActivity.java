package com.example.android.miwok;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //fetch the viewPager to show the fragments content on it.
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        //create an instance of the class which is the manager of the items(fragments).
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(),this);
        //set the adapter with the items to the viewPager.
        viewPager.setAdapter(adapter);

        //fetch the tabLayout which will be responsible of moving between the items.
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}