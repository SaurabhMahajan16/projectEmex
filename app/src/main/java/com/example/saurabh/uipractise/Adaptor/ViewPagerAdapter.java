package com.example.saurabh.uipractise.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.saurabh.uipractise.Fragment.JobHistoryFragment;

/**
 * view pager adapter
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new JobHistoryFragment();
        } else {
            return new JobHistoryFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
