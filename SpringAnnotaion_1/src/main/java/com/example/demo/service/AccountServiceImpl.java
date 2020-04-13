package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Account;
import com.example.demo.repo.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepo accountDAO;

	@Autowired
	public AccountServiceImpl(AccountRepo accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}

	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDAO.createAccount(account);
	}

	public void updateAccount(int id,int balance) {
		// TODO Auto-generated method stub
		accountDAO.updateAccount(id,balance);
		
	}

	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		accountDAO.deleteAccount(id);
	}

	public List<Account> showAll() {
		// TODO Auto-generated method stub
		return accountDAO.showAll();
	}

	public Account showbyId(int id) {
		// TODO Auto-generated method stub
		return accountDAO.showbyId(id);
	}
}
