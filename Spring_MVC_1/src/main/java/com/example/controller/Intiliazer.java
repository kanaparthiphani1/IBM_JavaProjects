package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Intiliazer {

	@RequestMapping("/nameInit")
	public String showForm()
	{
		return "NameInput";
	}
	
	@RequestMapping("nameProcess")
	public String showView(HttpServletRequest request)
	{
		return "viewName";
	}
	
	@RequestMapping("nameProcess1")
	public String showView(HttpServletRequest request,Model model)
	{
		String message="Hi I am "+request.getParameter("name");
		model.addAttribute("message", message);
		return "viewName";
	}
	
	@RequestMapping("nameProcess2")
	public String showView(@RequestParam("name") String str,Model model)
	{
		String message="Hi I am "+str;
		model.addAttribute("message", message);
		return "viewName";
	}
	
}
