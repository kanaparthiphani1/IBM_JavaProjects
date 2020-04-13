package com.example.demo.repo;


import java.sql.ResultSet;
import java.util.List;

import com.example.demo.bean.Todo;

public interface ToDoRepository {

	public Todo createToDo(Todo todo);
	public ResultSet getAll();
}
