package com.voyageOrganise.provide.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.bean.Reservation;
import com.voyageOrganise.provide.converter.AgenceConverter;
import com.voyageOrganise.provide.converter.ChoixConverter;
import com.voyageOrganise.provide.converter.CommentairesConverter;
import com.voyageOrganise.provide.converter.DestinationsConverter;
import com.voyageOrganise.provide.converter.ExtrasConverter;
import com.voyageOrganise.provide.converter.OffreVoyageConverter;
import com.voyageOrganise.provide.converter.ReservationConverter;
import com.voyageOrganise.provide.converter.TypeVoyageConverter;
import com.voyageOrganise.provide.vo.OffreVoyageVo;
import com.voyageOrganise.provide.vo.ReservationVo;
import com.voyageOrganise.service.facade.OffreVoyageService;
import com.voyageOrganise.service.facade.ReservationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Les reservations")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/Reservation")
public class ReservationRest {

	@Autowired
	private ReservationService reservationService;
	@Autowired
    private OffreVoyageConverter offreVoyageConverter;
	@Autowired
    private AgenceConverter agenceConverter;
 @Autowired
    private ChoixConverter choixConverter;
 @Autowired
    private CommentairesConverter commentairesConverter;
 @Autowired
    private ReservationConverter reservationConverter;
 @Autowired
    private ExtrasConverter extrasConverter;
 @Autowired
    private TypeVoyageConverter typeVoyageConverter;
	
	
	@GetMapping("/") 
	public List<ReservationVo> findAll() {
		List<Reservation> reservations = reservationService.findAll();
		  reservationConverter.setChoix(true);
		  reservationConverter.setVoyageur(true);
		return reservationConverter.toVo(reservations);
		
	}
	
	

	
	
}
