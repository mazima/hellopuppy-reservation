package com.f4.hellopuppyreservation.domain.example.vo;


import javax.persistence.Column;
import javax.persistence.Embeddable;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PetInfo {
	@Column (name="pet_id")
	private Long petId;
	@Column (name="pet_name")
	private String petName;
	@Column (name="pet_age")
	private int petAge;
	@Column (name="pet_gender")
	private String petGender;
	@Column (name="pet_type")
	private String petType;
	@Column (name="pet_size")
	private String petSize;
	@Column (name="pet_bestfood")
	private String petBestfood;
	@Column (name="pet_etc")
	private String petEtc;
	
}
