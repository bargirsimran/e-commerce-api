package org.dnyanyog.dto;

public class AddProductResponse {
	
	private String errorCode;
	private String message;
	private Integer product_id;
	private AddProductRequest addProductRequest;
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public AddProductRequest getAddProductRequest() {
		return addProductRequest;
	}
	public void setAddProductRequest(AddProductRequest addProductRequest) {
		this.addProductRequest = addProductRequest;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	
	
	
}
