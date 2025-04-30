package com.springboot.webapp.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todosCount = 0;
	static {
		todos.add(new Todo(++todosCount, "Harshit", "Learn Full Stack Development", LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(++todosCount, "Harshit", "Learn MicroServices", LocalDate.now().plusMonths(4), false));
		todos.add(new Todo(++todosCount, "Harshit", "Get AWS Certified", LocalDate.now().plusMonths(6), false));		  
	}
	
	public List<Todo> findByUsername(String username){
		return todos.stream().filter(e->e.getUsername().equalsIgnoreCase(username)).toList();
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		todos.removeIf(e -> e.getId() == id);
	}

	public Todo findById(int id) {
		Todo todo = todos.stream().filter(e -> e.getId() == id).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
}
