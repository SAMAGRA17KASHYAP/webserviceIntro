package com.learn.sam;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.learn.sam.model.Product;

@WebService(targetNamespace = "http://www.samagra.org")
public interface IProductCatalogue {

	@WebMethod(action = "get_product_categories", operationName = "get_product_categories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProducts(String category, String value);

	@WebMethod
	@WebResult(name = "Product")
	List<Product> getProductsV2(String category);

}