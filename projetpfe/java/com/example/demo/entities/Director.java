package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;






@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Director {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDir;
	private String nomDir;
	private String prenomDir;
	@JsonIgnore
	@OneToMany(mappedBy = "director")
	private List<Film> films;
	

}