/**
 * 
 */
package com.nareshit.dao;

import java.util.Arrays;
import java.util.List;

/**
 * @author nsanda
 *
 */
public class MysqlDbUsers implements UserDao {

	/* (non-Javadoc)
	 * @see com.nareshit.dao.UserDao#getAllUsers()
	 */
	@Override
	public List<String> getAllUsers() {
		// TODO Auto-generated method stub
		return Arrays.asList("MySqlUser1","MySqlUser2","MySqlUser3");
	}

}
