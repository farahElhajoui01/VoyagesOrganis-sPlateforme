package com.voyageOrganise.service.facade;

import java.util.List;
import java.util.Optional;

import com.voyageOrganise.bean.Ville;

public interface VilleService {
	
	public Optional<Ville> findById(Long id);
	public List<Ville> findAll();
	public List<Ville> findByPaysId(Long id);


}
