package com.f4.hellopuppyreservation.domain.example.repository.impl;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f4.hellopuppyreservation.domain.example.entity.Reservation;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	//List<Payment> findAllMemberByTeamId(Long id);

}
