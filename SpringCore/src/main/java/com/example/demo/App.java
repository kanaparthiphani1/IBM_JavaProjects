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
    	Coach obj=(Coach) con.getBean("cricketcoach");
    	System.out.println(obj.getDailyWorkout());

    	System.out.println(obj.getDailyFortune());
    }
}
