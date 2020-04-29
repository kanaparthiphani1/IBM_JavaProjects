package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;

@Controller
public class UserController {

	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping(value = "/register")
	public String createUser(Model model)
	{
		model.addAttribute("user",new Users());
		return "User";
	}
	@RequestMapping("/index")
	public String index() {

		return "Index";
	}
	
	@PostMapping(value = "/register")
	public String regiter(Users myUser) 
	{
		System.out.println("Hello");
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		authorities.add(new SimpleGrantedAuthority(myUser.getRoles()));
		
		String encodededPassword = passwordEncoder.encode(myUser.getPassword());
		
		User user = new User(myUser.getUserName(), encodededPassword, authorities);
		
		jdbcUserDetailsManager.createUser(user);
		
		return "Success";
	}
	
	
}
