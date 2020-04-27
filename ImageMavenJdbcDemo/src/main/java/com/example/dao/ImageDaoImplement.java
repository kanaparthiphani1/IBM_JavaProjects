package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.factory.MyConnectionFactory;
import com.example.model.Image;

public class ImageDaoImplement implements ImageDao{

	MyConnectionFactory factory =null;
	public ImageDaoImplement() 
	{
	 factory = MyConnectionFactory.getConnectionObject();
	}	
	public void addImage(Image objImage) {
		
		try {
			Connection con = factory.getMyConnection();
			System.out.println(con);
			PreparedStatement st= con.prepareStatement("insert into image(imageId,imageUrl,imageAvailable)  values(?,?,?)");
			st.setInt(1, objImage.getImageId());
			st.setString(2, objImage.getImageUrl());
			st.setBoolean(3, objImage.getImageIsAvailable());
			st.executeUpdate();
			System.out.println("added into database");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void displayImage(int imageId) {
		try {
			Connection con = factory.getMyConnection();
			PreparedStatement st= con.prepareStatement("select * from image where imageId = ?");
			st.setInt(1, imageId);
			
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("imageId"));
				System.out.println(rs.getString("imageUrl"));
				System.out.println(rs.getBoolean("imageAvailable"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateImageUrl(int imageId, String imageUrl) {
		try {
			Connection con = factory.getMyConnection();
			PreparedStatement st= con.prepareStatement("Update image set imageUrl=? where imageId=?");
			st.setInt(2, imageId);
			st.setString(1, imageUrl);
			st.executeUpdate();
			System.out.println("updated in database");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteImage(int imageId) {
		try {
			Connection con = factory.getMyConnection();
			PreparedStatement st= con.prepareStatement("Delete from image where imageId=?");
			st.setInt(1, imageId);
			
			st.executeUpdate();
			System.out.println("deleted from database");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
