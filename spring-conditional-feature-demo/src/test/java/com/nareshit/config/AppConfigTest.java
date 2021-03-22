package com.nareshit.config;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.nareshit.dao.MongoUsers;
import com.nareshit.dao.MysqlDbUsers;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AppConfig.class})
public class AppConfigTest {

	//@Autowired
	//private ApplicationContext context; 
	
	//@Autowired
	//private AnnotationConfigWebApplicationContext context;
	
	@Test
	public void testUsers() {
		//UserDao dao = (UserDao)context.getBean(UserDao.class);
		//System.out.println(dao.getAllUsers());
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocations("com.nareshit");
		
		context.refresh();
		MysqlDbUsers mysql = (MysqlDbUsers) context.getBean(MysqlDbUsers.class);
		
		List<String> users = mysql.getAllUsers();
		
		MongoUsers mongo = (MongoUsers) context.getBean(MongoUsers.class);
		
		mongo.setUsers(users);
		
		context.refresh();
		
	   System.out.println(mongo.getAllUsers());
	}
}
