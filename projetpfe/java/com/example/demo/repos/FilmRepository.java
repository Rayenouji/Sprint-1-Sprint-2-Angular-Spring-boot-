package com.example.demo.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;
@RepositoryRestResource(path = "rest")
public interface FilmRepository extends JpaRepository<Film,Long> {
	List<Film>findByNomFilm(String nom);
	@Query("select p from Film p where p.nomFilm like %:nom ")
	List<Film>findByNomFilmContains(String nom);
	@Query("select p from Film p where p.nomFilm like %:nom and p.genre like %:genre")
	List<Film> findByNomGenre (@Param("nom") String nom,@Param("genre") String genre);
	@Query("select p from Film p where p.director = ?1")
	List<Film> findByDirector (Director director);
	List<Film> findByDirectorIdDir(Long id);
	List<Film> findByOrderByNomFilmAsc();
	//List<Film> trierFilmsNomsGenre ();


}
