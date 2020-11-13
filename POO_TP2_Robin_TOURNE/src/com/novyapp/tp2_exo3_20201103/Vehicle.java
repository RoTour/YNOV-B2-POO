package com.novyapp.tp2_exo3_20201103;

public class Vehicle {
    private int mNumberOfWheels = 4;
    private String mColor = "white";

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

    @Override
    public String toString() {
        return "number of wheels: " + mNumberOfWheels + ", color: " + mColor;
    }
}
