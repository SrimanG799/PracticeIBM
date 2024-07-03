package com.sriman.feincontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sriman.feignClient.MongoDemoUtil;
import com.sriman.model.Student;

@RestController
@RequestMapping("/mongodb")
public class MongoDbController {

	@Autowired
	private MongoDemoUtil feignmongodm;
	
	
	
@PostMapping("/savefn")
	
	public Student save(@RequestBody Student stu) {
	
	return feignmongodm.save(stu);
	
}
	
	
	@GetMapping("/getfn")

	public List<Student> getData()
	
	{
		return feignmongodm.getData();
	}
	@DeleteMapping("/deletefn/{id}")

	public String delete(@PathVariable Integer id) {
	
		return feignmongodm.delete(id);
		
	}
	
	
	@PutMapping("/updatefn")
	public Student update(@RequestBody Student student) {
		return feignmongodm.update(student);
		
	}
	@GetMapping("getByIdfn/{id}")
	public Student getById(@PathVariable Integer id)
	{
		return feignmongodm.getById(id);
	}


}
