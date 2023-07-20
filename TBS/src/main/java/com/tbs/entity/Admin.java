package com.tbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int Id;
     @Column(length=30,nullable=false)
     private String name;
     @Column(length=10,nullable=false,unique=true)
     private String contact;
}
