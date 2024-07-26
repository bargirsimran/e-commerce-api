package org.dnyanyog.controller;

import org.dnyanyog.dto.UpdateUserREsponse;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.service.AddUserService;
import org.dnyanyog.service.UpdateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateProductController {
	
	@Autowired
	private UpdateUserService updateUserService;
	
	@PostMapping(path="/api/user/UpdateUser")
	public UpdateUserREsponse updateUser(@RequestBody UpdateUserRequest updateUserBody) {
		
		return updateUserService.updateUser(updateUserBody);
	}
}
