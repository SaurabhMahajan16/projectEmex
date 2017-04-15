package com.example.saurabh.uipractise.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.saurabh.uipractise.Fragment.JobMissedHistoryFragment;

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
            return new JobMissedHistoryFragment();
        } else {
            return new JobMissedHistoryFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
