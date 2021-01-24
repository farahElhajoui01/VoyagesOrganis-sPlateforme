package com.voyageOrganise.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.dao.AgenceDao;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.dao.VilleDao;
import com.voyageOrganise.service.facade.AgenceService;
import com.voyageOrganise.service.facade.VilleService;

@Service
public class AgenceServiceImpl implements AgenceService{
	
	@Autowired
	private AgenceDao agenceDao;

	@Override
	public Optional<Agence> findById(Long id) {
		return agenceDao.findById(id);
	}

	@Override
	public List<Agence> findAll() {
		
		return agenceDao.findAll();
	}
	
	


}
