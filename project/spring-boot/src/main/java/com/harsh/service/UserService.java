package com.harsh.service;

import com.harsh.exception.UserException;
import com.harsh.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
