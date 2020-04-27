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
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Name theValues=context.getBean("myName",Name.class);
		System.out.println(theValues.displayName());
		System.out.println(theValues.displayAddress());

    }
}
