package com.voyageOrganise.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Extra;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.dao.AgenceDao;
import com.voyageOrganise.dao.ExtraDao;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.dao.VilleDao;
import com.voyageOrganise.service.facade.AgenceService;
import com.voyageOrganise.service.facade.ExtraService;
import com.voyageOrganise.service.facade.VilleService;

@Service
public class ExtraServiceImpl implements ExtraService{
	
	@Autowired
	private ExtraDao extraDao;

	@Override
	public List<Extra> findByOffreVoyageId(Long id) {
		return extraDao.findByOffreVoyageId(id);
	}

	@Override
	public List<Extra> findAll() {
		
		return extraDao.findAll();
	}
	
	


}
