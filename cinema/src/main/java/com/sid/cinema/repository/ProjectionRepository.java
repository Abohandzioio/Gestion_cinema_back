package com.sid.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sid.cinema.dao.Projection;
@RepositoryRestResource
public interface ProjectionRepository extends JpaRepository<Projection, Long>{

}
