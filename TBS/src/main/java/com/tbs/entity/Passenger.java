package com.tbs.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger extends User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
	@Column(length=30,nullable=false)
	private String name;
	@Column(length=10,nullable=false,unique=true)
	private String phone;
	@Column(length=50,nullable=false,unique=true)
	private String email;

}
