package com.example.demo.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.ProjectDTO;
import com.example.demo.Exception.ProjectException;
import com.example.demo.Exception.ProjectNotFoundException;
import com.example.demo.Service.ProjectService;
import com.example.demo.model.Project;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value = "Project Information",description = "Check out methods")
public class ProjectController {

	private ProjectService projectService;

	public ProjectController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}
	@ApiOperation(value = "View a list of available Projects", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") 
	})
	@GetMapping("/projects")
	public List<ProjectDTO> showAll()
	{
		return projectService.showALL();
	}
	
	@ApiOperation(value = "Showing Projects by Id" ,response = ProjectDTO.class)
	@GetMapping("/project/{id}")
	public ProjectDTO showbyId(@ApiParam(value = "Id required to find" , required = true) @PathVariable int id) throws ProjectNotFoundException
	{
		
		ProjectDTO obj =  projectService.showByID(id);
		if(obj == null)
		{
			throw new ProjectNotFoundException("There is no Project with this "+id);
		}
		return obj;
	}
	
	@ApiOperation(value = "Creating Projects by Id" ,response = ProjectDTO.class)
	@PostMapping("/projects")
	public ProjectDTO create(@ApiParam(value = "Obj required to create" , required = true)@RequestBody ProjectDTO pro)
	{
		projectService.createProject(pro);
		return pro;
	}
	
	@ApiOperation(value = "Update Projects by Id" ,response = ProjectDTO.class)
	@PutMapping("/project/update")
	public Project update(@ApiParam(value = "Obj required to update" , required = true)@RequestBody Project pro)
	{
		projectService.updateProject(pro);
		return pro;
	}
	@ApiOperation(value = "Showing Projects by Id" ,response = ProjectDTO.class)
	@DeleteMapping("/project/{id}")
	public ProjectDTO DeleteId(@ApiParam(value = "Id required to delete" , required = true) @PathVariable int id) throws ProjectNotFoundException
	{
		
		ProjectDTO obj =  projectService.showByID(id);
		if(obj == null)
		{
			throw new ProjectNotFoundException("There is no Project with this "+id);
		}
		
		projectService.delete(obj,id);
		return obj;
	}
	
	@ExceptionHandler
	public ResponseEntity<ProjectException> showException(ProjectNotFoundException pnf)
	{
		return new ResponseEntity<ProjectException>(new ProjectException(HttpStatus.NOT_FOUND.toString(), pnf.getMessage(), System.currentTimeMillis()),HttpStatus.NOT_FOUND);
	}
	
	@ApiOperation(value = "Showing Projects by NAme" ,response = Project.class)
	@GetMapping("/find/{name}")
	public ResponseEntity<List<ProjectDTO>> showbyName(@ApiParam(value = "Name required to find" , required = true) @PathVariable("name") String name) throws ProjectNotFoundException
	{
		
		
		return ResponseEntity.ok().body(projectService.findByName(name));
	}
	
	@ApiOperation(value = "Showing Projects by Name and Author" ,response = Project.class)
	@GetMapping("/find/{name}/{author}")
	public ResponseEntity<List<ProjectDTO>> showbyName(@ApiParam(value = "Name required to find" , required = true) @PathVariable("name") String name, @PathVariable("author") String author) throws ProjectNotFoundException
	{
		
		
		return ResponseEntity.ok().body(projectService.findByNameAndOrder(name, author));
	}
	

	@ApiOperation(value = "Deleting Projects by name" ,response = Project.class)
	@DeleteMapping("/delete/{name}")
	public void deletebyName(@ApiParam(value = "Name required to find" , required = true) @PathVariable("name") String name) throws ProjectNotFoundException
	{
		
		
		projectService.removeByName(name);
	}
}
