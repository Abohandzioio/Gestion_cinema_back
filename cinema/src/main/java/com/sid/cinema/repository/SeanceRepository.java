package com.sid.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sid.cinema.dao.Seance;
@RepositoryRestResource

public interface SeanceRepository extends JpaRepository<Seance, Long>{

}
