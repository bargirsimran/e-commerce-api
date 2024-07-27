package org.dnyanyog.service;


import java.sql.SQLException;
import java.util.List;
import org.dnyanyog.entity.Users;
import org.dnyanyog.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManagementService {
	
	@Autowired
	UsersDao user;
	
	public List<Users> getAllUser() throws SQLException{
		
		return user.findAll();
	}
	
	public Users getUserById(Integer userId){
		return user.findById(userId).get();
	}
}
