package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class DeleteUserResponse {
	
	private String errorCode;
	private String message;
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
