package com.sriman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sriman.model.Student;
import com.sriman.repo.SudentRepo;
@RestController
@RequestMapping("/mongo")
public class ControllerStu {
	
	@Autowired
	private SudentRepo repo;
	
	
	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Student save(@RequestBody Student stu)
	{
		
		return repo.save(stu);
		
	}
	
	@GetMapping("/get")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<Student> getData()
	{
		return repo.findAll();
		
	}
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(code =HttpStatus.OK)
	public String delete(@PathVariable Integer id)
	{
		 repo.deleteById(id);
		return "deleted";
	
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student)
	{
		return repo.save(student);
		
	}
@GetMapping("getById/{id}")
public Student getById(@PathVariable Integer id)
{
	return repo.findById(id).get();
}
	@GetMapping("/test")
	public String test(){
		return "pull Tested";
	}
}
