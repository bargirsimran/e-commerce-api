package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;

public class AddUserService {
	
	public AddUserResponse addUser(AddUserRequest addUserBody) throws SQLException {
		
		AddUserResponse response=new AddUserResponse();
		String query = "INSERT INTO user(user_id,name,email,address,username,password) VALUES "
				+ "('"+addUserBody.user_id+"','"+addUserBody.name+"','"+addUserBody.email+"','"+addUserBody.address+"','"+addUserBody.username+"','"+addUserBody.password+"') ";
		
		int rowsInserted= DBUtils.executeQuery(query);
		
		if(rowsInserted>0) {
			response.errorCode="0000";
			response.message="User Added Sucessfully!!";
		
			return response;
		}
		response.errorCode="911";
		response.message="User Added Failed!!";
		
		return response;
	}
}
