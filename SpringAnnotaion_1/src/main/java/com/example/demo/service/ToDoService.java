package com.example.demo.service;

import java.sql.ResultSet;

import com.example.demo.bean.Todo;

public interface ToDoService {
	public Todo createToDoService(Todo todo);
	public ResultSet getAllService();

}
