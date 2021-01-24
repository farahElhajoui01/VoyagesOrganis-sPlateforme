package com.voyageOrganise.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voyageOrganise.bean.Choix;
import com.voyageOrganise.bean.OffreVoyage;

public interface ChoixDao  extends JpaRepository<Choix, Long>{
	 public static final String find_max_price = "SELECT  MAX(c.tarifDeBase) FROM Choix c where c.offreVoyage.id=:idOffre";
	 public static final String find_min_price = "SELECT  Min(c.tarifDeBase) FROM Choix c where c.offreVoyage.id=:idOffre";

	 @Query(find_max_price)
	 public double findMaxTarif(@Param("idOffre") Long idOffre);
	 @Query(find_min_price)
	 public double findMinTarif(@Param("idOffre") Long idOffre);

	
}
