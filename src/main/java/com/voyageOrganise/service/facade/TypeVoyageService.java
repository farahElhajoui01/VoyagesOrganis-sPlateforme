package com.voyageOrganise.service.facade;

import java.util.List;
import java.util.Optional;

import com.voyageOrganise.bean.TypeVoyage;
import com.voyageOrganise.bean.Ville;

public interface TypeVoyageService {
	
	public Optional<TypeVoyage> findById(Long id);
	public List<TypeVoyage> findAll();


}
