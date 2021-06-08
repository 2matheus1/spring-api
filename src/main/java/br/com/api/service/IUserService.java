package br.com.api.service;

import java.util.List;

import br.com.api.model.User;

public interface IUserService {
	void userRegister(User user);
	
	List<User> findAllUsers();
	
	User findById(int id);

}
