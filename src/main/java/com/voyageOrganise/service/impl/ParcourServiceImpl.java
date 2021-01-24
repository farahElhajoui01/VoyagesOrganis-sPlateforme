package com.voyageOrganise.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.Parcour;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.dao.ParcourDao;
import com.voyageOrganise.dao.VilleDao;
import com.voyageOrganise.service.facade.ParcourService;
import com.voyageOrganise.service.facade.VilleService;

@Service
public class ParcourServiceImpl implements ParcourService{
	
	@Autowired
	private ParcourDao parcourDao;

	@Override
	public List<Parcour> findByOffreVoyageId(Long id) {
		return parcourDao.findByOffreVoyageId(id);
	}

	
	


}
