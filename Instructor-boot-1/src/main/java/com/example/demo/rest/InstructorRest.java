package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.InstructorException;
import com.example.demo.exception.InstructorNotFound;
import com.example.demo.model.Instructor;
import com.example.demo.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorRest {

	@Autowired
	private InstructorService instructorService;
	
	
	@GetMapping("/instructors")
	public List<Instructor> showAll() {
		return instructorService.showAll();
	}


	@PostMapping("/instructors")
	public Instructor add(@RequestBody Instructor i) {
		instructorService.createInstructor(i);
		return i;
	}
	
	@GetMapping("/instructor/{id}")
	public Instructor showbyId(@PathVariable int id) throws InstructorNotFound
	{
		Instructor obj=instructorService.getById(id);
		if(obj==null)
		{
			throw new InstructorNotFound("There ios no instructor with this "+id+" id");
		}
		return obj;
	}
	
	@DeleteMapping("/instructor/{id}")
	public Instructor deleteById(@PathVariable int id) throws InstructorNotFound
	{
		Instructor i = instructorService.getById(id);
		if(i==null)
		{
			throw new InstructorNotFound("There ios no instructor with this "+id+" id");

		}
		instructorService.deleteById(i);
		return i;
	}

	@ExceptionHandler
	public ResponseEntity<InstructorException> show(InstructorNotFound inf)
	{
		return new ResponseEntity<InstructorException>(new InstructorException(HttpStatus.NOT_FOUND.toString(),inf.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
	}
}
