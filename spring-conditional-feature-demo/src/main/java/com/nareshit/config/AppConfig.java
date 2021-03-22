package com.nareshit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.nareshit.conditions.MongUserCondition;
import com.nareshit.conditions.MySQLUserCondition;
import com.nareshit.dao.MongoUsers;
import com.nareshit.dao.MysqlDbUsers;
import com.nareshit.dao.UserDao;

@Configuration
public class AppConfig {

	@Bean
	@Conditional(MySQLUserCondition.class)
	public UserDao mySqlUserDao() {
		return new MysqlDbUsers();
	}
	
	@Bean
	@Conditional(MongUserCondition.class)
	public UserDao mogoUserDao() {
		return new MongoUsers();
	}
}
