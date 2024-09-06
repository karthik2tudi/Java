package com.techtroop.anudeep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtroop.anudeep.model.User;
import com.techtroop.anudeep.repositary.UserRepositary;
import com.techtroop.anudeep.service.IUserService;


@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepositary repo;






	@Override
	public Integer saveUser(User user) {
		
		return repo.save(user).getId(); 
	}

	

}
