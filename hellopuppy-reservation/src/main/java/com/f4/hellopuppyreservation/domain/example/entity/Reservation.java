package com.f4.hellopuppyreservation.domain.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.f4.hellopuppyreservation.domain.example.enums.Location;
import com.f4.hellopuppyreservation.domain.example.enums.ResvState;
import com.f4.hellopuppyreservation.domain.example.vo.MemberInfo;
import com.f4.hellopuppyreservation.domain.example.vo.PetInfo;
import com.f4.hellopuppyreservation.domain.example.vo.WalkmanInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "resv_dt")
	private String resvDt;
	
	@Column(name = "resv_time")
	private String resvTime;
	
	@Column(name = "location")
	@Enumerated(EnumType.STRING)
	private Location location;
	
	@Column(name = "walk_time")
	private int	walkTime;
	
	@Column(name = "resv_state")
	@Enumerated(EnumType.STRING)
	private ResvState resvState;
	
	@Column(name = "member_info")
	@Embedded
	private MemberInfo memberInfo;
	
	@Column(name = "walkman_info")
	@Embedded
	private WalkmanInfo walkmanInfo;
	
	@Column(name = "pet_info")
	@Embedded
	private PetInfo petInfo;
	
	@Column(name = "create_dt")
	private Date createDt;
	
	@Column(name = "update_dt")
	private Date updateDt;
	
}
