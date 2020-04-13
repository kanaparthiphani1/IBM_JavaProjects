package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public void updateAccount(int id,int balance);
	public void deleteAccount(int id);
	public List<Account> showAll();
	public Account showbyId(int id);
}
