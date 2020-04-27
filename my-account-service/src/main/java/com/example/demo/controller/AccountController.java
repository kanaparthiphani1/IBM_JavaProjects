package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.AccountService;
import com.example.demo.model.Account;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class AccountController {

	private AccountService accountService;
	
	@GetMapping("/showall")
	public List<Account> showAll()
	{
		return accountService.showAll();
	}
	
	@GetMapping("/show/{id}")
	public Account showById(@PathVariable int id)
	{
		return accountService.findById(id);
	}
	
	
	@PostMapping("/add")
	public Account addAccount(@RequestBody Account a)
	{
		accountService.addAccount(a);
		return a;
	}
}
