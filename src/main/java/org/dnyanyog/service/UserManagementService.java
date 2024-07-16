package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.dnyanyog.dto.User;
import org.dnyanyog.common.DBUtils;
import org.springframework.stereotype.Component;

@Component
public class UserManagementService {
	
	public List<User> getAllUser() throws SQLException{
		
		
		ArrayList<User> userList= new ArrayList<>();
		
		String query= "SELECT * from user ";
		ResultSet result=DBUtils.SelectQuery(query);
		
		while(result.next()) {
			
			User user=new User();
			user.user_id=result.getInt("user_id");
			user.name=result.getString("name");
			user.email=result.getString("email");
			user.address=result.getString("address");
			user.username=result.getString("username");
			user.password=result.getString("password");
			
			userList.add(user);
		}
		return userList;
	}
}
