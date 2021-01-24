package com.voyageOrganise.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Pays;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.dao.AgenceDao;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.dao.PaysDao;
import com.voyageOrganise.dao.VilleDao;
import com.voyageOrganise.service.facade.AgenceService;
import com.voyageOrganise.service.facade.PaysService;
import com.voyageOrganise.service.facade.VilleService;

@Service
public class PaysServiceImpl implements PaysService{
	
	@Autowired
	private PaysDao paysDao;

	@Override
	public Optional<Pays> findById(Long id) {
		return paysDao.findById(id);
	}

	@Override
	public List<Pays> findAll() {
		
		return paysDao.findAll();
	}
	
	


}
