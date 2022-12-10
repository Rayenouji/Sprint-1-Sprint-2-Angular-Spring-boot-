package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;
import com.example.demo.repos.FilmRepository;

@SpringBootTest
class ProjetpfeApplicationTests {
	@Autowired
	private FilmRepository filmRepository;
	@Test
	public void testCreateFilm() {
	Film f = new Film("spidermen","action",new Date());
	filmRepository.save(f);
	}
	@Test
	public void testFindFilm()
	{
	Film p = filmRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateFilm()
	{
	Film p = filmRepository.findById(1L).get();
	p.setGenre("romantic");
	filmRepository.save(p);
	}
	@Test
	public void testDeleteFilm()
	{
	filmRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousFilms()
	{
	List<Film> films = filmRepository.findAll();
	for (Film p : films)
	{
	System.out.println(p);}
	}
	@Test
	public void testFindByNomProduit()
	{
	List<Film> prods = filmRepository.findByNomFilm("spidermen");
	for (Film p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomProduitContains ()
	{
	List<Film> prods=filmRepository.findByNomFilmContains("spider");
	for (Film p : prods)
	{
	System.out.println(p);
	} }
	@Test
	public void testfindByNomGenre()
	{
	List<Film> prods = filmRepository.findByNomGenre("spidermen","romantic");
	for (Film p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByDirector()
	{
	Director cat = new Director();
	cat.setIdDir(1L);
	List<Film> prods = filmRepository.findByDirector(cat);
	for (Film p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void findByDirectorIdDir()
	{
	List<Film> prods = filmRepository.findByDirectorIdDir(1L);
	for (Film p : prods)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomFilmAsc()
	{
	List<Film> prods =filmRepository.findByOrderByNomFilmAsc();
	for (Film p : prods)
	{
	System.out.println(p);
	}
	}

	}
