package com.voyageOrganise.provide.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.voyageOrganise.bean.Choix;
import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.provide.converter.ChoixConverter;
import com.voyageOrganise.provide.vo.ChoixVo;
import com.voyageOrganise.service.facade.ChoixService;
import com.voyageOrganise.service.facade.OffreVoyageService;

import io.swagger.annotations.Api;

@Api("Les chois des offres de voyages")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/choix")
public class ChoixRest {
	@Autowired
	private ChoixService choixService;
	@Autowired
    private ChoixConverter choixConverter;
	
	@GetMapping("/maxTarif/{id}") 
	public double findMaxTarif(@PathVariable Long id) {
		return choixService.findMaxTarif(id);
	}
	
	@GetMapping("/minTarif/{id}") 
	public double findMinTarif(@PathVariable Long id) {
		return choixService.findMinTarif( id);
	}
	
	@GetMapping("/offreVoyage/titre/{titre}")
	public List<ChoixVo> findByOffreVoyageTitre(@PathVariable String titre) {
		List<Choix> choixs = choixService.findByOffreVoyageTitre(titre);
        choixConverter.setOffreVoyage(true);
        choixConverter.setReservations(true);
		return choixConverter.toVo(choixs);
	}


}
