package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;

public class LoginService {
	
	public LoginResponse login(LoginRequest loginBody) throws SQLException {
		
		LoginResponse response=new LoginResponse();
		
		if(loginBody.validateLogin()) {
			response.errorCode="0000";
			response.message="Login Success";
			
			return response;
		}
		response.errorCode="911";
		response.message="Login Failed!!";
		
		return response;
			
	}
	
}
