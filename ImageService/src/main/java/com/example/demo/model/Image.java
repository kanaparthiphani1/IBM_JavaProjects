package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String imageUrl;
	@Column
	private String imageDesc;
	@Column
	private String port;
	public Image(String imageUrl, String imageDesc) {
		super();
		this.imageUrl = imageUrl;
		this.imageDesc = imageDesc;
	}
	public Image(String imageUrl, String imageDesc, String port) {
		super();
		this.imageUrl = imageUrl;
		this.imageDesc = imageDesc;
		this.port = port;
	}
}
