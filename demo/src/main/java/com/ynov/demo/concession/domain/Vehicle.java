package com.ynov.demo.concession.domain;

public class Vehicle {

    String mRegistration = "";

    public Vehicle() {
    }

    public Vehicle(String registration) {
        mRegistration = registration;
    }

    public String getRegistration() {
        return mRegistration;
    }

    public void setRegistration(String registration) {
        this.mRegistration = registration;
    }
}
