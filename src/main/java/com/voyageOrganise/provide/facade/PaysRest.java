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
import com.voyageOrganise.bean.Pays;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.service.facade.AgenceService;
import com.voyageOrganise.service.facade.PaysService;
import com.voyageOrganise.service.facade.VilleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/Pays")
public class PaysRest {
	@Autowired
	private PaysService paysService;
	
	@GetMapping("/id/{id}") 
	public Optional<Pays> findById(@PathVariable Long id) {
		return paysService.findById(id);
	}
	
	@GetMapping("/") 
	public List<Pays> findAll() {
		return paysService.findAll();
	}

}
