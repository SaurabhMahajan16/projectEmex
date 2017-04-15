package com.example.saurabh.uipractise.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saurabh.uipractise.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MissedJobsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MissedJobsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MissedJobsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_missed_jobs, container, false);
    }


}
