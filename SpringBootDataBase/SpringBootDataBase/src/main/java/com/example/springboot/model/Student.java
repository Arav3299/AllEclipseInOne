package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Entity
@Table(name="student_table")
@Data
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

 
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_pinno")
	private int studentPinno;
	
}