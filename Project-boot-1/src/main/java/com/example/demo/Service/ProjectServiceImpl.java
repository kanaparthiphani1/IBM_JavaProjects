package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.DAO.ProjectDao;
import com.example.demo.DTO.ProjectDTO;
import com.example.demo.Exception.ProjectNotFoundException;
import com.example.demo.model.Project;

@Service
@EnableTransactionManagement
public class ProjectServiceImpl implements ProjectService {

	private ProjectDao projectDao;
	
	
	public ProjectServiceImpl(ProjectDao projectDao) {
		super();
		this.projectDao = projectDao;
	}

	@Override
	public List<ProjectDTO> showALL() {
		// TODO Auto-generated method stub
		List<ProjectDTO> projList= new ArrayList<ProjectDTO>();
		projectDao.findAll().forEach(project->{
			projList.add(new ProjectDTO(project.getName(),project.getDescription(),project.getAuthor()));
		});
		return projList;
	}

	@Override
	public ProjectDTO showByID(int id) {

		Project proObj=projectDao.findById(id).get();
		ProjectDTO obj = new ProjectDTO(proObj.getName(),proObj.getDescription(),proObj.getAuthor());
		
		
		return obj;
	}

	@Override
	public void createProject(ProjectDTO p) {
		// TODO Auto-generated method stub

		Project obj = new Project(p.getName(),p.getDescription(),p.getAuthor());
		projectDao.save(obj);
		
	}

	
	@Override
	public void delete(ProjectDTO p,int id) {
		// TODO Auto-generated method stub

		Project obj = new Project(id,p.getName(),p.getDescription(),p.getAuthor());
		System.out.println(obj);
		projectDao.delete(obj);
	}

	@Override
	public void updateProject(Project p) {
		// TODO Auto-generated method stub
		projectDao.save(p);
	}

	@Override
	public List<ProjectDTO> findByName(String name) {
		// TODO Auto-generated method stub
		Iterable<Project> obj=projectDao.findByName(name);
		Iterator<Project> objIt = obj.iterator();
		List<ProjectDTO> objLi = new ArrayList<ProjectDTO>();
		while(objIt.hasNext())
		{
			Project obj1=objIt.next();
			ProjectDTO objdto =new ProjectDTO(obj1.getName(),obj1.getDescription(),obj1.getAuthor());
			objLi.add(objdto);
		}
		return objLi;
		
	}

	@Override
	public List<ProjectDTO> findByNameAndOrder(String name, String author) {
		// TODO Auto-generated method stub
		Iterable<Project> obj=projectDao.findByNameAndAuthor(name,author);
		Iterator<Project> objIt = obj.iterator();
		List<ProjectDTO> objLi = new ArrayList<ProjectDTO>();
		while(objIt.hasNext())
		{
			Project obj1=objIt.next();
			ProjectDTO objdto =new ProjectDTO(obj1.getName(),obj1.getDescription(),obj1.getAuthor());
			objLi.add(objdto);
		}
		return objLi;
	}

	@Transactional
	@Override
	public void removeByName(String name) {
		// TODO Auto-generated method stub
		projectDao.removeByName(name);
	}

}
