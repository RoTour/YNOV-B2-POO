package com.ynov.demo.concession.service;

import com.ynov.demo.concession.dao.VehicleRepository;
import com.ynov.demo.concession.domain.Vehicle;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ConcessionService {
    VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }

    public void addVehicle(Vehicle newVehicle){
        vehicleRepository.save(newVehicle);
    }

    public Vehicle getVehicle(int id) {
        Optional<Vehicle> result = vehicleRepository.findById((long) id);
        if(result.isEmpty()) return null;
        return result.get();
    }
    public ConcessionService(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    public void generateVehicles() {
        vehicleRepository.save(new Vehicle("AA888BB"));
        vehicleRepository.save(new Vehicle("AA999DD"));
    }

}
