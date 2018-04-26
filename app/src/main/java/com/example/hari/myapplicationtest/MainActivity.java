package com.example.hari.myapplicationtest;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements tab1.OnFragmentInteractionListener, tab3.OnFragmentInteractionListener, tab2.OnFragmentInteractionListener, tab4.OnFragmentInteractionListener, tab5.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_forum_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_group_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_phonelink_setup_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_account_balance_wallet_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_cloud_upload_black_24dp));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
