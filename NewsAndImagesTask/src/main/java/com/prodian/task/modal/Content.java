package com.prodian.task.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="news_and_image_table")
public class Content {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private long contentId;
	
	@Column(name="image_link")
	private String link;
	
	@Column(name="news_content",columnDefinition = "TEXT")
	private String newsContent;
	
	@Column(name="type")
	private String type;
	
	@Column(name="posted_hours")
	private int postedHours;
	
	@Column(name="share_icon")
	private String shareIcon;
	
	@Column(name="title")
	private String title;
	
}
