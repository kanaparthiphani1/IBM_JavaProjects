package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebConfig  extends WebSecurityConfigurerAdapter{

	private static final String ADMIN = "ADMIN";
	private static final String USER = "USER";
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void configure(HttpSecurity http) throws Exception
	{
		http.csrf().disable().authorizeRequests()
			.antMatchers("/admin/**").hasRole(ADMIN)
			.antMatchers("/users/**").hasAnyRole(ADMIN,USER)
			.antMatchers("/", "/register-user").permitAll()
			.and().formLogin()
			.and().logout().permitAll()
			.logoutUrl("/j_spring_security_logout")  
	        .logoutSuccessUrl("/");
			
	}
	
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.jdbcAuthentication().dataSource(dataSource)
			.passwordEncoder(passwordEncoder());
	}
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public JdbcUserDetailsManager jdbcUserDetailsManager() {
		return new JdbcUserDetailsManager(dataSource);
	}
}
