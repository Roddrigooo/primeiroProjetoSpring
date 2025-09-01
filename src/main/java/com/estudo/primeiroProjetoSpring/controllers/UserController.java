package com.estudo.primeiroProjetoSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.primeiroProjetoSpring.dto.UserDTO;
import com.estudo.primeiroProjetoSpring.services.UserServicie;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserServicie  service;
	
	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long Id) {
		return service.findById(Id);
				
	}
}
