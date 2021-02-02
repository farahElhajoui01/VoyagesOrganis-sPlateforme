package com.voyageOrganise.provide.converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Ville;
import com.voyageOrganise.provide.vo.ParcourVo;
import com.voyageOrganise.provide.vo.PaysVo;
import com.voyageOrganise.provide.vo.VilleVo;
import com.voyageOrganise.service.util.ListUtil;
import com.voyageOrganise.service.util.StringUtil;

@Component
public class VilleConverter extends AbstractConverter<Ville,VilleVo>{


    @Autowired
    private PaysConverter paysConverter;

    @Autowired
    private DestinationsConverter destinationsConverter;
	
	
    private boolean pays;
    private boolean destinations;

	
	@Override
	public Ville toBean(VilleVo vo) {
		  
		Ville ville=new Ville();
	        
	        if (StringUtil.isNotEmpty(vo.getId())){
	            ville.setId(StringUtil.toLong(vo.getId()));
	        }
	        if (StringUtil.isNotEmpty(vo.getLibelle())){
		           ville.setLibelle(vo.getLibelle());
		     }
	        
	        if (destinations  && ListUtil.isNotEmpty(vo.getDestinationsVo())){
	            ville.setDestinations(destinationsConverter.toBean(vo.getDestinationsVo()));
	        }
	        
	        if(vo.getPaysVo()!=null && pays){
	            ville.setPays(paysConverter.toBean(vo.getPaysVo()));
	        }
	        
	        
	        return ville;
		
		
	}

	@Override
	public VilleVo toVo(Ville bean) {
		
		VilleVo villeVo=new VilleVo();
		
	       
	        if (bean.getId()!=null){
	        	villeVo.setId(StringUtil.toString(bean.getId()));
	        }
	        
	        if (StringUtil.isNotEmpty(bean.getLibelle())){
	        	villeVo.setLibelle(bean.getLibelle());
	        }
	        
	        if (destinations && ListUtil.isNotEmpty(bean.getDestinations())){
	        	villeVo.setDestinationsVo(destinationsConverter.toVo(bean.getDestinations()));
	        }
	        return villeVo;
	}

	
	public boolean isPays() {
		return pays;
	}

	public void setPays(boolean pays) {
		this.pays = pays;
	}

	public boolean isDestinations() {
		return destinations;
	}

	public void setDestinations(boolean destinations) {
		this.destinations = destinations;
	}
	
	

}
