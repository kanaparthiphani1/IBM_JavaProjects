package com.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Todo;

@Repository
public class ToDoRepositoryImpl implements ToDoRepository {
	//property level injection
	
	private DataSource dataSource;
	@Autowired
	public ToDoRepositoryImpl(DataSource dataSource) throws SQLException {
		super();
		this.dataSource = dataSource;
		connection=dataSource.getConnection();

	}

	private Connection connection=null;;
	
	private static Logger logger=Logger.getLogger("ToDoRepositoryImpl");

	public Todo createToDo(Todo todo) {
		try {
			logger.log(Level.INFO, "connecting to database");
			logger.log(Level.INFO, "connected");
			PreparedStatement pStatement=connection.prepareStatement("insert into todo values(?,?)");
			pStatement.setString(1, todo.getTodoID());
			pStatement.setString(2, todo.getTodoName());
			pStatement.executeUpdate();
			logger.log(Level.INFO, "todo creation completed");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "unable to connect db");
			e.printStackTrace();
			
		}
			return todo;
		}

	public ResultSet getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		try {
			PreparedStatement objSt = connection.prepareStatement("select * from todo");
			 rs= objSt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;

		
	}
	}
