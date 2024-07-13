package org.dnyanyog.dto;

import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;

public class AddProductRequest {
	
	public int product_id;
	public String name;
	public int quantity;
	public int price;
	
	public AddProductRequest(int product_id, String name, int quantity, int price) {
		this.product_id=product_id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public boolean addProductIntoDb() throws SQLException {
		
		String query="INSERT INTO product(product_id,name,quantity,price) "
				+ "VALUES ('"+product_id+"','"+name+"','"+quantity+"','"+price+"')";
		
		int rowsInserted=DBUtils.executeUpdateQuery(query);
		
		return rowsInserted>0;
	}
}
