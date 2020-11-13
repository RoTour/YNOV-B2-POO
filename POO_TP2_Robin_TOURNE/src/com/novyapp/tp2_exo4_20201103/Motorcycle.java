package com.novyapp.tp2_exo4_20201103;

public class Motorcycle extends Vehicle {


    public Motorcycle(int mNumberOfWheels, String mColor) {
        super(mNumberOfWheels, mColor);
    }

    @Override
    public String toString() {
        return Motorcycle.class.getName() + ": " + super.toString();
    }
}
