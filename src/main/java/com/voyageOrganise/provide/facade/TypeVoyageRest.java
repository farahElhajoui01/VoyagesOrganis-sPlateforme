package com.voyageOrganise.provide.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.TypeVoyage;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.service.facade.TypeVoyageService;
import com.voyageOrganise.service.facade.VilleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/TypeVoyage")
public class TypeVoyageRest {
	@Autowired
	private TypeVoyageService typeVoyageService;
	
	@GetMapping("/id/{id}") 
	public Optional<TypeVoyage> findById(@PathVariable Long id) {
		return typeVoyageService.findById(id);
	}

	@GetMapping("/") 
	public List<TypeVoyage> findAll() {
		return typeVoyageService.findAll();
	}
	
}
