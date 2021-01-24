package com.voyageOrganise.service.facade;

import java.util.List;
import java.util.Optional;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Ville;

public interface AgenceService {
	
	public Optional<Agence> findById(Long id);
	public List<Agence> findAll();


}
