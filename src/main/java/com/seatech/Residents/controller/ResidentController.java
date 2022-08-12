package com.seatech.Residents.controller;

import com.seatech.Residents.model.Resident;
import com.seatech.Residents.repositories.ResidentRepositoryInterface;
import com.seatech.Residents.services.ResidentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Allow localhost 3000 (ui) to make requests
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/v1/residents")
public class ResidentController {

    @Autowired
    private ResidentServiceInterface residentServiceInterface;
    //Dependency injection

    public ResidentController(ResidentServiceInterface residentServiceInterface) {
        this.residentServiceInterface = residentServiceInterface;
    }

    @PostMapping("/create")
    public Resident createResident(@RequestBody Resident resident){
        return residentServiceInterface.createResident(resident);
    }

    @GetMapping("/getAll")
    public List<Resident> getResidents(){
        return residentServiceInterface.getAllResidents();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity getResidentById(@PathVariable Long id){
        return residentServiceInterface.getResidentById(id);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity updateResident(@PathVariable Long id,@RequestBody Resident resident){
        return residentServiceInterface.updateResidentById(id, resident);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteResident(@PathVariable Long id){
       return residentServiceInterface.deleteResident(id);
    }

}
