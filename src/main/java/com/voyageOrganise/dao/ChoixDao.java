package com.voyageOrganise.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.voyageOrganise.bean.Choix;

@Repository
public interface ChoixDao  extends JpaRepository<Choix, Long>{
	
	public List<Choix> findByOffreVoyageTitre(String titre);
	 public static final String find_max_price = "SELECT  MAX(c.tarifDeBase) FROM Choix c where c.offreVoyage.id=:idOffre";
	 public static final String find_min_price = "SELECT  Min(c.tarifDeBase) FROM Choix c where c.offreVoyage.id=:idOffre";

	 @Query(find_max_price)
	 public double findMaxTarif(@Param("idOffre") Long idOffre);
	 @Query(find_min_price)
	 public double findMinTarif(@Param("idOffre") Long idOffre);

	
}
