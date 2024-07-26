package org.dnyanyog.service;

import java.sql.SQLException;
import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddUserService {
	
	@Autowired
	UsersDao usersDao;
	
	public AddUserResponse addUser(AddUserRequest request) throws SQLException {
		
		Users usersTable = new Users();
		
		usersTable.setFirstName(request.getFirstName());
		usersTable.setLastName(request.getLastName());
		usersTable.setAddress(request.getAddress());
		usersTable.setEmail(request.getEmail());
		usersTable.setLoginName(request.getLoginName());
		usersTable.setPassword(request.getPassword());
		
		Users dataInsertedByDao=usersDao.save(usersTable); //Insert & Update
		
		AddUserResponse response=new AddUserResponse();
		
		
			response.setErrorCode("0000");
			response.setMessage("User Added Sucessfully!!");
			response.setRequest(request);
			
			response.setUser_id(dataInsertedByDao.getUser_id());
			
			return response;
	}
	
}
