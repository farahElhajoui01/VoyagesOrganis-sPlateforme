package com.voyageOrganise.provide.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyageOrganise.bean.Parcour;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.service.facade.ParcourService;
import com.voyageOrganise.service.facade.VilleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/Parcour")
public class ParcourRest {
	@Autowired
	private ParcourService parcourService;
	
	

	@GetMapping("/id/{id}") 
	public List<Parcour> findByOffreyVoyageId(@PathVariable Long id) {
		return parcourService.findByOffreVoyageId(id);
	
}
}