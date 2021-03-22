package com.nareshit.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MySQLUserCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
			Class driver = Class.forName("com.mysql.jdbc.Driver");
			if(driver.getName() != null) {
				System.out.println(driver.getName()+" found");
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}

}
