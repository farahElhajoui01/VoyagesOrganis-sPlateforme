package com.voyageOrganise.provide.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.provide.vo.AgenceVo;
import com.voyageOrganise.service.util.ListUtil;
import com.voyageOrganise.service.util.StringUtil;
@Component
public class AgenceConverter extends AbstractConverter<Agence,AgenceVo>{
	private boolean offreVoyage;
	 @Autowired
	private OffreVoyageConverter offreVoyageConverter;
	@Override
	public Agence toBean(AgenceVo vo) {
		Agence agence = new Agence();
		 if(StringUtil.isNotEmpty(vo.getDescription())){
			 agence.setDescription(vo.getDescription());
	        }
		 if(StringUtil.isNotEmpty(vo.getRaisonSociale())){
			 agence.setRaisonSociale(vo.getRaisonSociale());
	        }
		 if(StringUtil.isNotEmpty(vo.getPhoto())){
			 agence.setPhoto(vo.getPhoto());
	        }
		 if(StringUtil.isNotEmpty(vo.getRating())){
	        	agence.setRating(StringUtil.toInteger(vo.getRating()));
	        }
		 if (ListUtil.isNotEmpty(vo.getOffreVoyagesVo() ) && offreVoyage){
			 agence.setOffreVoyages(offreVoyageConverter.toBean(vo.getOffreVoyagesVo()));
	        }
		return agence;
	}

	@Override
	public AgenceVo toVo(Agence agence) {
		AgenceVo agenceVo = new AgenceVo();
		if(agence.getDescription()!=null){
			agenceVo.setDescription(agence.getDescription());
        }
		if(agence.getRaisonSociale()!=null){
			agenceVo.setRaisonSociale(agence.getRaisonSociale());
        }
		if(agence.getPhoto()!=null){
			agenceVo.setPhoto(agence.getPhoto());
        }
		if(agence.getRating()+""!=null){
        	agenceVo.setRating(StringUtil.toString(agence.getRating()));
        }
		if (offreVoyage && ListUtil.isNotEmpty(agence.getOffreVoyages())){
        	agenceVo.setOffreVoyagesVo(offreVoyageConverter.toVo(agence.getOffreVoyages()));
        }
		return agenceVo;
	}

	public boolean isOffreVoyage() {
		return offreVoyage;
	}

	public void setOffreVoyage(boolean offreVoyage) {
		this.offreVoyage = offreVoyage;
	}

	public OffreVoyageConverter getOffreVoyageConverter() {
		return offreVoyageConverter;
	}

	public void setOffreVoyageConverter(OffreVoyageConverter offreVoyageConverter) {
		this.offreVoyageConverter = offreVoyageConverter;
	}

}
