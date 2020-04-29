package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.Users;
@Repository
public interface UsersDao extends CrudRepository<Employee, Integer>{

}
