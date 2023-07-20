package com.tbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbs.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,  Integer> {

}
