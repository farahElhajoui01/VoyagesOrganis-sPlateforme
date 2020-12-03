package com.voyageOrganise.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyageOrganise.bean.OffreVoyage;


public interface OffreVoyageDao extends JpaRepository<OffreVoyage, Long> {
	
	public Optional<OffreVoyage> findById(Long id);
	

}
