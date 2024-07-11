package org.dnyanyog.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.*;

import org.dnyanyog.common.*;

public class LoginRequest {
	
	public String user;
	public String password;
	
	public LoginRequest(String user, String password) {
        this.user = user;
        this.password = password;
    }
	
	public boolean validateLogin() throws SQLException {
		String query="SELECT username, password FROM user WHERE username='"+user+"'AND password= '"+password+"'";
		
		ResultSet result=DBUtils.executeSelectQuery(query);
		return result.next();
		
	}
	
		
}
