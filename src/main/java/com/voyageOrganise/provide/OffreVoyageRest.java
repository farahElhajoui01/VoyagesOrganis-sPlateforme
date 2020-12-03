package com.voyageOrganise.provide;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.facade.OffreVoyageService;



@RestController

@RequestMapping("api/OffreVoyage")
public class OffreVoyageRest {

	@Autowired
	private OffreVoyageService offreVoyageService;
	
	@GetMapping("/id/{id}") 
	public Optional<OffreVoyage> findById(@PathVariable Long id) {
		return offreVoyageService.findById(id);
	}
}
