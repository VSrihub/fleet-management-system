package com.nareshit.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MongUserCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
			Class driver = Class.forName("org.h2.Driver");
			if(driver.getName() != null) {
				System.out.println(driver.getName()+" found");
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Driver "+e.getMessage()+ " not found");
		}
		return false;
	}

}
