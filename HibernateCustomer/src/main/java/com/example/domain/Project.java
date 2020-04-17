package com.example.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "customerProject")
public class Project{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="projectId")
	String customerProjectId;
	
	
	String customerProjectName;
	Boolean isDone;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "customerProject")
	private Customer customer;
	
}
