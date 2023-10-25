package com.harsh.service;

import java.util.List;

import com.harsh.exception.ProductException;
import com.harsh.model.ProductGreen;
import com.harsh.request.CreateGreenProductRequest;
import org.springframework.data.domain.Page;

import com.harsh.model.Product;
import com.harsh.request.CreateProductRequest;

public interface ProductService {
	
	// only for admin
	public ProductGreen createGreenProduct(CreateGreenProductRequest req) throws ProductException;
	public List<ProductGreen> getAllGreenProducts();
	public ProductGreen findGreenProductById(Long id) throws ProductException;

	public List<ProductGreen> findGreenProductByCategory(String category);

	public List<ProductGreen> searchGreenProduct(String query);
	public Page<ProductGreen> getAllGreenProduct(String category, List<String>colors, List<String> sizes, Integer minPrice, Integer maxPrice, Integer minDiscount,String sort, String stock, Integer pageNumber, Integer pageSize);
	public String deleteGreenProduct(Long productId) throws ProductException;

	public ProductGreen updateGreenProduct(Long productId,ProductGreen product)throws ProductException;
	public Product createProduct(CreateProductRequest req) throws ProductException;
	
	public String deleteProduct(Long productId) throws ProductException;
	
	public Product updateProduct(Long productId,Product product)throws ProductException;
	
	public List<Product> getAllProducts();
	
	// for user and admin both
	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findProductByCategory(String category);
	
	public List<Product> searchProduct(String query);
	
//	public List<Product> getAllProduct(List<String>colors,List<String>sizes,int minPrice, int maxPrice,int minDiscount, String category, String sort,int pageNumber, int pageSize);
	public Page<Product> getAllProduct(String category, List<String>colors, List<String> sizes, Integer minPrice, Integer maxPrice, Integer minDiscount,String sort, String stock, Integer pageNumber, Integer pageSize);
	
	
	
	

}
