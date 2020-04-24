package com.example.demo.Service;

import java.util.List;

import com.example.demo.DTO.ProjectDTO;
import com.example.demo.Exception.ProjectNotFoundException;
import com.example.demo.model.Project;

public interface ProjectService {

	public List<ProjectDTO> showALL();
	
	public ProjectDTO showByID(int id);
	
	public void createProject(ProjectDTO p);
	
	public void updateProject(Project p);
	
	public void delete(ProjectDTO p,int id);
	
	public List<ProjectDTO> findByName(String name);

	public List<ProjectDTO> findByNameAndOrder(String name,String author);
	
	public void removeByName(String name);

}
