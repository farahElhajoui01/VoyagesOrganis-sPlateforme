package com.voyageOrganise.provide.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyageOrganise.service.facade.ChoixService;
import com.voyageOrganise.service.facade.OffreVoyageService;

@RestController
@RequestMapping("api/choix")
public class ChoixRest {
	@Autowired
	private ChoixService choixService;
	
	@GetMapping("/maxTarif/{id}") 
	public double findMaxTarif(@PathVariable Long id) {
		return choixService.findMaxTarif(id);
	}
	
	@GetMapping("/minTarif/{id}") 
	public double findMinTarif(@PathVariable Long id) {
		return choixService.findMinTarif( id);
	}


}
