package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentImpl implements StudentService
{

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student addStudent(Student s) 
	{
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	@Override
	public List<Student> viewAllStudent() 
	{
		
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int id) 
	{
		repo.deleteById(id);		
		
	}

	@Override
	public Student StudentById(int id) 
	{
		return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("user","id",id));
	}

	@Override
	public Student updateStudent(Student s, int id) 
	{
		s.setId(id);
		return repo.save(s);
	}

}
