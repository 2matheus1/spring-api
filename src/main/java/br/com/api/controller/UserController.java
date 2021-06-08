package br.com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.model.User;
import br.com.api.service.IUserService;
import lombok.Builder;

@CrossOrigin(origins = "*")
@RequestMapping("/api/user")
@RestController
public class UserController {

	@Autowired
	IUserService userService;

	@PostMapping("/register")
	public void UserRegister(@RequestParam String name, String address, String cpf) {
		User user = new User(name, address, cpf, 2);
		userService.userRegister(user);
	}
}
