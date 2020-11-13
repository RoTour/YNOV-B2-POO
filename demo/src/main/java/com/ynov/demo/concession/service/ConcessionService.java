package com.ynov.demo.concession.service;

import com.ynov.demo.concession.domain.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConcessionService {
    List<Vehicle> vehicles = new ArrayList<>();

    public ConcessionService() {
        vehicles.add(new Vehicle("AA888BB"));
        vehicles.add(new Vehicle("AA999DD"));
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public void addVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);
    }

    public Vehicle getVehicle(int id) {
        return vehicles.get(id);
    }

}
