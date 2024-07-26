package org.dnyanyog.dto;

public class UpdateUserREsponse {
	private String errorCode;
	private String message;
	
	
	private UpdateUserRequest updateUserRequest;
	
	public UpdateUserRequest getUpdateUserRequest() {
		return updateUserRequest;
	}
	public void setUpdateUserRequest(UpdateUserRequest updateUserRequest) {
		this.updateUserRequest = updateUserRequest;
	}
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
