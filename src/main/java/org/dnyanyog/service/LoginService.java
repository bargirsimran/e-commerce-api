package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;

public class LoginService {
	
	public LoginResponse login(LoginRequest loginBody) throws SQLException {
		
		LoginResponse response=new LoginResponse();
		
		String query="SELECT username, password FROM user WHERE username='"+loginBody.user+"'AND password= '"+loginBody.password+"'";
		
		ResultSet result=DBUtils.SelectQuery(query);
		
		if(result.next()) {
			response.errorCode="0000";
			response.message="Login Success";
			
			return response;
		}
		response.errorCode="911";
		response.message="Login Failed!!";
		
		return response;
			
	}
	
}
