package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="address_table")
@Data
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
    private String city;
	
	@Column(name="pincode")
	private String pincode;
	
	
	
}
