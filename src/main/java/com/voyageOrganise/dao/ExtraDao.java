package com.voyageOrganise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Extra;
import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.Ville;

public interface ExtraDao extends JpaRepository<Extra, Long>{
	
	public List<Extra> findByOffreVoyageId(Long id);
	public List<Extra> findAll();

	

}
