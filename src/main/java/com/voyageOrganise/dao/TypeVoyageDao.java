package com.voyageOrganise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.TypeVoyage;
import com.voyageOrganise.bean.Ville;

public interface TypeVoyageDao extends JpaRepository<TypeVoyage, Long>{
	
	public Optional<TypeVoyage> findById(Long id);
	public List<TypeVoyage> findAll();


}
