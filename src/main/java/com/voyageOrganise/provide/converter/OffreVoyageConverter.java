package com.voyageOrganise.provide.converter;

import java.text.ParseException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.OffreVoyage;
import com.voyageOrganise.provide.vo.OffreVoyageVo;
import com.voyageOrganise.service.util.ListUtil;
import com.voyageOrganise.service.util.StringUtil;
import com.voyageOrganise.provide.converter.AgenceConverter;

@Component
public class OffreVoyageConverter extends AbstractConverter<OffreVoyage,OffreVoyageVo>{
 
	
	 private boolean agence;
	 private boolean typeVoyage;
	 private boolean choix;
	 private boolean commentaires;
	 private boolean destinations;
	 private boolean extras;
	
	 @Autowired
	    private ChoixConverter choixConverter;
	 @Autowired
	    private CommentairesConverter commentairesConverter;
	 @Autowired
	    private DestinationsConverter destinationsConverter;
	 @Autowired
	    private ExtrasConverter extrasConverter;
	 @Autowired
	    private TypeVoyageConverter typeVoyageConverter;
	 @Autowired
	    private AgenceConverter agenceConverter;

	@Override
	public OffreVoyage toBean(OffreVoyageVo vo) {
		OffreVoyage offreVoyage= new OffreVoyage();
		  if(StringUtil.isNotEmpty(vo.getId())){
	            offreVoyage.setId(StringUtil.toLong(vo.getId()));
	        }
	        if(StringUtil.isNotEmpty(vo.getDescription())){
	        	offreVoyage.setDescription(vo.getDescription());
	        }
	        if(StringUtil.isNotEmpty(vo.getProgramme())){
	        	offreVoyage.setProgramme(vo.getProgramme());
	        }
	        if(StringUtil.isNotEmpty(vo.getTitre())){
	        	offreVoyage.setTitre(vo.getTitre());
	        }
	        if(StringUtil.isNotEmpty(vo.getPhoto())){
	        	offreVoyage.setPhoto(vo.getPhoto());
	        }
	        if(StringUtil.isNotEmpty(vo.getRating())){
	        	offreVoyage.setRating(StringUtil.toInteger(vo.getRating()));
	        }
	        if(StringUtil.isNotEmpty(vo.getDateCreation())){
	            try {
					offreVoyage.setDateCreation(StringUtil.toDate(vo.getDateCreation()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        if(StringUtil.isNotEmpty(vo.getTarifBase())){
	            offreVoyage.setTarifBase(StringUtil.toDouble(vo.getTarifBase()));
	        }
	        if(vo.getAgenceVo()!=null && agence){
	        	offreVoyage.setAgence(agenceConverter.toBean(vo.getAgenceVo()));
	        }
	        if(vo.getTypeVoyageVo()!=null && typeVoyage){
	        	offreVoyage.setTypeVoyage(typeVoyageConverter.toBean(vo.getTypeVoyageVo()));
	        }
	        if (ListUtil.isNotEmpty(vo.getChoixVo() ) && choix){
	        	offreVoyage.setChoix(choixConverter.toBean(vo.getChoixVo()));
	        }
	        if (ListUtil.isNotEmpty(vo.getCommentairesVo() ) && commentaires){
	        	offreVoyage.setCommentaires(commentairesConverter.toBean(vo.getCommentairesVo()));
	        }
	        if (ListUtil.isNotEmpty(vo.getDestinationsVo() ) && destinations){
	        	offreVoyage.setDestinations(destinationsConverter.toBean(vo.getDestinationsVo()));
	        }
	        if (ListUtil.isNotEmpty(vo.getExtrasVo() ) && extras){
	        	offreVoyage.setExtras(extrasConverter.toBean(vo.getExtrasVo()));
	        }

	        return offreVoyage;
	}
	
	@Override
	public OffreVoyageVo toVo(OffreVoyage offreVoyage) {
		 OffreVoyageVo offreVoyageVo= new OffreVoyageVo();
		 if(offreVoyage.getId()!=null){
	        	offreVoyageVo.setId(StringUtil.toString(offreVoyage.getId()));
	        }
	        if(offreVoyage.getDescription()!=null){
	        	offreVoyageVo.setDescription(offreVoyage.getDescription());
	        }
	        if(offreVoyage.getProgramme()!=null){
	        	offreVoyageVo.setProgramme(offreVoyage.getProgramme());
	        }
	        if(offreVoyage.getTitre()!=null){
	        	offreVoyageVo.setTitre(offreVoyage.getTitre());
	        }
	        if(offreVoyage.getPhoto()!=null){
	        	offreVoyageVo.setPhoto(offreVoyage.getPhoto());
	        }
	        if(offreVoyage.getRating()+""!=null){
	        	offreVoyageVo.setRating(StringUtil.toString(offreVoyage.getRating()));
	        }
	        if(offreVoyage.getDateCreation()!=null){
	        	offreVoyageVo.setDateCreation(StringUtil.toString(offreVoyage.getDateCreation()));
	        }
	        if(offreVoyage.getTarifBase()!=null){
	        	offreVoyageVo.setTarifBase(StringUtil.toString(offreVoyage.getTarifBase()));
	        }
	        if(offreVoyage.getAgence()!=null && agence){
	        	offreVoyageVo.setAgenceVo(agenceConverter.toVo(offreVoyage.getAgence()));
	        }
	        if(offreVoyage.getTypeVoyage()!=null && typeVoyage){
	        	offreVoyageVo.setTypeVoyageVo(typeVoyageConverter.toVo(offreVoyage.getTypeVoyage()));
	        }
	        if (choix && ListUtil.isNotEmpty(offreVoyage.getChoix())){
	        	offreVoyageVo.setChoixVo(choixConverter.toVo(offreVoyage.getChoix()));
	        }
	        if (commentaires && ListUtil.isNotEmpty(offreVoyage.getCommentaires())){
	        	offreVoyageVo.setCommentairesVo(commentairesConverter.toVo(offreVoyage.getCommentaires()));
	        }
	        if (destinations && ListUtil.isNotEmpty(offreVoyage.getDestinations())){
	        	offreVoyageVo.setDestinationsVo(destinationsConverter.toVo(offreVoyage.getDestinations()));
	        }
	        if (extras && ListUtil.isNotEmpty(offreVoyage.getExtras())){
	        	offreVoyageVo.setExtrasVo(extrasConverter.toVo(offreVoyage.getExtras()));
	        }
	        
	        return offreVoyageVo;
	}

	public boolean isAgence() {
		return agence;
	}

	public void setAgence(boolean agence) {
		this.agence = agence;
	}


	public boolean isChoix() {
		return choix;
	}

	public void setChoix(boolean choix) {
		this.choix = choix;
	}

	public boolean isCommentaires() {
		return commentaires;
	}

	public void setCommentaires(boolean commentaires) {
		this.commentaires = commentaires;
	}

	public boolean isDestinations() {
		return destinations;
	}

	public void setDestinations(boolean destinations) {
		this.destinations = destinations;
	}

	public boolean isExtras() {
		return extras;
	}

	public void setExtras(boolean extras) {
		this.extras = extras;
	}

	public boolean isTypeVoyage() {
		return typeVoyage;
	}

	public void setTypeVoyage(boolean typeVoyage) {
		this.typeVoyage = typeVoyage;
	}

	public ChoixConverter getChoixConverter() {
		return choixConverter;
	}

	public void setChoixConverter(ChoixConverter choixConverter) {
		this.choixConverter = choixConverter;
	}

	public CommentairesConverter getCommentairesConverter() {
		return commentairesConverter;
	}

	public void setCommentairesConverter(CommentairesConverter commentairesConverter) {
		this.commentairesConverter = commentairesConverter;
	}

	public DestinationsConverter getDestinationsConverter() {
		return destinationsConverter;
	}

	public void setDestinationsConverter(DestinationsConverter destinationsConverter) {
		this.destinationsConverter = destinationsConverter;
	}

	public ExtrasConverter getExtrasConverter() {
		return extrasConverter;
	}

	public void setExtrasConverter(ExtrasConverter extrasConverter) {
		this.extrasConverter = extrasConverter;
	}

	public TypeVoyageConverter getTypeVoyageConverter() {
		return typeVoyageConverter;
	}

	public void setTypeVoyageConverter(TypeVoyageConverter typeVoyageConverter) {
		this.typeVoyageConverter = typeVoyageConverter;
	}

	public AgenceConverter getAgenceConverter() {
		return agenceConverter;
	}

	public void setAgenceConverter(AgenceConverter agenceConverter) {
		this.agenceConverter = agenceConverter;
	}

	

	
	
	
}
