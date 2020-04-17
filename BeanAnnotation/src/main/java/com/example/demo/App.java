package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Image;
import com.example.config.AppConfig;
import com.example.config.DatabaseConfig;
import com.example.repo.DataNotFoundException;
import com.example.repo.ImageInterface;
import com.example.service.ImageService;
import com.example.service.ImageServiceImplement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws DataNotFoundException
    {
    	Scanner sc  = new Scanner(System.in);
    	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfig.class);
    	
    	//for xml configuration
    	//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	ImageService imgInterface = ctx.getBean("imageServiceImplement",ImageServiceImplement.class);
    	
    	int choice = 0;
    	Image img = ctx.getBean("image",Image.class);
    	
    	while(choice!=6)
    	{

    		System.out.println("1 -> Add \n2 -> Update \n3 -> Delete \n4 -> Display");
    		System.out.println("Enter yout choice");
    		choice = sc.nextInt();
    		switch(choice)
    		{
    		
    		case 1:
    			System.out.println("Enter the imageUrl");
    			String imgUrl = sc.next();
    			img.setImageId(UUID.randomUUID().toString());
    	    	img.setImageUrl(imgUrl);
    	    	imgInterface.createImageService(img);
    	    	System.out.println("Added");
    			break;
    		case 2:
    			System.out.println("Enter the imageUrl to be updated");
    			String imgUrl1 = sc.next();
    			System.out.println("Enter the new imageUrl to be replace");
    			String imgUrl2 = sc.next();
    			
    			
    			imgInterface.updateImageService(imgUrl1,imgUrl2);
    	    	break;
    		case 3:
    			System.out.println("Enter the imageUrl to be deleted");
    			String imgUrlDel = sc.next();
    			imgInterface.delete(imgUrlDel);
    			break;
    		case 4:
    			List<Image> imgs=imgInterface.displayImageService();
    			Iterator<Image> iter = imgs.iterator();
    			while(iter.hasNext())
    			{
    				System.out.println(iter.next());
    			}
    			break;
    		case 5:
    			System.out.println("Enter the imageUrl to be displayed");
    			String str = sc.next();
    			System.out.println(imgInterface.displayByUrlService(str));
    			break;    			
    		case 6:
    			System.exit(0);
    			ctx=null;
    			System.out.println("bye");
    			break;
    		default:
    			System.out.println("wrong values");
    			break;
    			
    		}
    	}
    	
    	
    }
}
