package com.sample.controller.todo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.model.Status;
import com.sample.model.todo.Todo;
import com.sample.services.todo.TodoServices;

@Controller
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoServices todoServices;

	static final Logger logger = Logger.getLogger(TodoController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Todo> getTodo() {
		List<Todo> todoList = null;
		try {
			todoList = todoServices.getEntityList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return todoList;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Todo getTodo(@PathVariable("id") int id) {
		Todo todo = null;
		try {
			todo = todoServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return todo;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody
	Status addTodo(@RequestBody Todo todo) {
		try {
			todoServices.addEntity(todo);
			return new Status(1, "Todo added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteTodo(@PathVariable("id") int id) {
		try {
			todoServices.deleteEntity(id);
			return new Status(1, "Todo deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}
	}
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody
	Status updateTodo(@PathVariable("id") int id, @RequestBody Todo todo) {
		try {
			todoServices.updateEntity(id, todo);
			return new Status(1, "Todo updated Successfully !");
		} catch (Exception e) {
			//e.printStackTrace();
			return new Status(0, e.toString());
		}
	}
	
}
