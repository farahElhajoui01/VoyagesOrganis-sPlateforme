package com.voyageOrganise.provide.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Parcour;
import com.voyageOrganise.provide.vo.ParcourVo;
import com.voyageOrganise.service.util.StringUtil;
@Component
public class DestinationsConverter extends AbstractConverter<Parcour,ParcourVo>{
	  private boolean offreVoyage; 
	    private boolean ville;  

	    @Autowired
	    private OffreVoyageConverter offreVoyageConverter;
	    @Autowired
	    private VilleConverter villeConverter;
	    
		@Override
		public Parcour toBean(ParcourVo vo) {
	      
			Parcour parcour= new Parcour();
			
			    if(StringUtil.isNotEmpty(vo.getId())){
				  parcour.setId(StringUtil.toLong((vo.getId())));
		        }
		       
		        if(vo.getOffreVoyageVo()!=null && offreVoyage){
		            parcour.setOffreVoyage(offreVoyageConverter.toBean(vo.getOffreVoyageVo()));
		        }
		        
		        if(vo.getVilleVo()!=null && ville){
		            parcour.setVille(villeConverter.toBean(vo.getVilleVo()));
		        }
			
			return parcour;
		}
		@Override
		public ParcourVo toVo(Parcour bean) {
			ParcourVo parcourVo= new ParcourVo();
			
		    if(bean.getId()!= null){
			  parcourVo.setId(StringUtil.toString((bean.getId())));
	        }
	       
	        if(bean.getOffreVoyage()!=null && offreVoyage){
	            parcourVo.setOffreVoyageVo(offreVoyageConverter.toVo(bean.getOffreVoyage()));
	        }
	        
	        if(bean.getVille()!=null && ville){
	            parcourVo.setVilleVo(villeConverter.toVo(bean.getVille()));
	        }
		
		return parcourVo;
		}
		public boolean isOffreVoyage() {
			return offreVoyage;
		}
		public void setOffreVoyage(boolean offreVoyage) {
			this.offreVoyage = offreVoyage;
		}
		public boolean isVille() {
			return ville;
		}
		public void setVille(boolean ville) {
			this.ville = ville;
		}

		
	}


