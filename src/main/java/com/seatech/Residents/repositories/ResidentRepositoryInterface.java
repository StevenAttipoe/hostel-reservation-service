package com.seatech.Residents.repositories;

import com.seatech.Residents.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepositoryInterface extends JpaRepository<Resident,Long> {

}
