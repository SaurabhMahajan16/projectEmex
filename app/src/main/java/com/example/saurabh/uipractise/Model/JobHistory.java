package com.example.saurabh.uipractise.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by saurabh on 15/4/17.
 */

public class JobHistory implements Parcelable {
    public static final Creator<JobHistory> CREATOR = new Creator<JobHistory>() {
        @Override
        public JobHistory createFromParcel(final Parcel in) {
            return new JobHistory(in);
        }

        @Override
        public JobHistory[] newArray(final int size) {
            return new JobHistory[size];
        }
    };
    private String mDateAndTime, mDistance, mDriverName, mPickupAddress, mDestination, mRideTime, mFare;

    /**
     * constructor assigning value
     * @param mDateAndTime    assigns date and time
     * @param mDistance      assigns travelled distance
     * @param mDriverName    assigns driver name
     * @param mPickupAddress assigns pick up address
     * @param mDestination   assigns destination address
     * @param mRideTime       assigns ride time
     * @param mFare          assigns fare
     */
    public JobHistory(final String mDateAndTime, final String mDistance, final String mDriverName,
                                 final String mPickupAddress, final String mDestination, final String mRideTime,
                                 final String mFare) {
        this.mDateAndTime = mDateAndTime;
        this.mDistance = mDistance;
        this.mDriverName = mDriverName;
        this.mPickupAddress = mPickupAddress;
        this.mDestination = mDestination;
        this.mRideTime = mRideTime;
        this.mFare = mFare;
    }

    /**
     * reads string from object
     * @param in of parcel type object
     */
    protected JobHistory(final Parcel in) {
        mDateAndTime = in.readString();
        mDistance = in.readString();
        mDriverName = in.readString();
        mPickupAddress = in.readString();
        mDestination = in.readString();
        mRideTime = in.readString();
        mFare = in.readString();
    }

    /**
     * @return driver name
     */
    public String getmDriverName() {
        return mDriverName;
    }

    /**
     * @param mDriverName string
     */
    public void setmDriverName(final String mDriverName) {
        this.mDriverName = mDriverName;
    }

    /**
     * @return date and time
     */
    public String getmDateAndTime() {
        return mDateAndTime;
    }

    /**
     * @param mDateAndTime string
     */
    public void setmDateAndTime(final String mDateAndTime) {
        this.mDateAndTime = mDateAndTime;
    }

    /**
     * @return distance
     */
    public String getmDistance() {
        return mDistance;
    }

    /**
     * @param mDistance string returns distance
     */
    public void setmDistance(final String mDistance) {
        this.mDistance = mDistance;
    }

    /**
     * @return destination of path
     */
    public String getmDestination() {
        return mDestination;
    }

    /**
     * @param mDestination string
     */
    public void setmDestination(final String mDestination) {
        this.mDestination = mDestination;
    }

    /**
     * @return pickup address
     */
    public String getmPickupAddress() {
        return mPickupAddress;
    }

    /**
     * @param mPickupAddress string
     */
    public void setmPickupAddress(final String mPickupAddress) {
        this.mPickupAddress = mPickupAddress;
    }

    /**
     * @return ride time
     */
    public String getmRideTime() {
        return mRideTime;
    }

    /**
     * @param mRideTime string
     */
    public void setmRideTime(final String mRideTime) {
        this.mRideTime = mRideTime;
    }

    /**
     * @return fare
     */
    public String getmFare() {
        return mFare;
    }

    /**
     * @param mFare string
     */
    public void setmFare(final String mFare) {
        this.mFare = mFare;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     *
     * @param dest sets values
     * @param flags sets flags
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(mDateAndTime);
        dest.writeString(mDistance);
        dest.writeString(mDriverName);
        dest.writeString(mPickupAddress);
        dest.writeString(mDestination);
        dest.writeString(mRideTime);
        dest.writeString(mFare);
    }
}
