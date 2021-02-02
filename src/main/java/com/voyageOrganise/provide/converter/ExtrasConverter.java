package com.voyageOrganise.provide.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Extra;
import com.voyageOrganise.provide.vo.ExtraVo;
import com.voyageOrganise.service.util.StringUtil;
@Component
public class ExtrasConverter extends AbstractConverter<Extra,ExtraVo>{

	 private boolean offreVoyage; 
		private boolean choix; 
		private boolean typeExtra; 

	    @Autowired
	    private ChoixConverter choixConverter;
	    @Autowired
	    private OffreVoyageConverter offreVoyageConverter;
	    @Autowired
	    private TypeExtraConverter typeExtraConverter;
	    
		@Override
		public Extra toBean(ExtraVo vo) {
	       Extra extra=new Extra();
			
		    if (StringUtil.isNotEmpty(vo.getId())){
		    	extra.setId(StringUtil.toLong(vo.getId()));
	        }
		    if (StringUtil.isNotEmpty(vo.getLibelle())){
		    	extra.setLibelle(vo.getLibelle());
	        }
	        if (StringUtil.isNotEmpty(vo.getTarif())){
	        	extra.setTarif(StringUtil.toDouble(vo.getTarif()));
	        }
	       
	            
	        if (choix  && vo.getChoixVo()!=null){
	        	extra.setChoix(choixConverter.toBean(vo.getChoixVo()));
	        }
	        
	      
	        if (offreVoyage  && vo.getOffreVoyageVo()!=null){
	        	extra.setOffreVoyage(offreVoyageConverter.toBean(vo.getOffreVoyageVo()));
	        }
	        
	        if (typeExtra  && vo.getTypeExtraVo()!=null){
	        	extra.setTypeExtra(typeExtraConverter.toBean(vo.getTypeExtraVo()));
	        }
	        
	        return extra;
		}

		@Override
		public ExtraVo toVo(Extra bean) {
			
			 ExtraVo extraVo=new ExtraVo();
				
			    if (StringUtil.isNotEmpty(bean.getLibelle())){
				 extraVo.setLibelle(bean.getLibelle());
		        }
		        if (bean.getId()!=null){
		        	extraVo.setId(StringUtil.toString(bean.getId()));
		        }
		        
		        if (bean.getTarif()+""!=null){
		        	extraVo.setTarif(StringUtil.toString(bean.getTarif()));
		        }
		            
		        if (choix  && bean.getChoix()!=null){
		        	extraVo.setChoixVo(choixConverter.toVo(bean.getChoix()));
		        }
		        
		      
		        if (offreVoyage  && bean.getOffreVoyage()!=null){
		        	extraVo.setOffreVoyageVo(offreVoyageConverter.toVo(bean.getOffreVoyage()));
		        }
		        if (typeExtra  && bean.getTypeExtra()!=null){
		        	extraVo.setTypeExtraVo(typeExtraConverter.toVo(bean.getTypeExtra()));
		        }
		        
		        return extraVo;
		}

		public boolean isOffreVoyage() {
			return offreVoyage;
		}

		public void setOffreVoyage(boolean offreVoyage) {
			this.offreVoyage = offreVoyage;
		}

		public boolean isChoix() {
			return choix;
		}

		public void setChoix(boolean choix) {
			this.choix = choix;
		}

		public boolean isTypeExtra() {
			return typeExtra;
		}

		public void setTypeExtra(boolean typeExtra) {
			this.typeExtra = typeExtra;
		}
		
		

		
	}
