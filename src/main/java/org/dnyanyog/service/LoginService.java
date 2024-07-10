package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dto.Login;

public class LoginService {
	
	public String login(Login loginBody) throws SQLException {
		
		if(loginBody.validateLogin())
			return "Login Sucess!";
		return "Login Failed!!";
	}
}
