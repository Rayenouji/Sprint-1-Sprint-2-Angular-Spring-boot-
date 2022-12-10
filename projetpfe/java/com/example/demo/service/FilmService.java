package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;

public interface FilmService {
	Film saveFilm(Film f);
	Film updateFilm(Film f);
	void deleteFilm(Film f);
	 void deleteFilmById(Long id);
	Film getFilm(Long id);
	List<Film> getAllFilms();
	List<Film> findByDirectorIdDir(Long idDir);
	List<Film> findByNomFilm(String nom);
	List<Film> findByNomFilmContains(String nom);
	List<Film> findByDirector (Director director);
	List<Film> findByOrderByNomFilmAsc();
	//List<Film> trierFilmsNomsGenre();

}
