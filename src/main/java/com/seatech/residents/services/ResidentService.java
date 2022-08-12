package com.seatech.residents.services;

import com.seatech.residents.model.Resident;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface ResidentService {
    Resident createResident(Resident resident);

    List<Resident> getAllResidents();

    ResponseEntity getResidentById(Long id);

    ResponseEntity updateResidentById(Long id, Resident resident);

    ResponseEntity deleteResident(Long id);
}
