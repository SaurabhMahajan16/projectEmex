package com.example.saurabh.uipractise.Adaptor;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.saurabh.uipractise.R;

/**
 * Created by saurabh on 15/4/17.
 */

public class JobHistoryAdapter extends RecyclerView.Adapter<JobHistoryAdapter.ViewHolder> {
    public JobHistoryAdapter() {
    }

    @Override
    public JobHistoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(JobHistoryAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    private class ViewHolder extends RecyclerView.ViewHolder {
        private View vRedCircle, vHrLine, vVerticalLine;
        private LinearLayout llBottom;
        private TextView tvDateAndTime, tvDistance, tvDriverName, tvDestination, tvPickup, tvFare, tvRideTime;

        /**
         * @param itemView viewtype
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvDateAndTime = (TextView) itemView.findViewById(R.id.tvDateAndTime);
            tvDistance = (TextView) itemView.findViewById(R.id.tvDistance);
            tvDriverName = (TextView) itemView.findViewById(R.id.tvDriverName);
            tvDestination = (TextView) itemView.findViewById(R.id.tvDestination);
            tvPickup = (TextView) itemView.findViewById(R.id.tvPickUp);
            tvRideTime = (TextView) itemView.findViewById(R.id.tvRideTime);
            tvFare = (TextView) itemView.findViewById(R.id.tvFare);
            vRedCircle = itemView.findViewById(R.id.vRedCircle);
            vHrLine = itemView.findViewById(R.id.hrLine);
            llBottom = (LinearLayout) itemView.findViewById(R.id.llBottom);
            vVerticalLine = itemView.findViewById(R.id.vVerticalLine);
        }
    }
}
