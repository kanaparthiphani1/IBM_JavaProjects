package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Account;
import com.mysql.cj.Query;

@Repository
public class AccountRepoImpl implements AccountRepo {

	
	private JdbcTemplate jdbcTenplate;

	
	@Autowired
	public AccountRepoImpl(JdbcTemplate jdbcTenplate) {
		super();
		this.jdbcTenplate = jdbcTenplate;
	}



	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		String query="insert into account(accountNumber,accountType,balance) values('"
				+account.getAccountNo()+"','"
				+account.getType()+"',"+account.getBalance()+")";
		jdbcTenplate.update(query);
		
		return account;
	}



	public void updateAccount(int id,int balance) {
		// TODO Auto-generated method stub
		String query = "update account set balance="+balance+" where id="+id+"";
		int result=jdbcTenplate.update(query);
		if(result==0)
		{
			System.out.println("no account with that id");
		}
		else
		{
			System.out.println("successfuly updated");
		}
	}



	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		String query = "delete from account where accountNumber="+id+"";
		int result=jdbcTenplate.update(query);
		if(result==0)
		{
			System.out.println("no account with that id");
		}
		else
		{
			System.out.println("successfuly deleted");
		}
	}



	public List<Account> showAll() {
		// TODO Auto-generated method stub
		List<Account> list = jdbcTenplate.query("select * from account", new BeanPropertyRowMapper(Account.class));
		return list;
	}



	public Account showbyId(int id) {
		// TODO Auto-generated method stub
		return jdbcTenplate.queryForObject("select * from account where id=?", new Object[] {id}, new BeanPropertyRowMapper(Account.class));
	}

}
