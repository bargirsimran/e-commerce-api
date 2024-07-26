package org.dnyanyog.dao;

import org.dnyanyog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface UsersDao extends JpaRepository<Users, Integer>{
	
	public Users findByFirstName(String firstName);
	public Users findByLoginName(String loginName);
	public Users findById(int user_id);
	
}
