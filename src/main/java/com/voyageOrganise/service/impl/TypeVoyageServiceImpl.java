package com.voyageOrganise.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.TypeVoyage;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.dao.TypeVoyageDao;
import com.voyageOrganise.dao.VilleDao;
import com.voyageOrganise.service.facade.TypeVoyageService;
import com.voyageOrganise.service.facade.VilleService;

@Service
public class TypeVoyageServiceImpl implements TypeVoyageService{
	
	@Autowired
	private TypeVoyageDao typeVoyageDao;

	@Override
	public Optional<TypeVoyage> findById(Long id) {
		return typeVoyageDao.findById(id);
	}

	@Override
	public List<TypeVoyage> findAll() {
		return typeVoyageDao.findAll();
	}
	
	


}
