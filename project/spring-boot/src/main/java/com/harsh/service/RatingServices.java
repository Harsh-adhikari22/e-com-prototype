package com.harsh.service;

import java.util.List;

import com.harsh.exception.ProductException;
import com.harsh.model.Rating;
import com.harsh.model.User;
import com.harsh.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
