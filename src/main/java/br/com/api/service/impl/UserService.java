package br.com.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.model.User;
import br.com.api.repository.UserRepository;
import br.com.api.service.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	public UserRepository userRepository;
	
	public void userRegister(User user) {
		userRepository.save(user);
	}
}
