package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bo.MyBo;
import com.model.Person;

@Controller
public class MyController 
{
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/insert" , method = RequestMethod.POST)
	public String insert(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		
		Person p = new Person();
		p.setName(request.getParameter("name"));
		p.setAddress(request.getParameter("address"));
		
		MyBo bo = (MyBo) acm.getBean("bo");
		bo.insertdata(p);
		
		return "show";
	}
	
	@RequestMapping(value="/show")
	public String show()
	{
		return "show";
	}
	
	@RequestMapping(value="/insert1")
	public String insert()
	{
		return "index";
	}
	
	@RequestMapping(value="/delete" , method = RequestMethod.POST)
	public String delete(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		
		Person p = new Person();
		String i1 = request.getParameter("id");
		int id2 = Integer.parseInt(i1);
		p.setId(id2);
		
		
		MyBo bo = (MyBo) acm.getBean("bo");
		bo.deletedata(p);
		
		return "show";
	}
	
	@RequestMapping(value="/edit", method =RequestMethod.POST)
	public String edit(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		
		int id = Integer.parseInt(request.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("bo");
		Person p = bo.getPersonById(id);
		map.addAttribute("p", p);
		return "update";
	}
	
	@RequestMapping(value="/update" , method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		String i1 = request.getParameter("id");
		int id2 = Integer.parseInt(i1);
		Person p = new Person();
		p.setId(id2);
		p.setName(request.getParameter("name"));
		p.setAddress(request.getParameter("address"));
		
		MyBo bo = (MyBo) acm.getBean("bo");
		bo.updatedata(p);
		
		return "show";
	}
}
