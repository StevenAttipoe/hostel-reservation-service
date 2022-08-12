package com.seatech.Residents.services;

import com.seatech.Residents.model.Resident;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface ResidentServiceInterface {
    Resident createResident(Resident resident);

    List<Resident> getAllResidents();

    ResponseEntity getResidentById(Long id);

    ResponseEntity updateResidentById(Long id, Resident resident);

    ResponseEntity deleteResident(Long id);
}
