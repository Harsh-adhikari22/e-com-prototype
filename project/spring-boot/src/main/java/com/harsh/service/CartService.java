package com.harsh.service;

import com.harsh.exception.ProductException;
import com.harsh.model.Cart;
import com.harsh.model.User;
import com.harsh.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
