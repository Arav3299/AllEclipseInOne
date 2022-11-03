package com.prodian.task.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="staff_table")
@Data
public class Staff {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int staffId;
	
	@Lob
	private byte[] about;
	
	

}
