package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
    	Name obj = (Name) con.getBean("personinfo");
    	System.out.println(obj);
    }
}
