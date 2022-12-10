package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFilm;
	private String nomFilm;
	private String genre;
	private Date dateCreation;
	@ManyToOne
	private Director director;
	public Film() {
		super();
			}
	public Film(String nomFilm, String genre, Date dateCreation) {
		super();
		this.nomFilm = nomFilm;
		this.genre = genre;
		this.dateCreation = dateCreation;
		
	}
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", genre=" + genre + ", dateCreation=" + dateCreation
				+ "]";
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	

}
