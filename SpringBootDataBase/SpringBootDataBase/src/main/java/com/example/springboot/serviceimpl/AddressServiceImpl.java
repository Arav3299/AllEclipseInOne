package com.example.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.Address;
import com.example.springboot.repository.AddressRepository;
import com.example.springboot.service.AddressService;

@Service

public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public Address addAddress(Address address) {
		
		return addressRepository.save(address);
	}

}
