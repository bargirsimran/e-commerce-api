package org.dnyanyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnyanyog.entity.Users;
import org.dnyanyog.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementService userManagementService;
	
	@GetMapping(path="/api/user/getAllUsers")
	public List<Users> getAllUser() throws SQLException{
		return userManagementService.getAllUser();
	}
	
	@GetMapping(path="/api/user/getUserById/{userId}")
	public Users getUserById(@PathVariable Integer userId) {
		return userManagementService.getUserById(userId);
	}
	
	
}
