//package org.dnyanyog.service;
//
//import java.sql.SQLException;
//
//import org.dnyanyog.common.DBUtils;
//import org.dnyanyog.dao.ProductDao;
//import org.dnyanyog.dto.AddProductRequest;
//import org.dnyanyog.dto.AddProductResponse;
//import org.dnyanyog.entity.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AddProductService {
//	
//	@Autowired
//	ProductDao productDao;
//	
//	public AddProductResponse addProduct(AddProductRequest request) throws SQLException {
//		
//		Product productTable=new Product();
//		
//		productTable.setName(request.getName());
//		productTable.setPrice(request.getPrice());
//		productTable.setQuantity(request.getPrice());
//		
//		Product dataInsetedByDao=productDao.save(productTable);
//		
//		AddProductResponse response=new AddProductResponse();
//		
//		
//			response.setErrorCode("0000");
//			response.setMessage("Product added Sucessfully!!");
//			response.setAddProductRequest(request);
//			return response;
//	
//	
//	}
//}
//
