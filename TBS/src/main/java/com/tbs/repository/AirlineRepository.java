package com.tbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbs.entity.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Integer> {

}
