package com.sid.cinema.dao;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Ville {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
 private Long id;
 private String nom;
 private double longitude,atitude,altitude;
 @OneToMany(mappedBy = "ville")
 private Collection<Cinema> cinema;
 
}
