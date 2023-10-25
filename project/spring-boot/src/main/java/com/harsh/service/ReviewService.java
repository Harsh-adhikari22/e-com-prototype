package com.harsh.service;

import java.util.List;

import com.harsh.exception.ProductException;
import com.harsh.model.Review;
import com.harsh.model.User;
import com.harsh.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
