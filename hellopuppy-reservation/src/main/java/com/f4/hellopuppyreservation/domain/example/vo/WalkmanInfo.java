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
public class WalkmanInfo {
	@Column (name="walkman_id")
	private Long walkmanId;
	@Column (name="walkman_name")
	private String walkmanName;
	@Column (name="walkman_phone")
	private String walkmanPhone;
	@Column (name="walkman_address")
	private String walkmanAddress;
	
}
