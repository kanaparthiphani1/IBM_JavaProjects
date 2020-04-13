package com.example.demo.service;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Todo;
import com.example.demo.repo.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {

	private ToDoRepository toDoRepository;

	@Autowired
	public ToDoServiceImpl(ToDoRepository toDoRepository) {
		super();
		this.toDoRepository = toDoRepository;
	}

	public Todo createToDoService(Todo todo) {
		// TODO Auto-generated method stub
		return toDoRepository.createToDo(todo);
	}

	public ResultSet getAllService() {
		// TODO Auto-generated method stub
		return toDoRepository.getAll();
	}

}
