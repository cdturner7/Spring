package com.spring.services;

import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.utils.Todo;

@Service
public class ToDoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	static {
		todos.add(new Todo(1, "Collin", "Feed Jurgen/Get Mice", new Date(),
				false));
		todos.add(new Todo(2, "Collin", "Pay Ford", new Date(), false));
		todos.add(new Todo(3, "Collin", "Restart Server Project", new Date(),
				false));
	}

	public List<Todo> retrieveTodos(Object object) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(object))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}

	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}

	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
}