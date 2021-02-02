package com.voyageOrganise.provide.converter;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Reservation;
import com.voyageOrganise.provide.vo.ReservationVo;
import com.voyageOrganise.service.util.StringUtil;
@Component
public class ReservationConverter extends AbstractConverter<Reservation,ReservationVo>{
	private boolean voyageur; 
	private boolean choix; 


    @Autowired
    private ChoixConverter choixConverter;
    @Autowired
    private VoyageurConverter voyageurConverter;
    
	
	@Override
	public Reservation toBean(ReservationVo vo) {
		Reservation reservation=new Reservation();
		
		    if (StringUtil.isNotEmpty(vo.getId())){
	        	reservation.setId(StringUtil.toLong(vo.getId()));
	        }
	        if (StringUtil.isNotEmpty(vo.getTotalAPayer())){
	        	reservation.setTotalAPayer(StringUtil.toDouble(vo.getTotalAPayer()));
	        }
	       
	       if (StringUtil.isNotEmpty(vo.getAnnule())){
	        	reservation.setAnnule(StringUtil.toBoolean(vo.getAnnule()));
	        }
	        if(StringUtil.isNotEmpty(vo.getDateRes())){
	            try {
					reservation.setDateRes(StringUtil.toDate(vo.getDateRes()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	       
	        if (voyageur  && vo.getVoyageurVo()!=null){
	        	reservation.setVoyageur(voyageurConverter.toBean(vo.getVoyageurVo()));
	        }
	        
	        if (choix  && vo.getChoixVo()!=null){
	        	reservation.setChoix(choixConverter.toBean(vo.getChoixVo()));
	        }
	        return reservation;
	}

	@Override
	public ReservationVo toVo(Reservation bean) {
		ReservationVo reservationVo=new ReservationVo();
		
	    if (bean.getId()!=null){
	    	reservationVo.setId(StringUtil.toString(bean.getId()));
        }
        if (bean.getTotalAPayer()+""!=null){
        	reservationVo.setTotalAPayer(StringUtil.toString(bean.getTotalAPayer()));
        }
       
        if (bean.getDateRes()!=null){
        	reservationVo.setDateRes(StringUtil.toString(bean.getDateRes()));
        }
        if (bean.isAnnule()+""!=null){
        	reservationVo.setAnnule(StringUtil.toString(bean.isAnnule()));
        }
       
        if (voyageur  && bean.getVoyageur()!=null){
        	reservationVo.setVoyageurVo(voyageurConverter.toVo(bean.getVoyageur()));
        }
        
        if (choix  && bean.getChoix()!=null){
        	reservationVo.setChoixVo(choixConverter.toVo(bean.getChoix()));
        }
        return reservationVo;
	}

	public boolean isVoyageur() {
		return voyageur;
	}

	public void setVoyageur(boolean voyageur) {
		this.voyageur = voyageur;
	}

	public boolean isChoix() {
		return choix;
	}

	public void setChoix(boolean choix) {
		this.choix = choix;
	}

	public ChoixConverter getChoixConverter() {
		return choixConverter;
	}

	public void setChoixConverter(ChoixConverter choixConverter) {
		this.choixConverter = choixConverter;
	}

	public VoyageurConverter getVoyageurConverter() {
		return voyageurConverter;
	}

	public void setVoyageurConverter(VoyageurConverter voyageurConverter) {
		this.voyageurConverter = voyageurConverter;
	}
	
}
