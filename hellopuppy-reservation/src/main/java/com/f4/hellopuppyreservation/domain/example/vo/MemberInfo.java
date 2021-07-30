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
public class MemberInfo {
	@Column (name="member_id")
	private Long memberId;
	@Column (name="member_name")
	private String memberName;
	@Column (name="member_phone")
	private String memberPhone;
	@Column (name="member_address")
	private String memberAddress;
	
}
