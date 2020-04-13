package com.example.demo.repo;

import java.util.List;

import com.example.demo.bean.Account;

public interface AccountRepo {

	public Account createAccount(Account a);
	public void updateAccount(int id,int balance);
	public void deleteAccount(int id);
	public List<Account> showAll();
	public Account showbyId(int id);
}
