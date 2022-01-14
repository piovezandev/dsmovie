package br.com.alan.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alan.dsmovie.entities.Score;
import br.com.alan.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{


}
