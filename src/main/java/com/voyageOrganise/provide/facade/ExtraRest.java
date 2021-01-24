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
import com.voyageOrganise.bean.Extra;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.service.facade.AgenceService;
import com.voyageOrganise.service.facade.ExtraService;
import com.voyageOrganise.service.facade.VilleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/Extra")
public class ExtraRest {
	@Autowired
	private ExtraService extraService;
	
	@GetMapping("/id/{id}") 
	public List<Extra>findByOffreVoyageId(@PathVariable Long id) {
		return extraService.findByOffreVoyageId(id);
	}

	
	@GetMapping("/") 
	public List<Extra> findAll() {
		return extraService.findAll();
	}
	
}
