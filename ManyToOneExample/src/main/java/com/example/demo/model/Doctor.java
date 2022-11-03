package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="doctor_table")
@Data
@AllArgsConstructor
@SequenceGenerator(name="doctor",sequenceName="doctor_gene",initialValue=1000)
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="doctor")
	@Column(name="doctor_id")
	private long doctorId;
	
	@Column(name="first_name")
	public String firstName;
	 
	@Column(name="last_name")
	public String lastName;
	
	@Column(name="age")
	public int age;
	
	@Column(name="specialization")
	public String specialization;

 
	
	
}
