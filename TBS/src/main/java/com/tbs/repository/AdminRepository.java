package com.tbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbs.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
