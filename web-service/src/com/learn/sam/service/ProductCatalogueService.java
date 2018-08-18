package com.learn.sam.service;

import java.util.List;

import com.learn.sam.model.Product;

public interface ProductCatalogueService {

	List<String> getProductCategories();

	List<String> getProducts(String category);

	boolean addProduct(String category, String value);

	List<Product> getProductsV2(String category);

}