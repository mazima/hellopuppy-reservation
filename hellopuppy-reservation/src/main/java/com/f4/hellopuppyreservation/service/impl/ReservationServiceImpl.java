package com.f4.hellopuppyreservation.service.impl;


import org.springframework.stereotype.Service;

import com.f4.hellopuppyreservation.domain.example.repository.impl.ReservationRepository;
import com.f4.hellopuppyreservation.service.ReservationService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

	private final ReservationRepository reservationRepository;
	
	/*
	 * @Override public List<Member> findAllMemberByTeamId(Long id) { // TODO
	 * Auto-generated method stub return alramRepository.findAllMemberByTeamId(id);
	 * }
	 */
	

}
