package br.com.alan.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alan.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
