package org.dnyanyog.service;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.DeleteUserRequest;
import org.dnyanyog.dto.DeleteUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteUserService {
	
	@Autowired
	UsersDao user;
	
	@Autowired
	DeleteUserResponse response;
	
	public DeleteUserResponse deleteUserById(Integer userid) {
		user.deleteById(userid);
		response.setErrorCode("0000");
		response.setMessage("User Delete Successfully!!");
		return response;
	}
	
	
	
}
