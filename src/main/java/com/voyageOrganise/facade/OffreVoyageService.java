package com.voyageOrganise.facade;

import java.util.List;
import java.util.Optional;

import com.voyageOrganise.bean.OffreVoyage;



public interface OffreVoyageService {
	 public Optional<OffreVoyage> findById(Long id);
	 public List<OffreVoyage> findAll();

}
