package com.voyageOrganise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.Ville;

public interface VilleDao extends JpaRepository<Ville, Long>{
	
	public Optional<Ville> findById(Long id);
	public List<Ville> findAll();
	public List<Ville> findByPaysId(Long id);
	
	

}
