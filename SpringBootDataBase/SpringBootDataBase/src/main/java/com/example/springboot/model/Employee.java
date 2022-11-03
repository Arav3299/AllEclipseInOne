package com.example.springboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Entity
@Table(name="employee_table")
@Data
public class Employee{
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="date_of_birth") 
	private String dateOfBirth;
	
	@OneToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="address_id")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Address address;
	
  //Condition evaluation unchanged.
  //Application shutdown requested.
	
}
