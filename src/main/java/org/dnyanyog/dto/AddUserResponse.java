package org.dnyanyog.dto;

public class AddUserResponse {
	
	private String errorCode;
	private String message;
	private Integer user_id;
	
	private AddUserRequest request;

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

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public AddUserRequest getRequest() {
		return request;
	}

	public void setRequest(AddUserRequest request) {
		this.request = request;
	}
	
	
	
}
