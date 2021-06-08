package br.com.api.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.model.User;
import br.com.api.repository.UserRepository;
import br.com.api.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	public UserRepository userRepository;

	public void userRegister(User user) {
		userRepository.save(user);
	}

	public List<User> findAllUsers() {
		
		return userRepository.findAll();
	}
	
	public User findById(int id) {
		return userRepository.findById(id).stream().collect(Collectors.toList()).get(0);
	}
	
	public void deleteUserById(int id) {
		userRepository.deleteById(id);
	}
}
