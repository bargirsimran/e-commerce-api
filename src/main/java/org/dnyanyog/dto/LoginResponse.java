package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL) //To handle the null values
public class LoginResponse {
	
	public String errorCode;
	public String message;
	public String firstName;
	public String lastName;
	public String loginName;
}
