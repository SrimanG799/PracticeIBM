package com.sriman.feignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sriman.model.Student;

@FeignClient(value="feignDemo",url ="http://localhost:2025/mongo")
public interface MongoDemoUtil {
	
	
	
	
	
	@PostMapping("/save")
	
	public Student save(@RequestBody Student stu);
	
	
	@GetMapping("/get")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<Student> getData();
	
	@DeleteMapping("/delete/{id}")

	public String delete(@PathVariable Integer id);
	
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student);

	@GetMapping("getById/{id}")
	public Student getById(@PathVariable Integer id);
	
}


