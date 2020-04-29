package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
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
	
	 @RequestMapping("/users") 
	  public String userslogin() {
	  
		 System.out.println("bye");
	  
		 return "EmployeeHome";
	  }
	
	 

	 @RequestMapping("/user/showbyId") 
	  public String usershowbyId(Model model) {
	  
		 model.addAttribute("id", new Employee());
		 System.out.println("bye");
	  
		 return "ShowbyId";
	  }
	 @RequestMapping("/admin") 
	  public String adminlogin() {
	  
		 System.out.println("bye");
	  
		 return "AdminHome";
	  }
	 
	 @RequestMapping(value = "/employee/create")
		public String createEmployee(Model model)
		{
			model.addAttribute("employee",new Employee());
			return "EmployeeCreate";
		}
	 
	    @RequestMapping(value="/logout", method=RequestMethod.POST)  
	    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
	        if (auth != null){      
	           new SecurityContextLogoutHandler().logout(request, response, auth);  
	        }  
	         return "redirect:/";  
	     }  
	
}
