package com.novyapp.tp2_exo5_20201103;

public class Car extends Vehicle {

    public Car(int nbWheels, String color) {
        super(nbWheels, color);
    }

    @Override
    public String toString() {
        return Car.class.getName() + ": " + super.toString();
    }
}
