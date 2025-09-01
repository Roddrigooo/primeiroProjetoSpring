package com.estudo.primeiroProjetoSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.primeiroProjetoSpring.dto.UserDTO;
import com.estudo.primeiroProjetoSpring.entities.User;
import com.estudo.primeiroProjetoSpring.repositories.UserRepository;

@Service
public class UserServicie {
	
	@Autowired
	private UserRepository repository;
	
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);	
		return dto;
	}

}
