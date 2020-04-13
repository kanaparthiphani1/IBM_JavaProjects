package com.example.demo.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Account {

	private String accountNo;
	private AccountType type;
	private String name;
	private int balance;
	private boolean isActive;
	
}
