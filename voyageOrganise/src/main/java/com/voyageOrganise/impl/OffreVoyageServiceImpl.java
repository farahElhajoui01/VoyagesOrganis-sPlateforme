package com.voyageOrganise.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.dao.OffreVoyageDao;


@Service
public class OffreVoyageServiceImpl {
	@Autowired
	private OffreVoyageDao offreVoyageDao;
 
	public Optional<OffreVoyage> findById(Long id) {
		return offreVoyageDao.findById(id);
	}
}
