package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountService {

	public List<Account> showAll();
	public void addAccount(Account a);
	public Account findById(int id);
}
