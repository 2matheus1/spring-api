package br.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.model.User;
import br.com.api.service.IUserService;

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

	@GetMapping("/getUserById")
	public void GetUserById(@RequestParam int id) {
		try {
			User user = userService.findById(id);
			System.out.println("Usuario encontrado");
		} catch (Exception e) {
			System.out.println("Usuário não encontrado");
		}
	}

	@GetMapping("getAllUsers")
	public void GetAllUsers() {
		List<User> lstUser = userService.findAllUsers();
		if(lstUser.isEmpty()) {
			System.out.println("Nenhum usuario encontrado");
		}else {
			System.out.println("temos "+lstUser.size()+" usuario(s) no sistema");
		}
	}
	
	@DeleteMapping("deleteUserById")
	public void DeleteUserById(int id) {
		try {
			userService.deleteUserById(id);
			System.out.println("Usuario deletado com sucesso");
		}catch(Exception e) {
			System.out.println("Erro ao deletar o Usuario solicitado");
		}
	}
}
