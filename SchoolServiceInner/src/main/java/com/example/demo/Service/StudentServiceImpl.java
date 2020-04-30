package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.model.School;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Service
@EnableTransactionManagement
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	@Override
	public List<School> showall() {
		// TODO Auto-generated method stub
		Iterator<School> it = studentDao.findAll().iterator();
		List<School> li = new ArrayList<School>();
		while(it.hasNext())
		{
			li.add(it.next());
		}
		return li;
	}

	@Override
	public List<School> showBySchool(String school) {
		// TODO Auto-generated method stub
		Iterator<School> it = studentDao.findAllByStudentSchool(school).iterator();
		List<School> li = new ArrayList<School>();
		while(it.hasNext())
		{
			li.add(it.next());
		}
		return li;
	}

}
