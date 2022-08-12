package com.seatech.Residents.repositories;

import com.seatech.Residents.entity.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepositoryInterface extends JpaRepository<ResidentEntity,Long> {

}
