package com.seatech.Residents.services;

import com.seatech.Residents.model.Resident;
import com.seatech.Residents.repositories.ResidentRepositoryInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ResidentService implements ResidentServiceInterface{

    private ResidentRepositoryInterface residentRepositoryInterface;

    public ResidentService(ResidentRepositoryInterface residentRepositoryInterface) {
        this.residentRepositoryInterface = residentRepositoryInterface;
    }

    @Override
    public Resident createResident(Resident resident) {
        residentRepositoryInterface.save(resident);
        return resident;
    }

    @Override
    public List<Resident> getAllResidents() {
        List<Resident> residents = residentRepositoryInterface.findAll();

        return residents;
    }
    @Override
    public ResponseEntity getResidentById(Long id){
        boolean found = residentRepositoryInterface.existsById(id);

        if(found){
            Optional<Resident> residentEntity = residentRepositoryInterface.findById(id);
            return new ResponseEntity<> (residentEntity, HttpStatus.OK);
        }
        return new ResponseEntity<> ("Resident not found", HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity updateResidentById(Long id, Resident newResident){
        boolean found = residentRepositoryInterface.existsById(id);

        if(found){
            residentRepositoryInterface.findById(id)
                    .map(resdident -> {
                        resdident.setResident_id(newResident.getResident_id());
                        resdident.setResident_name(newResident.getResident_name());
                        return residentRepositoryInterface.save(resdident);
                    });
            return new ResponseEntity<> ("Resident is updated", HttpStatus.OK);
        }
        return new ResponseEntity<> ("Resident not found", HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity deleteResident(Long id){
        boolean found = residentRepositoryInterface.existsById(id);

        if(found){
            residentRepositoryInterface.deleteById(id);
            return new ResponseEntity<> ("Resident is deleted", HttpStatus.OK);
        }
        return new ResponseEntity<> ("Resident not found", HttpStatus.BAD_REQUEST);
    }


}
