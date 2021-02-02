package com.voyageOrganise.provide.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.TypeVoyage;
import com.voyageOrganise.provide.vo.TypeVoyageVo;
import com.voyageOrganise.service.util.ListUtil;
import com.voyageOrganise.service.util.StringUtil;
@Component
public class TypeVoyageConverter extends AbstractConverter<TypeVoyage,TypeVoyageVo>{

	private boolean offreVoyage;
	 @Autowired
	private OffreVoyageConverter offreVoyageConverter;
	@Override
	public TypeVoyage toBean(TypeVoyageVo vo) {
		TypeVoyage typeVoyage = new TypeVoyage();
		if(StringUtil.isNotEmpty(vo.getId())){
            typeVoyage.setId(StringUtil.toLong(vo.getId()));
        }
		 if(vo.getLibelle()!=null){
			 typeVoyage.setLibelle(typeVoyage.getLibelle());
	        }
		 if (ListUtil.isNotEmpty(vo.getOffreVoyagesVo() ) && offreVoyage){
			 typeVoyage.setOffreVoyages(offreVoyageConverter.toBean(vo.getOffreVoyagesVo()));
	        }
		return typeVoyage;
	}

	@Override
	public TypeVoyageVo toVo(TypeVoyage typeVoyage) {
		TypeVoyageVo typeVoyageVo = new TypeVoyageVo();
		 if(typeVoyage.getId()!=null){
			 typeVoyageVo.setId(StringUtil.toString(typeVoyage.getId()));
	        }
		if(typeVoyage.getLibelle()!=null){
			typeVoyageVo.setLibelle(typeVoyage.getLibelle());
        }
		 if (offreVoyage && ListUtil.isNotEmpty(typeVoyage.getOffreVoyages())){
	        	typeVoyageVo.setOffreVoyagesVo(offreVoyageConverter.toVo(typeVoyage.getOffreVoyages()));
	        }
		return typeVoyageVo;
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
