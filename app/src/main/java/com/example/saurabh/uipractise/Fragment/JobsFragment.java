package com.example.saurabh.uipractise.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saurabh.uipractise.Adaptor.JobHistoryAdapter;
import com.example.saurabh.uipractise.AppConstants.Constants;
import com.example.saurabh.uipractise.Model.JobHistory;
import com.example.saurabh.uipractise.R;

import java.util.ArrayList;

/**
 * class of fragment creating object of fragments
 */

public class JobsFragment extends Fragment implements Constants {

    /**
     * @param fragmentTag mode
     * @param jobHistory  array list
     * @return fragment
     */
    public static Fragment getInstance(final int fragmentTag,
                                       final ArrayList<JobHistory> jobHistory) {
        JobsFragment jobsFragment = new JobsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(String.valueOf(R.string.mode), fragmentTag);
        bundle.putParcelableArrayList(String.valueOf(R.string.data), jobHistory);
        jobsFragment.setArguments(bundle);
        return jobsFragment;


    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jobs, container, false);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int mode;
            mode = bundle.getInt(String.valueOf(R.string.mode));
            ArrayList<JobHistory> jobMissedHistoryModels = bundle.
                    getParcelableArrayList(String.valueOf(R.string.data));
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_history);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            JobHistoryAdapter missedHistoryJobsAdapter = new JobHistoryAdapter(mode,
                    jobMissedHistoryModels);
            recyclerView.setAdapter(missedHistoryJobsAdapter);
        }
        return view;
    }
}
