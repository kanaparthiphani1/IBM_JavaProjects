package com.example.demo.SpringMavenPerson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.example.dao.PersonDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	PersonDao objDao= ctx.getBean("objDao",PersonDao.class); 
    	System.out.println(objDao.getPersonInfo());
    	
    }
}
