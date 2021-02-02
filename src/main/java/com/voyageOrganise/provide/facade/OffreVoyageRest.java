package com.voyageOrganise.provide.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.provide.converter.AgenceConverter;
import com.voyageOrganise.provide.converter.ChoixConverter;
import com.voyageOrganise.provide.converter.CommentairesConverter;
import com.voyageOrganise.provide.converter.DestinationsConverter;
import com.voyageOrganise.provide.converter.ExtrasConverter;
import com.voyageOrganise.provide.converter.OffreVoyageConverter;
import com.voyageOrganise.provide.converter.TypeVoyageConverter;
import com.voyageOrganise.provide.vo.OffreVoyageVo;
import com.voyageOrganise.service.facade.OffreVoyageService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Les Offres de voyages")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/OffreVoyage")
public class OffreVoyageRest {

	@Autowired
	private OffreVoyageService offreVoyageService;
	@Autowired
    private OffreVoyageConverter offreVoyageConverter;
	@Autowired
    private AgenceConverter agenceConverter;
 @Autowired
    private ChoixConverter choixConverter;
 @Autowired
    private CommentairesConverter commentairesConverter;
 @Autowired
    private DestinationsConverter destinationsConverter;
 @Autowired
    private ExtrasConverter extrasConverter;
 @Autowired
    private TypeVoyageConverter typeVoyageConverter;
	
	@GetMapping("/titre/{titre}") 
	@ApiOperation("find offre by titre")
	public OffreVoyageVo findByTitre(@PathVariable String titre) {
		OffreVoyage offreVoyage = offreVoyageService.findByTitre(titre);
		commentairesConverter.setOffreVoyage(false);
		 agenceConverter.setOffreVoyage(false); 
		 typeVoyageConverter.setOffreVoyage(false);
		 destinationsConverter.setOffreVoyage(false);
		 extrasConverter.setTypeExtra(false);
		 choixConverter.setOffreVoyage(false);
		 choixConverter.setReservations(false);
		 choixConverter.setExtras(true);

		 typeVoyageConverter.setOffreVoyage(false);
		 offreVoyageConverter.setAgence(true);
		 offreVoyageConverter.setDestinations(true);
		 offreVoyageConverter.setChoix(true);

		 offreVoyageConverter.setCommentaires(true);
		 offreVoyageConverter.setDestinations(true);
		 offreVoyageConverter.setExtras(true);
		 offreVoyageConverter.setTypeVoyage(true);
		 destinationsConverter.setVille(true);
		return offreVoyageConverter.toVo(offreVoyage);
	}
	  
	@DeleteMapping("/titre/{titre}")
	public int deleteByRef(@PathVariable String titre) {
		return offreVoyageService.deleteByTitre(titre);
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
	public List<OffreVoyageVo> findAll() {
		List<OffreVoyage> offreVoyages = offreVoyageService.findAll();
		  offreVoyageConverter.setAgence(true);
		  offreVoyageConverter.setTypeVoyage(true);
		  offreVoyageConverter.setChoix(true);
		  offreVoyageConverter.setDestinations(true);
		  offreVoyageConverter.setCommentaires(true);
		return offreVoyageConverter.toVo(offreVoyages);
		
	}
	
	@GetMapping("ordered/") 
	public List<OffreVoyage> findAllByOrderByDateCreationDesc() {
		return offreVoyageService.findAllByOrderByDateCreationDesc();
	}
	
	@GetMapping("type/{id}") 
	public List<OffreVoyage> findByTypeId(@PathVariable Long id) {
		return offreVoyageService.findByTypeId(id);
	}
	
	@GetMapping("titre/{titre}/prixMin/{prixMin}/prixMax/{prixMax}")
	@ApiOperation("find OffreVoyage by IBy Criteria")
	public List<OffreVoyageVo> FindByCriteria(@PathVariable String titre,@PathVariable Double prixMin,@PathVariable Double prixMax) {
		List<OffreVoyage> offres= offreVoyageService.FindByCriteria(titre,prixMin,prixMax);
	     commentairesConverter.setOffreVoyage(false);

		agenceConverter.setOffreVoyage(false); 
		 typeVoyageConverter.setOffreVoyage(false);
		 destinationsConverter.setOffreVoyage(false);
		 extrasConverter.setTypeExtra(false);
		 typeVoyageConverter.setOffreVoyage(false);
		 offreVoyageConverter.setAgence(true);
		 offreVoyageConverter.setDestinations(true);
		 offreVoyageConverter.setExtras(true);
		 offreVoyageConverter.setTypeVoyage(true);
		 destinationsConverter.setVille(true);
		 System.out.println("3iw"+offres);
		 return offreVoyageConverter.toVo(offres);

	}

	
	
}
