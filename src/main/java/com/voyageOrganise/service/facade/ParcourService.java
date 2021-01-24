package com.voyageOrganise.service.facade;

import java.util.List;
import java.util.Optional;

import com.voyageOrganise.bean.Parcour;

public interface ParcourService {
	
	public List<Parcour> findByOffreVoyageId(Long id);


}
