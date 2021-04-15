package com.fmp.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fmp.web.model.User;

public interface UserManagementRepo extends JpaRepository<User, Integer>{

	@Query("from User u where u.email=:email and u.password=:password")
	public User findUserByCreds(@Param("email") String email, @Param("password") String password);
}
