package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Entity
@Table(name="patient_table")
@Data
@SequenceGenerator(name="patient",sequenceName="patient_gene",initialValue=2000)
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="patient")
	@Column(name="patient_id")
	private long patientId;
	
	@Column(name="first_name")
	public String firstName;
	 
	@Column(name="last_name")
	public String lastName;
	
	@Column(name="age")
	public int age;
	
	@Column(name="gender")
	public String gender;
	
	@ManyToOne( cascade=CascadeType.DETACH) 
	@JoinColumn(name="doctor_id")
	@OnDelete(action=OnDeleteAction.CASCADE) 
	public Doctor doctor;
	
}