package com.example.demo.MainHibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.example.domain.Customer;
import com.example.domain.Project;
import com.example.service.CustomerServiceImplement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	Scanner sc = new Scanner(System.in);
    	Customer customer=null;
    	CustomerServiceImplement customerService;
    	Project customerProject;
    	{
    	customerService = new CustomerServiceImplement();
    	}int choice =0;
    	while(choice!=7)
    	{

    		System.out.println("1 -> Add \n2 -> Display \n3 -> DisplayById \n4 -> UpdateById \n5 -> UpdateById \n 6 -> Add Course");
    		System.out.println("Enter yout choice");
    		choice = sc.nextInt();
    		customer = new Customer();
    		customerProject = new Project();
    		switch(choice)
    		{
    		
    		case 1:
    			System.out.println("Enter the CustomerName");
    			String name = sc.next();
    			customer.setCustomerId(UUID.randomUUID().toString());
    			customer.setCustomerName(name);
    			System.out.println("Enter the CustomerEmail");
    			String email = sc.next();
    			customer.setCustomerEmail(email);
    			System.out.println("Enter the CustomerStatus");
    			Boolean status = sc.nextBoolean();
    			customer.setIsActive(status);
    			System.out.println("Enter the CustomerProjectName");
    			String projectName = sc.next();
    			customerProject.setCustomerProjectName(projectName);
    			System.out.println("Enter the CustomerProjectStatus");
    			Boolean projectStatus = sc.nextBoolean();
    			customerProject.setIsDone(projectStatus);
    			customer.setCustomerProject(customerProject);
    			customerService.createService(customer);
    			System.out.println("Added");
    			break;
    		case 2:
    			List<Customer> list = customerService.listAllService();
    			Iterator<Customer> iter = list.iterator();
    			while(iter.hasNext())
    			{
    				System.out.println(iter.next());
    			}
    			
    			break;
    			
    		case 3:
    			System.out.print("Enter Customer ID: ");
				customer=customerService.getCustomerByIDService(sc.next());
				if(customer==null)
				{
					System.out.println("No Such Customer Found With given ID: ");
				}
				else
				{
					System.out.println(customer);
				}
				break;
    		case 4:
    			System.out.println("Enter CustomerId to be updated");
    			String id = sc.next();
    			System.out.println("Enter the CustomerName");
    			String name1 = sc.next();
    			customer.setCustomerId(id);
    			customer.setCustomerName(name1);
    			System.out.println("Enter the CustomerEmail");
    			String email1 = sc.next();
    			customer.setCustomerEmail(email1);
    			System.out.println("Enter the CustomerStatus");
    			Boolean status1 = sc.nextBoolean();
    			customer.setIsActive(status1);
    			System.out.println("Enter the CustomerProjectName");
    			String newprojectName = sc.next();
    			customerProject.setCustomerProjectName(newprojectName);
    			System.out.println("Enter the CustomerProjectStatus");
    			Boolean newprojectStatus = sc.nextBoolean();
    			customerProject.setIsDone(newprojectStatus);
    			customer.setCustomerProject(customerProject);    			
    			customer = customerService.updateCustomerByIdService(id, customer);
    			if(customer == null)
    			{
    				System.out.println("Not found");
    			}
    			else
    			{
    				System.out.println(customer);
    			}
    			break;
    		
    		case 5:
    			System.out.println("Enter CustomerName to be updated");
    			String name3 = sc.next();
    			System.out.println("Enter the CustomerName");
    			String newName = sc.next();
    			customer.setCustomerId(UUID.randomUUID().toString());
    			customer.setCustomerName(newName);
    			System.out.println("Enter the CustomerEmail");
    			String newEmail = sc.next();
    			customer.setCustomerEmail(newEmail);
    			System.out.println("Enter the CustomerStatus");
    			Boolean newStatus = sc.nextBoolean();
    			customer.setIsActive(newStatus);
    			customer = customerService.updateCustomerByName(name3, customer);
    			if(customer == null)
    			{
    				System.out.println("Not found");
    			}
    			else
    			{
    				System.out.println(customer);
    			}
    			
    			break;
    		case 6:
    			System.out.println("Enter the customerId");
    			String customerId = sc.next();
    			System.out.println("Enter the number of Courses for the customer");
    			int count = sc.nextInt();
    			List<String> list1 = new ArrayList<String>();
    			for(int i=0;i<count;i++)
    			{
    				System.out.println("Enter the "+(i+1)+" CourseName");
    				list1.add(sc.next());
    				
    			}
    			customerService.addCourseService(customerId, list1);
    			
    			break;
    		default:
    			System.out.println("wrong values");
    			break;
    			
    		}

    }
    	
    }
    
    }
