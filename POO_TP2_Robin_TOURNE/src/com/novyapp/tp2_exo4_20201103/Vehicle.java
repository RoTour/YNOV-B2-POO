package com.novyapp.tp2_exo4_20201103;

public class Vehicle {
    private int mNumberOfWheels = 4;
    private String mColor = "white";
    private String mRegistration = "0000000";

    public Vehicle(int mNumberOfWheels, String mColor) {
        this.mNumberOfWheels = mNumberOfWheels;
        this.mColor = mColor;
    }

    public int getNumberOfWheels() {
        return mNumberOfWheels;
    }

    public void setNumberOfWheels(int mNumberOfWheels) {
        this.mNumberOfWheels = mNumberOfWheels;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String mColor) {
        this.mColor = mColor;
    }

    public String getRegistration() {
        return mRegistration;
    }

    public void setRegistration(String registration) {
        mRegistration = registration;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Vehicle)) return false;
        return (mNumberOfWheels == ((Vehicle)obj).getNumberOfWheels()) &&
                (mColor.equals(((Vehicle) obj).getColor())) &&
                (mRegistration.equals(((Vehicle) obj).mRegistration));
    }

    @Override
    public String toString() {
        return "number of wheels: " + mNumberOfWheels + ", color: " + mColor;
    }
}
