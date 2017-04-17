package com.example.saurabh.uipractise;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.saurabh.uipractise.Fragment.JobHistoryFragment;
import com.example.saurabh.uipractise.Fragment.MapFragment;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * navigation drawer activity
 */

public class NavDrawerActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imgbtnDrawer;
    private DrawerLayout mDrawer;
    private TextView tvTitle, tvJobHistory, tvPayments, tvlogout, tvNetworks;

    /**
     * on starting of an activity
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer_actvity);
        init();
        imgbtnDrawer.setImageResource(R.drawable.ic_dehaze_black_24dp);

        imgbtnDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openDrawer(Gravity.START);
            }
        });
        tvJobHistory.setOnClickListener(this);
        tvPayments.setOnClickListener(this);
        tvlogout.setOnClickListener(this);
        tvNetworks.setOnClickListener(this);
    }


    /**
     * find all ids
     */
    public void init() {
        imgbtnDrawer = (ImageButton) findViewById(R.id.ib_back);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvJobHistory = (TextView) findViewById(R.id.tv_jobhistory);
        tvPayments = (TextView) findViewById(R.id.tv_payment);
        tvlogout = (TextView) findViewById(R.id.tv_logout);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        tvNetworks = (TextView) findViewById(R.id.tv_networks);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        JobHistoryFragment jobHistoryFragment = new JobHistoryFragment();
        MapFragment mapFragment = new MapFragment();
        switch (id) {
            case R.id.tv_networks:

                tvTitle.setText(getString(R.string.maps));
                fragmentTransaction.replace(R.id.container, mapFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.tv_payment:

                tvTitle.setText(getString(R.string.job_history));
                fragmentTransaction.replace(R.id.container, jobHistoryFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.tv_jobhistory:
                tvTitle.setText(getString(R.string.job_history));
                fragmentTransaction.replace(R.id.container, jobHistoryFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.tv_logout:
                finish();
            default:
                break;
        }
        mDrawer.closeDrawer(Gravity.START);
    }

}

