package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.services.ToDoService;

@Controller
public class ToDoController {

	@Autowired
	private ToDoService service;

	@RequestMapping(value = "/list-todos", method = RequestMethod.POST)
	public String showToDosPage(ModelMap model)
	{
		model.addAttribute("todos", service.retrieveTodos("Collin"));
		return "list-todos";
	}
}
