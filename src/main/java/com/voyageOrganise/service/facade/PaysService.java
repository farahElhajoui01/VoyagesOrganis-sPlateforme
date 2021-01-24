package com.voyageOrganise.service.facade;

import java.util.List;
import java.util.Optional;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Pays;
import com.voyageOrganise.bean.Ville;

public interface PaysService {
	
	public Optional<Pays> findById(Long id);
	public List<Pays> findAll();


}
