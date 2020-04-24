package com.example.demo.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.ProjectDTO;
import com.example.demo.model.Project;
@Repository
public interface ProjectDao extends CrudRepository<Project, Integer>{

	@Query
	public Iterable<Project> findByName(String name);
	
	@Query
	public Iterable<Project> findByNameAndAuthor(String name,String author);
	
	@Query
	public void removeByName(String name);
}
