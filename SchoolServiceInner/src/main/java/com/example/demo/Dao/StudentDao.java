package com.example.demo.Dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.School;

@Repository
public interface StudentDao extends CrudRepository<School, Integer> {

	@Query
	public Iterable<School> findAllByStudentSchool(String school);
}
