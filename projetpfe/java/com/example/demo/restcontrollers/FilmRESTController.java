package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Film;
import com.example.demo.service.FilmService;

@RestController
@RequestMapping("/api")
@CrossOrigin (origins = "*")
public class FilmRESTController {
	@Autowired
	FilmService filmService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Film> getAllFilms() {
	return filmService.getAllFilms();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Film getFilmById(@PathVariable("id") Long id) {
	return filmService.getFilm(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Film createProduit(@RequestBody Film film) {
	return filmService.saveFilm(film);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Film updateFilm(@RequestBody Film film) {
	return filmService.updateFilm(film);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteFilm(@PathVariable("id") Long id)
	{
	filmService.deleteFilmById(id);
	}
	@RequestMapping(value="/filmdir/{idDir}",method = RequestMethod.GET)
	public List<Film> getFilmssByDirId(@PathVariable("idDir") Long idDir) {
	return filmService.findByDirectorIdDir(idDir);
	}
	@RequestMapping(value="/filmByName/{nom}",method = RequestMethod.GET)
	public List<Film> findByNomFilmContains(@PathVariable("nom") String nom) {
	return filmService.findByNomFilmContains(nom);
	}
	
	
	}
