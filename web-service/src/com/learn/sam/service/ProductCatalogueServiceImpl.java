package com.learn.sam.service;

import java.util.ArrayList;
import java.util.List;

import com.learn.sam.model.Product;

public class ProductCatalogueServiceImpl implements ProductCatalogueService {

	List<String> movieList = new ArrayList<>();
	List<String> songList = new ArrayList<>();
	List<String> videoList = new ArrayList<>();

	public ProductCatalogueServiceImpl() {
		super();
		movieList.add("movie1");
		movieList.add("movie2");
		movieList.add("movie3");

		songList.add("song1");
		songList.add("song2");
		songList.add("song3");

		videoList.add("video1");
		videoList.add("video2");
		videoList.add("video3");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.learn.sam.service.ProductCatalogueService#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Movies");
		categories.add("Song");
		categories.add("Videos");
		return categories;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.learn.sam.service.ProductCatalogueService#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		switch (category) {
		case "movie":
			return movieList;
		case "video":
			return videoList;
		case "song":
			return songList;

		}
		return null;
	}

	@Override
	public boolean addProduct(String category, String value) {
		switch (category) {
		case "movie":
			movieList.add(value);
			break;
		case "video":
			videoList.add(value);
			break;
		case "song":
			songList.add(value);
			break;
		}
		return true;
	}

	@Override
	public List<Product> getProductsV2(String category) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("name1", "sku1", 10.1));
		products.add(new Product("name2", "sku2", 10.2));
		products.add(new Product("name3", "sku3", 10.3));
		return products;
	}

}
