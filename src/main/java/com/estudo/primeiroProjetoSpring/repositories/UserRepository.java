package com.estudo.primeiroProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.primeiroProjetoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
