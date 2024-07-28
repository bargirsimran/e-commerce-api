package org.dnyanyog.controller;

import org.dnyanyog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteUserController {
	
	@Autowired
	DeleteUserService deleteUserService;
	
	@DeleteMapping(path="/api/user/deleteUserById/{userId}")
	public void deleteByUserId(@PathVariable Integer userId) {
		deleteUserService.deleteUserById(userId);
	}
	
}
