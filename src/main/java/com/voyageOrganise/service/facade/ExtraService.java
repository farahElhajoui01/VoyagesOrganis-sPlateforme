package com.voyageOrganise.service.facade;

import java.util.List;
import java.util.Optional;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Extra;
import com.voyageOrganise.bean.Ville;

public interface ExtraService {
	
	
	public List<Extra> findByOffreVoyageId(Long id);
	public List<Extra> findAll();


}
