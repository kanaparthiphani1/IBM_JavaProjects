package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.demo.service.ToDoService;

public class App 
{
	public static void main( String[] args ) throws SQLException
    {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ToDoService toDoService=(ToDoService) context.getBean("toDoServiceImpl"); 
		//Todo todo=toDoRepository.createToDo(context.getBean("todo",Todo.class));
		ResultSet rs = toDoService.getAllService();
		
		while(rs.next())
		{
			System.out.println(rs.getString("todoID"));			
			System.out.println(rs.getString("todoName"));
		
		}
    }
}