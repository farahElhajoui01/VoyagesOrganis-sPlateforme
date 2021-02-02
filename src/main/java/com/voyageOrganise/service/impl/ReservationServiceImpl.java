package com.voyageOrganise.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyageOrganise.bean.Reservation;
import com.voyageOrganise.dao.ReservationDao;
import com.voyageOrganise.service.facade.ReservationService;


@Service
public class ReservationServiceImpl implements ReservationService{
	@Autowired
	private ReservationDao reservationDao;
	@Autowired
	private EntityManager entityManager;
		
   
	

	@Override
	public List<Reservation> findAll() {
		return reservationDao.findAll();
	}
	

	

	
	
	
}
