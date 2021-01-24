package com.voyageOrganise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.Parcour;
import com.voyageOrganise.bean.Ville;

public interface ParcourDao extends JpaRepository<Parcour, Long>{
	
	public List<Parcour> findByOffreVoyageId(Long id);
	
	

}
