package com.nicolasgandrade.wsspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolasgandrade.wsspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	//Instancia um objeto repository que vai servir para realizar operações com os dados
	
	
	
	
}
