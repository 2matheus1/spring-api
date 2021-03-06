package br.com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public void findByName(String name);
}
