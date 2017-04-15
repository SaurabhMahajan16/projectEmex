package com.example.saurabh.uipractise.Adaptor;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.saurabh.uipractise.Model.JobHistory;
import com.example.saurabh.uipractise.R;

import java.util.ArrayList;

/**
 * Adapter class assign values to row of recyclerView
 */

public class JobHistoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<JobHistory> mJobHistoryModel;
    private int mMode;

    /**
     * constructor
     * @param mode is for check of which fragment is to be shown
     * @param mJobHistoryModel object of arraylist of jobHistory model
     */
    public JobHistoryAdapter(final int mode, final ArrayList<JobHistory> mJobHistoryModel) {
        mMode = mode;
        this.mJobHistoryModel = mJobHistoryModel;
    }

    /**
     *
     * @param parent parent
     * @param viewType gives type of view
     * @return inflated view
     */
    @Override
    public JobHistoryAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row,parent,false);
        return new ViewHolder(view);
    }

    /**
     * binds view to the layout
     * @param holder holds the layout
     * @param position gives the position
     */
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder,final int position) {
        JobHistory jobHistory = mJobHistoryModel.get(position);
       ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.tvDateAndTime.setText(jobHistory.getDateAndTime());
        viewHolder.tvDistance.setText(jobHistory.getDistance());
        viewHolder.tvPickup.setText(jobHistory.getPickupAddress());
        if(mMode == 1){
            viewHolder.tvDestination.setVisibility(View.GONE);
            viewHolder.tvRedCircle.setVisibility(View.GONE);
            viewHolder.vBottomLine.setVisibility(View.GONE);
            viewHolder.tvRideTime.setVisibility(View.GONE);
            viewHolder.vDistanceLine.setVisibility(View.GONE);
            viewHolder.tvAmountText.setVisibility(View.GONE);
            viewHolder.tvFare.setVisibility(View.GONE);
            viewHolder.tvDriverName.setText(jobHistory.getDriverName());
        }else {
            viewHolder.tvDriverName.setVisibility(View.GONE);
            viewHolder.tvDestination.setText(jobHistory.getDestination());
            viewHolder.tvFare.setText(jobHistory.getFare());

        }






    }

    /**
     * returns item count
     * @return size
     */
    @Override
    public int getItemCount() {
        return mJobHistoryModel.size();
    }

    /**
     * inner class
     */
    private class ViewHolder extends RecyclerView.ViewHolder {
        private View  vDistanceLine, vBottomLine;
        private TextView tvDateAndTime, tvDistance, tvDriverName, tvDestination, tvPickup,
                tvFare, tvRideTime, tvRedCircle, tvAmountText;

        /**
         * @param itemView viewtype
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvDateAndTime = (TextView) itemView.findViewById(R.id.tv_date);
            tvDistance = (TextView) itemView.findViewById(R.id.tv_distance);
            tvDestination = (TextView) itemView.findViewById(R.id.tv_destination);
            tvPickup = (TextView) itemView.findViewById(R.id.tv_pickup);
            tvRideTime = (TextView) itemView.findViewById(R.id.tv_ridetime);
            tvFare = (TextView) itemView.findViewById(R.id.tv_fare);
            tvRedCircle = (TextView) itemView.findViewById(R.id.tv_circlered);
            vDistanceLine = itemView.findViewById(R.id.v_destinationline);
            vBottomLine = itemView.findViewById(R.id.v_line_above_payment);
            tvAmountText = (TextView) itemView.findViewById(R.id.tv_amounttext);
            tvDriverName = (TextView) itemView.findViewById(R.id.tv_drivername);

        }
    }
}
