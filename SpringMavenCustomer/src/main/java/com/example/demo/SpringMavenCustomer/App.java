package com.example.demo.SpringMavenCustomer;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Customer customer=context.getBean("theCustomer",Customer.class);
		customer.setCustomerID(UUID.randomUUID().toString());
		System.out.println(customer);
    }
}
