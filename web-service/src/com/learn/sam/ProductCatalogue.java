package com.learn.sam;

import java.util.List;

import javax.jws.WebService;

import com.learn.sam.model.Product;
import com.learn.sam.service.ProductCatalogueService;
import com.learn.sam.service.ProductCatalogueServiceImpl;

@WebService(endpointInterface = "com.learn.sam.IProductCatalogue", name = "TestMartName", portName = "TestMartPortName", serviceName = "TestMartService")
public class ProductCatalogue implements IProductCatalogue {

	ProductCatalogueService productCatalogueService = new ProductCatalogueServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.learn.sam.IProductCatalogue#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productCatalogueService.getProductCategories();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.learn.sam.IProductCatalogue#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productCatalogueService.getProducts(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.learn.sam.IProductCatalogue#addProducts(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean addProducts(String category, String value) {
		return productCatalogueService.addProduct(category, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.learn.sam.IProductCatalogue#getProductsV2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsV2(String category) {
		return productCatalogueService.getProductsV2(category);
	}

}
