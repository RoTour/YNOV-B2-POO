package com.novyapp.tp2_exo5_20201103;

import java.util.*;

public class Concession {

    private ArrayList<Vehicle> mVehicles = new ArrayList<>();
    private LinkedHashMap<String, ArrayList<Vehicle>> mSortedVehicles = new LinkedHashMap<>();


    public void addVehicle(Vehicle vehicle) {
        if(!mSortedVehicles.containsKey(vehicle.getRegistration())){
            mSortedVehicles.put(vehicle.getRegistration(), new ArrayList<>());
        }
        mSortedVehicles.get(vehicle.getRegistration()).add(vehicle);

        mVehicles.add(vehicle);
    }


    public Iterator<Vehicle> getVehicules() {
        return mVehicles.iterator();
    }

    public Set<String> getRegistrations() {
        return mSortedVehicles.keySet();
    }

    public Vehicle getVehicleByRegistration(String registration) {
        return mSortedVehicles.get(registration).get(0);
    }
}
