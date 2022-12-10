package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Director;
import com.example.demo.repos.DirectorRepository;

@RestController
@RequestMapping("/api/dir")
@CrossOrigin

public class DirectorRestController {
	@Autowired
	DirectorRepository directorRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Director> getAllDirectores()
	{
	return directorRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Director getDirectorById(@PathVariable("id") Long id) {
	return directorRepository.findById(id).get();
	}
	}
