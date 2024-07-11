package org.dnyanyog.dto;

import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;

public class AddUserRequest {
	
	public int user_id;
	public String name;
	public String email;
	public String address;
	public String username;
	public String password;
	
	public AddUserRequest(int user_id,String name, String email, String address, 
			String username, String password) {
		this.user_id=user_id;
		this.name=name;
		this.email=email;
		this.address=address;
		this.username=username;
		this.password=password;
	}
	
	public boolean addUserIntoDb() throws SQLException {
		
		String query = "INSERT INTO user(user_id,name,email,address,username,password) VALUES "
				+ "('"+user_id+"','"+name+"','"+email+"','"+address+"','"+username+"','"+password+"') ";
		
		int rowsInserted= DBUtils.executeUpdateQuery(query);
		return rowsInserted>0;
	
	}
	
	
}
