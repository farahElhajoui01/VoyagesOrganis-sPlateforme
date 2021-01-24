package com.voyageOrganise.provide.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.service.facade.VilleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/Ville")
public class VilleRest {
	@Autowired
	private VilleService villeService;
	
	@GetMapping("/id/{id}") 
	public Optional<Ville> findById(@PathVariable Long id) {
		return villeService.findById(id);
	}
	
	
	@GetMapping("/") 
	public List<Ville> findAll() {
		return villeService.findAll();
	}

	@GetMapping("/pays/id/{id}") 
	public List<Ville> findByPaysId(@PathVariable Long id) {
		return villeService.findByPaysId(id);
	}

}
