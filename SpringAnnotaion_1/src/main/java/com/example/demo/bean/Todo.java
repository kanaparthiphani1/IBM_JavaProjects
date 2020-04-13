
package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Todo {
	@Value("one")
	private String todoID;
	@Value("phani")
	private String todoName;

	public Todo() {
		super();
	}

	public Todo(String todoID, String todoName) {
		super();
		this.todoID = todoID;
		this.todoName = todoName;
	}

	public String getTodoID() {
		return todoID;
	}

	public void setTodoID(String todoID) {
		this.todoID = todoID;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	@Override
	public String toString() {
		return "ToDo [todoID=" + todoID + ", todoName=" + todoName + "]";
	}

}