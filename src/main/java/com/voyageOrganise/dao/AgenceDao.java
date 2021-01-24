package com.voyageOrganise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.Ville;

public interface AgenceDao extends JpaRepository<Agence, Long>{
	
	public Optional<Agence> findById(Long id);
	public List<Agence> findAll();

	

}
