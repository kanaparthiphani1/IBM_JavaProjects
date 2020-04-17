package com.example.repo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.example.bean.Image;
import com.example.config.DatabaseConfig;
import com.example.mapper.ImageMapper;

@Repository
public class ImageImplements implements ImageInterface {

	
	

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	private static Logger logger=Logger.getLogger("ImageImplements");
	
	
	public Image createImage(Image img) {
//		try {
//			logger.log(Level.INFO, "connecting to database");
//			connection=dataSource.getConnection();
//			logger.log(Level.INFO, "connected");
//			PreparedStatement pStatement=connection.prepareStatement("insert into image value(?,?)");
//			pStatement.setString(1, img.getImageId());
//			pStatement.setString(2, img.getImageUrl());
//			pStatement.executeUpdate();
//			logger.log(Level.INFO, "todo creation completed");
//		} catch (Exception e) {
//			logger.log(Level.SEVERE, "unable to connect db");
//			e.printStackTrace();
//			
//		}
//			return img;
//		}
		
		String sql = "insert into image (imageId,imageUrl) values(?,?)";
		
		jdbcTemplate.update(sql,img.getImageId(),img.getImageUrl());
		return img;
	}
	public void updateImage(String imageUrl,String imageNewUrl) throws DataNotFoundException
	{
		try {
			String sql = "update image set imageUrl = ? where imageUrl = ?";
			int a=jdbcTemplate.update(sql,imageNewUrl,imageUrl);
			if(a == 0)
			{
				throw new DataNotFoundException();
			}
			else
			{
				System.out.println("updated");
			}
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteImage(String imageUrl) throws DataNotFoundException
	{
		try {
			String sql = "delete from image where imageUrl = ?";
			int a= jdbcTemplate.update(sql,imageUrl);
			
			if(a == 0)
			{
				throw new DataNotFoundException();
			}
			else
			{
				System.out.println("deleted");
			}
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public List<Image> displayAll() {
		
		String sql = "select * from image";
		List<Image> imgs= jdbcTemplate.query(sql, new ImageMapper());
	
		//for multiple rows to be selected
		//List<Image> imgs= jdbcTemplate.query(sql, new Object []{imageUrl},new ImageMapper());
		
		return imgs;
	}
	public Image displayByUrl(String imageUrl) throws DataNotFoundException {
		try {
			String sql = "select * from image where imageUrl=?";
			Image img= jdbcTemplate.queryForObject(sql, new Object [] {imageUrl},new ImageMapper());
			if(img == null)
			{
				throw new DataNotFoundException();
			}
			else 
			{
				return img;
			}
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}


