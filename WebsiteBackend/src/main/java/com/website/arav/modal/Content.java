package com.website.arav.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="content_table")
public class Content {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contentId;
	
	private String imageUrl;
	
	private String title;
	
	private String subTitle;
	
	private long price;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	
}
