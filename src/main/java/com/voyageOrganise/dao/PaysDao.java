package com.voyageOrganise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.Pays;
import com.voyageOrganise.bean.Ville;

public interface PaysDao extends JpaRepository<Pays, Long>{
	
	public Optional<Pays> findById(Long id);
	public List<Pays> findAll();

	
	

}
