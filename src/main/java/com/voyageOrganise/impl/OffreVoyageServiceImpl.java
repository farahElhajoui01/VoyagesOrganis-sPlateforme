package com.voyageOrganise.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.Extra;
import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.TypeExtra;
import com.voyageOrganise.bean.TypeVoyage;
import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.dao.OffreVoyageDao;
import com.voyageOrganise.facade.OffreVoyageService;


@Service
public class OffreVoyageServiceImpl implements OffreVoyageService{
	@Autowired
	private OffreVoyageDao offreVoyageDao;
	@Autowired
	private EntityManager entityManager;
		
 
	public Optional<OffreVoyage> findById(Long id) {
		return offreVoyageDao.findById(id);
	}


	@Override
	public List<OffreVoyage> findAll() {
		return offreVoyageDao.findAll();
	}


	@Override
	public List<OffreVoyage> FindByCriteria(Ville ville, Double prixMax, Double prixMin, Integer rating,
			List<Extra> options,TypeVoyage type) {
		
	/*	String query="Select o from OffreVoyage o where 1=1";
		
		
		
		List<OffreVoyage> offres=new ArrayList<OffreVoyage>() ;
          if(ville!=null && ville.getId()!=null)
        	  query+=" and o.ville.id="+ville.getId();
          else if( prixMax!=null )
        	  query+=" and o.tarifBase <  "+prixMax;
        	  offres=offreVoyageDao.findByChoixTarifDeBaseLessThan(prixMax);
       
		return entityManager.createQuery(query).getResultList();
	*/
		return null;
	}


	@Override
	public List<OffreVoyage> findByDestinationsVille(Long id) {
		return offreVoyageDao.findByDestinationsVilleId(id);
	}


	@Override
	public List<OffreVoyage> findByChoixTarifDeBaseGreaterThan(double prixMin) {
		
		return offreVoyageDao.findByChoixTarifDeBaseGreaterThan(prixMin);
	}


	@Override
	public List<OffreVoyage> findByChoixTarifDeBaseLessThan(double prixMax) {
		return offreVoyageDao.findByChoixTarifDeBaseLessThan(prixMax);
	}


	@Override
	public List<OffreVoyage> findByChoixTarifDeBaseBetween(double prixMin,double prixMax) {
		return offreVoyageDao.findByChoixTarifDeBaseBetween(prixMin, prixMax);
	}


	@Override
	public List<OffreVoyage> findAllByOrderByDateCreationDesc() {
		return offreVoyageDao.findAllByOrderByDateCreationDesc();
	}


	@Override
	public List<OffreVoyage> findByTypeId(Long id) {
		return offreVoyageDao.findByTypeVoyageId(id);
	}


	
	
	
}
