package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService; 
	
	@PostMapping("/login")
	public LoginResponse login(@RequestBody LoginRequest LoginBody) throws SQLException {
		
		return loginService.login(LoginBody);
	}
}
