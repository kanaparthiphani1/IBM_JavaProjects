package com.example.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Todo;

/**
 * Servlet implementation class ServletController
 */
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<String> error;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		error=new ArrayList<String>();
		String name=request.getParameter("t_name");
		int id=0;
		if(name.length()<8)
		{
			error.add("invalid name");
		}
		try {
			id= Integer.parseInt(request.getParameter("t_id"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			error.add("invalid input");
		}
		
		String c_by=request.getParameter("c_by");
		if(c_by.length()<=0)
		{
			error.add("invalid input to completed by");
		}
		if(error.isEmpty())
		{
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/java","root","Ardninahp@1");  
				PreparedStatement stmt=con.prepareStatement("insert into todo values(?,?,?)");  
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, c_by);
				stmt.executeUpdate();
				con.close();  
				}catch(Exception e){ System.out.println(e);}  
		Todo todo = new Todo(id, name, c_by);
		request.setAttribute("todo", todo);
		RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		dis.forward(request, response);
		}
		else
		{
			request.setAttribute("error", error);
			RequestDispatcher dis = request.getRequestDispatcher("fail.jsp");
			dis.forward(request, response);
		}
	}

	
}
