package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.DAO.AccountDao;
import com.example.demo.model.Account;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	@Override
	public List<Account> showAll() {
		// TODO Auto-generated method stub
		Iterator<Account> it= accountDao.findAll().iterator();
		List<Account>li=new ArrayList<Account>();
		while(it.hasNext())
		{
			Account ac=it.next();
			li.add(ac);
		}
		return li;
	}

	@Override
	public void addAccount(Account a) {
		// TODO Auto-generated method stub
		accountDao.save(a);

	}

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		return accountDao.findById(id).get();
	}

}
