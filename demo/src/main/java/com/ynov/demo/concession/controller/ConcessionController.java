package com.ynov.demo.concession.controller;

import com.ynov.demo.concession.domain.Vehicle;
import com.ynov.demo.concession.service.ConcessionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/rest/concession")
public class ConcessionController {

    ConcessionService concessionService;
    public ConcessionController(ConcessionService concessionService) {
        this.concessionService = concessionService;
    }

    @GetMapping("/vehicle")
    @ResponseStatus(HttpStatus.OK)
    public List<Vehicle> getVehicles() {
        return concessionService.getVehicles();
    }

    @GetMapping("/vehicle/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Vehicle getVehicle(@PathVariable int id){
        if (id >= concessionService.getVehicles().size()) throw new VehicleNotFoundException();
        return concessionService.getVehicle(id);
    }

    @GetMapping("/vehicle/generate")
    @ResponseStatus(HttpStatus.OK)
    public void generateVehicles() {
        concessionService.generateVehicles();
    }


}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "video not found")
class VehicleNotFoundException extends RuntimeException {
}
