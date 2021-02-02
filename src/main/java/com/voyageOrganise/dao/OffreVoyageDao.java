package com.voyageOrganise.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.voyageOrganise.bean.OffreVoyage;

@Repository
public interface OffreVoyageDao extends JpaRepository<OffreVoyage, Long> {
	

	public OffreVoyage findByTitre(String titre);
	public List<OffreVoyage> findByDestinationsVilleId(Long id);
	
	public List<OffreVoyage> findByChoixTarifDeBaseGreaterThan(double prixMin);
	public List<OffreVoyage> findByChoixTarifDeBaseLessThan(double prixMax);
	public List<OffreVoyage> findByChoixTarifDeBaseBetween(double prixMin,double prixMax);
	public List<OffreVoyage> findAllByOrderByDateCreationDesc();
    public List<OffreVoyage> findByTypeVoyageId(Long id);
    public List<OffreVoyage> findByAgenceId(Long id);
    
	public int deleteByTitre(String titre);
    

    



}
