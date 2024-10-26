package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bo.MyBo;
import com.model.Person;

@Controller
public class MyController 
{
	@RequestMapping(value = "/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value = "/insert")
	public String insert(HttpServletRequest req,HttpServletResponse resp,ModelMap map)
	{
		
		Person p = new Person();
		p.setName(req.getParameter("name"));
		p.setEmail(req.getParameter("email"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("bo");
		bo.insert(p);
		
		return "show";
	}
	
}
