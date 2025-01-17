package com.sid.cinema.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ticket {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String nomClient;
private double prix;
@Column(unique=false, nullable = true)
private Integer codePayement;
private boolean reserve;
@ManyToOne
private Place place;
@ManyToOne
@JsonProperty(access = Access.WRITE_ONLY)
private Projection projection;
}
