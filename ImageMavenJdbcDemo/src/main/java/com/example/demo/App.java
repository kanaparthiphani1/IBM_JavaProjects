package com.example.demo;


import java.util.Scanner;

import com.example.model.Image;
import com.example.service.ImageServiceImplement;

public class App 
{
    public static void main( String[] args )
    {
    	
    ImageServiceImplement objService=new ImageServiceImplement();	
    int choice=6;
    Scanner sc= new Scanner(System.in);
    while(choice!=5)
    {
    	System.out.println("1.Add Image");
    	System.out.println("2.Display Image");
    	System.out.println("3.Update Image");
    	System.out.println("4.Delete Image");
    	System.out.println("enter ur choice");
    	choice=sc.nextInt();
    	switch (choice) {
		case 1:
		{
			System.out.println("Enter imageId:");
			int imageId=sc.nextInt();
			System.out.println("enter imageUrl:");
			String imageUrl= sc.next();
			System.out.println("Enter Availability");
			Boolean imageAvailability =sc.nextBoolean();
			Image objImage= new Image(imageId,imageUrl,imageAvailability);
			objService.addImageService(objImage);
		}
			
			break;

		case 2:
		{
			System.out.println("Enter imageId:");
			int imageId=sc.nextInt();
			objService.displayImageService(imageId);
			
		}
		break;
		case 3:
		{
			System.out.println("Enter imageId:");
			int imageId=sc.nextInt();
			System.out.println("enter imageUrl:");
			String imageUrl= sc.next();
			objService.updateImageUrlService(imageId, imageUrl);
			
		}
		break;
		case 4:
		{
			System.out.println("Enter imageId:");
			int imageId=sc.nextInt();
			objService.deleteImageService(imageId); 
			
		}
		break;
		default:
			System.out.println("entered invalid detail");
			break;

		}
    }
    }
}