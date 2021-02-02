package com.voyageOrganise.provide.converter;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Choix;
import com.voyageOrganise.provide.vo.ChoixVo;
import com.voyageOrganise.service.util.ListUtil;
import com.voyageOrganise.service.util.StringUtil;

@Component
public class ChoixConverter extends AbstractConverter<Choix,ChoixVo	>{

	 private boolean offreVoyage;
	 private boolean reservations;
	 private boolean extras; 
	 @Autowired
	    private OffreVoyageConverter offreVoyageConverter;
	 @Autowired
	    private ReservationConverter reservationConverter;
	 @Autowired
     private ExtrasConverter extraConverter;
	
	@Override
	public Choix toBean(ChoixVo vo) {
		Choix choix = new Choix();
		if(StringUtil.isNotEmpty(vo.getId())){
            choix.setId(StringUtil.toLong(vo.getId()));
        }
		 if(StringUtil.isNotEmpty(vo.getDateDebut())){
	            try {
	            	choix.setDateDebut(StringUtil.toDate(vo.getDateDebut()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		 if(StringUtil.isNotEmpty(vo.getDateFin())){
	            try {
	            	choix.setDateFin(StringUtil.toDate(vo.getDateFin()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		 if(StringUtil.isNotEmpty(vo.getTarifDeBase())){
	            choix.setTarifDeBase(StringUtil.toDouble(vo.getTarifDeBase()));
	        }
		 if(vo.getOffreVoyagevo()!=null && offreVoyage){
	        	choix.setOffreVoyage(offreVoyageConverter.toBean(vo.getOffreVoyagevo()));
	        }
		 if (ListUtil.isNotEmpty(vo.getReservationsVo() ) && reservations){
	        	choix.setReservations(reservationConverter.toBean(vo.getReservationsVo()));
	        }
		return choix;
	}

	@Override
	public ChoixVo toVo(Choix choix) {
		ChoixVo choixVo= new ChoixVo();
		if(choix.getId()!=null){
			 choixVo.setId(StringUtil.toString(choix.getId()));
	        }
		 if(choix.getDateDebut()!=null){
	        	choixVo.setDateDebut(StringUtil.toString(choix.getDateDebut()));
	        }
		 if(choix.getDateFin()!=null){
	        	choixVo.setDateFin(StringUtil.toString(choix.getDateFin()));
	        }
		 if(choix.getTarifDeBase()+""!=null){
	        	choixVo.setTarifDeBase(StringUtil.toString(choix.getTarifDeBase()));
	        }
	        if(choix.getOffreVoyage()!=null && offreVoyage){
	        	choixVo.setOffreVoyagevo(offreVoyageConverter.toVo(choix.getOffreVoyage()));
	        }
	        if (reservations && ListUtil.isNotEmpty(choix.getReservations())){
	        	choixVo.setReservationsVo(reservationConverter.toVo(choix.getReservations()));
	        }
	        
		return choixVo;
	}

	public boolean isOffreVoyage() {
		return offreVoyage;
	}

	public void setOffreVoyage(boolean offreVoyage) {
		this.offreVoyage = offreVoyage;
	}

	public boolean isReservations() {
		return reservations;
	}

	public void setReservations(boolean reservations) {
		this.reservations = reservations;
	}

	public OffreVoyageConverter getOffreVoyageConverter() {
		return offreVoyageConverter;
	}

	public void setOffreVoyageConverter(OffreVoyageConverter offreVoyageConverter) {
		this.offreVoyageConverter = offreVoyageConverter;
	}

	public ReservationConverter getReservationConverter() {
		return reservationConverter;
	}

	public void setReservationConverter(ReservationConverter reservationConverter) {
		this.reservationConverter = reservationConverter;
	}

	public boolean isExtras() {
		return extras;
	}

	public void setExtras(boolean extras) {
		this.extras = extras;
	}

	public ExtrasConverter getExtraConverter() {
		return extraConverter;
	}

	public void setExtraConverter(ExtrasConverter extraConverter) {
		this.extraConverter = extraConverter;
	}
	
		
}
