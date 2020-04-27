package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.Service.AccountService;
import com.example.demo.model.Account;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@SpringBootApplication
@EnableDiscoveryClient
public class MyAccountServiceApplication implements CommandLineRunner{

	private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(MyAccountServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Account obj1= new Account (UUID.randomUUID().toString(), "phani", "gold");
		accountService.addAccount(obj1);
		Account obj2= new Account (UUID.randomUUID().toString(), "nikhil", "silver");
		accountService.addAccount(obj2);
		Account obj3= new Account (UUID.randomUUID().toString(), "sai", "bronze");
		accountService.addAccount(obj3);
	}

}
