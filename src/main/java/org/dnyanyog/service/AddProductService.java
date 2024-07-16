package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;
import org.dnyanyog.dto.AddProductRequest;
import org.dnyanyog.dto.AddProductResponse;

public class AddProductService {

	public AddProductResponse addProduct(AddProductRequest addProductBody) throws SQLException {
		
		AddProductResponse response=new AddProductResponse();
		
		String query="INSERT INTO product(product_id,name,quantity,price) "
				+ "VALUES ('"+addProductBody.product_id+"','"+addProductBody.name+"','"+addProductBody.quantity+"','"+addProductBody.price+"')";
	
		int rowsInserted= DBUtils.executeQuery(query);
		
		if(rowsInserted>0) {
			response.errorCode="0000";
			response.message="Product added Sucessfully!!";
			return response;
	}
		else {
			response.errorCode="911";
			response.message="Product Added Failed!!";
			return response;
		}
	}
}

