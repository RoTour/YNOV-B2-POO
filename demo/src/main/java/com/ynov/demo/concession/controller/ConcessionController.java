package com.ynov.demo.concession.controller;

import com.ynov.demo.concession.domain.Vehicle;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/rest/concession")
public class ConcessionController {

    @GetMapping("/vehicle")
    @ResponseStatus(HttpStatus.OK)
    public List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("AA888AA"));
        vehicles.add(new Vehicle("BB555BB"));
        vehicles.add(new Vehicle("CC444CC"));
        return vehicles;
    }

    @GetMapping("/vehicle/{registration}")
    @ResponseStatus(HttpStatus.OK)
    public Vehicle getVehicle(@PathVariable String registration){
        return new Vehicle(registration);
    }

}
