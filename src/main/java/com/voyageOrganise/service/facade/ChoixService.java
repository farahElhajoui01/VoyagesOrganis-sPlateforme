package com.voyageOrganise.service.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.voyageOrganise.bean.Choix;

public interface ChoixService {
	
	    public double findMaxTarif(Long idOffre);
	    public double findMinTarif(Long idOffre);
	    public List<Choix> findByOffreVoyageTitre(String titre);

}
