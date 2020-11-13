package com.novyapp.tp2_exo4_20201103;

import java.util.ArrayList;

public class Concession {

    private  ArrayList<Vehicle> mVehicles = new ArrayList<>();


    public void addVehicle(Vehicle vehicle) {
        mVehicles.add(vehicle);
    }

    public Walker<Vehicle> getVehicules() {
        return new Walker<Vehicle>() {
            int idx = 0;
            @Override
            public boolean hasNext() {
                return (idx != mVehicles.size() - 1) && (mVehicles.get(idx++) != null);
            }

            @Override
            public Vehicle next() {
                return mVehicles.get(idx);
            }
        };
    }
}
