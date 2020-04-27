package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;
@Repository
public interface AccountDao extends CrudRepository<Account, Integer>{

}
