package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.Account;
import com.example.demo.bean.AccountType;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;
import com.example.demo.service.ToDoService;

public class App 
{
	public static void main( String[] args ) throws SQLException
	{
		 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); /*ToDoService
		 * toDoService=(ToDoService) context.getBean("toDoServiceImpl"); //Todo
		 * todo=toDoRepository.createToDo(context.getBean("todo",Todo.class)); ResultSet
		 * rs = toDoService.getAllService();
		 * 
		 * while(rs.next()) { System.out.println(rs.getString("todoID"));
		 * System.out.println(rs.getString("todoName"));
		 * 
		 * }
		 */
		AccountService service=context.getBean("accountServiceImpl",AccountServiceImpl.class);
		Account account=context.getBean("account",Account.class);
		
		Scanner sc = new Scanner(System.in);
		int choice =67;
		while(choice!=6)
		{
			System.out.println("1.create 2.update 3.delete 4:display 5:display by id 6:exit");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
			{
				String str[]=UUID.randomUUID().toString().split("-");
				  account.setAccountNo(str[0]); 
				  account.setType(AccountType.GOLD);
				  account.setBalance(100000);
				  
				 account=service.createAccount(account);
				 System.out.println(account);
				 
			}
				
				break;
				
			case 2:
			{
				System.out.println("Enter no. u wanna update:");
				int id= sc.nextInt();
				System.out.println("ENter new Salary :");
				int salary=sc.nextInt();
				
				service.updateAccount(id,salary);
			}

			break;
			case 3:
			{
				System.out.println("Enter no. that u wanna delete:");
				int id=sc.nextInt();
				service.deleteAccount(id);
			}

			break;
			case 4:
			{
				Iterator<Account> i = service.showAll().iterator();
				while(i.hasNext())
				{
					Account obj = i.next();
					System.out.println(obj);
				}
			}
				break;
			case 5:
			{
				System.out.println("ENter id that u wanna see:");
				int id=sc.nextInt();
				System.out.println(service.showbyId(id));
			}
				break;
			case 6:
				break;
			}
		}
		/*
		 * String str[]=UUID.randomUUID().toString().split("-");
		 * account.setAccountNo(str[0]); account.setType(AccountType.GOLD);
		 * account.setBalance(100000);
		 * 
		 * account=service.createAccount(account); System.out.println(account);
		 */
		//service.updateAccount("deb58f94",200000);
		/*
		 * service.deleteAccount("deb58f94");
		 */    }
}