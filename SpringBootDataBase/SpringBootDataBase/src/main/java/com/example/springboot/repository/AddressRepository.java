package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
