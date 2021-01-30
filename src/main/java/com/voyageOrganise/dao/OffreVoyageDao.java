package com.voyageOrganise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.Ville;


public interface OffreVoyageDao extends JpaRepository<OffreVoyage, Long> {
	

	//public OffreVoyage findById(Long id);
	public List<OffreVoyage> findByDestinationsVilleId(Long id);
	
	public List<OffreVoyage> findByChoixTarifDeBaseGreaterThan(double prixMin);
	public List<OffreVoyage> findByChoixTarifDeBaseLessThan(double prixMax);
	public List<OffreVoyage> findByChoixTarifDeBaseBetween(double prixMin,double prixMax);
	public List<OffreVoyage> findAllByOrderByDateCreationDesc();
    public List<OffreVoyage> findByTypeVoyageId(Long id);
    public List<OffreVoyage> findByAgenceId(Long id);
    

    



}
