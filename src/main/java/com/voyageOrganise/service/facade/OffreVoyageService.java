package com.voyageOrganise.service.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Extra;
import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.TypeExtra;
import com.voyageOrganise.bean.TypeVoyage;
import com.voyageOrganise.bean.Ville;



public interface OffreVoyageService {
	// public OffreVoyage findById(Long id);
	 public List<OffreVoyage> findAll();
	 public List<OffreVoyage> findByDestinationsVille(Long id);
	 public List<OffreVoyage> findByChoixTarifDeBaseGreaterThan(double prixMin);
	 public List<OffreVoyage> findByChoixTarifDeBaseLessThan(double prixMax);
	 public List<OffreVoyage> findByChoixTarifDeBaseBetween(double prixMin,double prixMax);
	
	 public List<OffreVoyage> findAllByOrderByDateCreationDesc();
	 public List<OffreVoyage> findByTypeId(Long id);
	 
		public List<OffreVoyage> FindByCriteria(Long villeId, Long agenceId, Long typeId, Double prixMax) ;

	

}
