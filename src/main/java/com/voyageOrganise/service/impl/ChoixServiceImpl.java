package com.voyageOrganise.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.Choix;
import com.voyageOrganise.dao.ChoixDao;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.service.facade.ChoixService;
import com.voyageOrganise.service.facade.OffreVoyageService;

@Service
public class ChoixServiceImpl implements ChoixService{
	@Autowired
	private ChoixDao choixDao;

	@Override
	public double findMaxTarif(Long id) {
		return choixDao.findMaxTarif(id);
	}

	@Override
	public double findMinTarif(Long id) {
		return choixDao.findMinTarif( id);
	}

	



}
