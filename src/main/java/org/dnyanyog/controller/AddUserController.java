package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.dto.UpdateUserREsponse;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	
	@Autowired
	private AddUserService addUserService;
	
	@PostMapping(path="/api/user/AddUser")
	public AddUserResponse addUser(@RequestBody AddUserRequest addUserBody) throws SQLException {
		
		return addUserService.addUser(addUserBody);
	}

}
