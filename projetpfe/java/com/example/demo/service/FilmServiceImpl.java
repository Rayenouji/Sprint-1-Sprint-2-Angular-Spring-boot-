package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;
import com.example.demo.repos.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {
	@Autowired
	FilmRepository filmRepository;
	@Override
	public Film saveFilm(Film p) {

	return filmRepository.save(p);
	}
	@Override
	public Film updateFilm(Film p) {
	return filmRepository.save(p);
	}
	@Override
	public void deleteFilm(Film p) {
	filmRepository.delete(p);
	}
	@Override
	public void deleteFilmById(Long id) {
	filmRepository.deleteById(id);
	}
	@Override
	public Film getFilm(Long id) {
	return filmRepository.findById(id).get();
	}
	@Override
	public List<Film> getAllFilms() {
	return filmRepository.findAll();
	}
	/*@Override
	public Page<Film> getAllFilmsParPage(int page, int size) {
		return filmRepository.findAll(PageRequest.of(page, size));
		}*/
	@Override
	public List<Film> findByNomFilm(String nom) {
	return filmRepository.findByNomFilm(nom);
	}
	@Override
	public List<Film> findByNomFilmContains(String nom) {
	return filmRepository.findByNomFilmContains(nom);
	}
	/*@Override   
	public List<Film> findByNomGenre(String nom, String genre) {
	return filmRepository.findByNomGenre(nom, genre);
	}*/
	@Override
	public List<Film> findByDirector(Director categorie) {
	return filmRepository.findByDirector(categorie);
	}
	@Override
	public List<Film> findByDirectorIdDir(Long id) {
	return filmRepository.findByDirectorIdDir(id);
	}
	@Override
	public List<Film> findByOrderByNomFilmAsc() {
	return filmRepository.findByOrderByNomFilmAsc();
	}
	/*@Override
	public List<Film> trierFilmsNomsGenre() {
	return filmRepository.trierFilmsNomsGenre();
	}*/
	/*@Override
	public List<Film> trierFilmsNomsGenre() {
		// TODO Auto-generated method stub
		return filmRepository.trierFilmsNomsGenre();
	}*/
}