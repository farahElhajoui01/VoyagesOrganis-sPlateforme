package com.voyageOrganise.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.dao.VilleDao;
import com.voyageOrganise.service.facade.VilleService;

@Service
public class VilleServiceImpl implements VilleService{
	
	@Autowired
	private VilleDao villeDao;

	@Override
	public Optional<Ville> findById(Long id) {
		return villeDao.findById(id);
	}

	@Override
	public List<Ville> findAll() {
		return villeDao.findAll();
	}

	@Override
	public List<Ville> findByPaysId(Long id) {
		return villeDao.findByPaysId(id);
	}
	
	


}
