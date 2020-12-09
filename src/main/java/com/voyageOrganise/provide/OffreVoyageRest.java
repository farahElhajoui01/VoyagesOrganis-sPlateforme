package com.voyageOrganise.provide;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.facade.OffreVoyageService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/OffreVoyage")
public class OffreVoyageRest {

	@Autowired
	private OffreVoyageService offreVoyageService;
	
	@GetMapping("/id/{id}") 
	public Optional<OffreVoyage> findById(@PathVariable Long id) {
		return offreVoyageService.findById(id);
	}
	
	@GetMapping("/ville/{id}") 
	public List<OffreVoyage> findByDestinationsVill(@PathVariable Long id) {
		return offreVoyageService.findByDestinationsVille(id);
	}

	@GetMapping("/prixMin/{prixMin}") 
	public List<OffreVoyage> findByChoixTarifDeBaseGreaterThan(@PathVariable double prixMin) {
		
		return offreVoyageService.findByChoixTarifDeBaseGreaterThan(prixMin);
	}

	@GetMapping("/prixMax/{prixMax}") 
	public List<OffreVoyage> findByChoixTarifDeBaseLessThan(@PathVariable double prixMax) {
		return offreVoyageService.findByChoixTarifDeBaseLessThan(prixMax);
	}
	@GetMapping("/prix/{prixMin}/{prixMax}") 
	public List<OffreVoyage> findByChoixTarifDeBaseBetween(@PathVariable double prixMin,@PathVariable double prixMax) {
		return offreVoyageService.findByChoixTarifDeBaseBetween(prixMin, prixMax);
	}
	
	@GetMapping("/") 
	public List<OffreVoyage> findAll() {
		return offreVoyageService.findAll();
	}
	
	@GetMapping("ordered/") 
	public List<OffreVoyage> findAllByOrderByDateCreationDesc() {
		return offreVoyageService.findAllByOrderByDateCreationDesc();
	}
	
	@GetMapping("type/{id}") 
	public List<OffreVoyage> findByTypeId(@PathVariable Long id) {
		return offreVoyageService.findByTypeId(id);
	}
	


	
	
}
