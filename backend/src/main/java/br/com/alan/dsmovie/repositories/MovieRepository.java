package br.com.alan.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alan.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{


}
