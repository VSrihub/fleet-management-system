package com.nareshit.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MongoUsers implements UserDao {

	static List<String> usersList = new ArrayList<String>();
	@Override
	public List<String> getAllUsers() {
		// TODO Auto-generated method stub
		usersList.addAll(Arrays.asList("MongoUser1","MongoUser2","MongoUser3"));
		return usersList;
	}
	
	public void setUsers(List<String> outSideUsersList) {
		usersList.addAll(outSideUsersList);
	}
	
	

}
