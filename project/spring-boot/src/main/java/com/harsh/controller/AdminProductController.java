package com.harsh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.exception.ProductException;
import com.harsh.model.Product;
import com.harsh.request.CreateProductRequest;
import com.harsh.response.ApiResponse;
import com.harsh.service.ProductService;

@RestController
@RequestMapping("/api/admin/products")
public class AdminProductController {
	
	private ProductService productService;
	
	public AdminProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/")
	public ResponseEntity<List<Product>> createProductsHandler(@RequestBody List<CreateProductRequest> requests) throws ProductException {
		System.out.println(requests);
		List<Product> createdProducts = new ArrayList<>();

		for (CreateProductRequest req : requests) {
			Product createdProduct = productService.createProduct(req);
			createdProducts.add(createdProduct);
		}

		return new ResponseEntity<>(createdProducts, HttpStatus.ACCEPTED);
	}


	@DeleteMapping("/{productId}/delete")
	public ResponseEntity<ApiResponse> deleteProductHandler(@PathVariable Long productId) throws ProductException{

		System.out.println("delete product controller .... ");
		String msg=productService.deleteProduct(productId);
		System.out.println("delete product controller .... msg "+msg);
		ApiResponse res=new ApiResponse(msg,true);

		return new ResponseEntity<ApiResponse>(res,HttpStatus.ACCEPTED);

	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> findAllProduct(){
		
		List<Product> products = productService.getAllProducts();
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	@PutMapping("/{productId}/update")
	public ResponseEntity<Product> updateProductHandler(@RequestBody Product req,@PathVariable Long productId) throws ProductException{

		Product updatedProduct=productService.updateProduct(productId, req);

		return new ResponseEntity<Product>(updatedProduct,HttpStatus.OK);
	}

}
