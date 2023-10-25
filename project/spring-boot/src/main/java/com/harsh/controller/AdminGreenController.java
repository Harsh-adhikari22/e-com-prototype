package com.harsh.controller;

import com.harsh.exception.ProductException;
import com.harsh.model.ProductGreen;
import com.harsh.request.CreateGreenProductRequest;
import com.harsh.response.ApiResponse;
import com.harsh.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/admin/green/products")
public class AdminGreenController {
    private ProductService productService;
    public AdminGreenController(ProductService productService){this.productService=productService;}
    @PostMapping("/")
    public ResponseEntity<List<ProductGreen>> createProductsHandler(@RequestBody List<CreateGreenProductRequest> requests) throws ProductException {
        System.out.println(requests);
        List<ProductGreen> createdProducts = new ArrayList<>();

        for (CreateGreenProductRequest req : requests) {
            ProductGreen createdProduct = productService.createGreenProduct(req);
            createdProducts.add(createdProduct);
        }

        return new ResponseEntity<>(createdProducts, HttpStatus.ACCEPTED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ProductGreen>> findAllProduct(){

        List<ProductGreen> products = productService.getAllGreenProducts();

        return new ResponseEntity<List<ProductGreen>>(products,HttpStatus.OK);
    }
    @DeleteMapping("/{productId}/delete")
    public ResponseEntity<ApiResponse> deleteProductHandler(@PathVariable Long productId) throws ProductException{

        System.out.println("delete product controller .... ");
        String msg=productService.deleteProduct(productId);
        System.out.println("delete product controller .... msg "+msg);
        ApiResponse res=new ApiResponse(msg,true);

        return new ResponseEntity<ApiResponse>(res,HttpStatus.ACCEPTED);

    }

}
