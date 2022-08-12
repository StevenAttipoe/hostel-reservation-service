package com.seatech.residents.controller;

import com.seatech.residents.model.Resident;
import com.seatech.residents.services.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/v1/residents")
public class ResidentController {

    @Autowired
    private final ResidentService residentService;

    public ResidentController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @PostMapping("/create")
    public Resident createResident(@RequestBody Resident resident){
        return residentService.createResident(resident);
    }

    @GetMapping("/getAll")
    public List<Resident> getResidents(){
        return residentService.getAllResidents();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity getResidentById(@PathVariable Long id){
        return residentService.getResidentById(id);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity updateResident(@PathVariable Long id,@RequestBody Resident resident){
        return residentService.updateResidentById(id, resident);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteResident(@PathVariable Long id){
       return residentService.deleteResident(id);
    }

}
