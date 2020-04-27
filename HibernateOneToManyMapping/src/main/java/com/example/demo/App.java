package com.example.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.Course;
import com.example.entity.Instructor;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    	// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
			// start a transaction
			
				session.beginTransaction();
//				Instructor instructor = new Instructor();
//				instructor.setFirstName("shyam");
//				instructor.setLastName("lastname");
//				instructor.setEmail("abc@gmail.com");
//				session.save(instructor);
				// get the instructor from db
				int theId = 3;
				
				Instructor tempInstructor = session.get(Instructor.class, theId);		
				
				// create some courses
				Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
				Course tempCourse2 = new Course("The Pinball Masterclass");
				
				// add courses to instructor
				tempInstructor.add(tempCourse1);
				tempInstructor.add(tempCourse2);
				
				// save the courses
				session.save(tempCourse1);
				session.save(tempCourse2);
				
				// commit transaction
				session.getTransaction().commit();
				
				System.out.println("Done!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			// add clean up code
		}
    }

