package com.seatech.residents.repositories;

import com.seatech.residents.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepositoryInterface extends JpaRepository<Resident,Long> {

}
