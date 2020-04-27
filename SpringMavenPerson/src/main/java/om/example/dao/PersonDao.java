package om.example.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Person;

import lombok.Setter;

@Setter
public class PersonDao {
	
	
	public String getPersonInfo()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = ctx.getBean("person",Person.class);
		
    	
		return " Name :- "+person.getName()+"\n Age :- "+person.getAge()+"\n Height :- "+person.getHeight()+" \n Programmer :- "+person.isProgrammer()+"\n Address :- "+person.addresInfo();
	}

}
