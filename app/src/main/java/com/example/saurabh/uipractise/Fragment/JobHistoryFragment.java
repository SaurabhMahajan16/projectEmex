package com.example.saurabh.uipractise.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.saurabh.uipractise.AppConstants.Constants;
import com.example.saurabh.uipractise.Model.JobHistory;
import com.example.saurabh.uipractise.R;


import java.util.ArrayList;

/**
 * fragment class
 */

public class JobHistoryFragment extends Fragment{

    private Button mMissedJobs, mJobHistory;
    private ViewPager viewPager;
    private ArrayList<JobHistory> jobHistory;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_job_missed_history, container, false);
        init(view);
        mJobHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
                changeButtonColor(0);
            }
        });
        mMissedJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
                changeButtonColor(1);
            }
        });
        jobHistory = new ArrayList<>();
        JobHistory jobMissedHistory = new JobHistory("14 June,2016 04:23 PM", "5.6 KM",
                "Suresh Kumar", "3846 W 38 Rd, Shiv Shristi Marg, Mumbai",
                "Silver Oaks Hospital,Laxmi Nagar, Mumbai", "20 min", "Rs. 1832");


        jobHistory.add(jobMissedHistory);


        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(final int position) {
                if (position == 0) {
                     return JobsFragment.getInstance(Constants.COMPLETED, jobHistory);
                }
                return JobsFragment.getInstance(Constants.MISSED, jobHistory);

            }

            @Override
            public int getCount() {
                return 2;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int state) {

            }

            @Override
            public void onPageScrolled(final int position, final float positionOffset,
                                       final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                if (position == 0) {
                    changeButtonColor(0);

                } else if (position == 1) {
                    changeButtonColor(1);
                }
            }
            });





        return view;
    }


            public void init(View v){
        viewPager = (ViewPager) v.findViewById(R.id.vp_swipe);
        mMissedJobs = (Button) v.findViewById(R.id.btn_missedjobs);
        mJobHistory = (Button) v.findViewById(R.id.btn_jobhistory);
    }

    public void changeButtonColor(int change){
        if(change == 0){
            mJobHistory.setBackgroundResource(R.color.bgBlue);
            mMissedJobs.setBackgroundResource(R.color.colorPrimaryDark);}
            else{
            mJobHistory.setBackgroundResource(R.color.colorPrimaryDark);
            mMissedJobs.setBackgroundResource(R.color.bgBlue);
            }
        }
    }

