package com.f4.hellopuppyreservation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.f4.hellopuppyreservation.service.ReservationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	
	/*
	 * @GetMapping("/members/teams/{teamId}") public ResponseEntity<List<Alram>>
	 * getTeamMember(@PathVariable Long teamId) { return null; //return
	 * ResponseEntity.ok().body(alramService.findAllMemberByTeamId(teamId)); }
	 */

}
