package org.dnyanyog.service;


import java.sql.SQLException;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static org.dnyanyog.common.JavaUtil.isNotNull;

@Component
public class LoginService {
	
	@Autowired
	UsersDao userDao;
	
	public LoginResponse login(LoginRequest loginBody) throws SQLException {
		
		LoginResponse response=new LoginResponse();
		Users userReceivedFromDb= userDao.findByLoginName(loginBody.loginName);
		
		//Users userReceivedFromDb=userDao.findById(1).get();
		
	
		if(isNotNull(userReceivedFromDb)) {
			
			if(userReceivedFromDb.getLoginName().equals(loginBody.loginName)
					&& userReceivedFromDb.getPassword().equals(loginBody.password) ){
					response.errorCode="0000";
					response.message="Login Success";
					response.firstName=userReceivedFromDb.getFirstName();
					response.lastName=userReceivedFromDb.getLastName();
					response.loginName=userReceivedFromDb.getLoginName();
					
					return response;
					
			}
			else {
				response.errorCode="911";
				response.message="Login Failed!!";
				return response;
				}
			
		}
		
		else {
			response.errorCode="911";
			response.message="User Not Found!!";
			return response;
		}
	
			
	}
	
}
