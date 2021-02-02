package com.voyageOrganise.provide.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Commentaire;
import com.voyageOrganise.provide.vo.CommentaireVo;
import com.voyageOrganise.provide.vo.OffreVoyageVo;
import com.voyageOrganise.service.util.StringUtil;
@Component
public class CommentairesConverter extends AbstractConverter<Commentaire,CommentaireVo>{

	private boolean voyageur;
	private boolean offreVoyage;
	@Autowired
    private VoyageurConverter voyageurConverter;
	@Autowired
    private OffreVoyageConverter offreVoyageConverter;
	@Override
	public Commentaire toBean(CommentaireVo vo) {
		Commentaire commentaire = new Commentaire();
		if(StringUtil.isNotEmpty(vo.getLibelle())){
			 commentaire.setLibelle(vo.getLibelle());
	        }
		if(vo.getVoyageurVo()!=null && voyageur){
        	commentaire.setVoyageur(voyageurConverter.toBean(vo.getVoyageurVo()));
        }
		if(vo.getOffreVoyageVo()!=null && offreVoyage){
        	commentaire.setOffreVoyage(offreVoyageConverter.toBean(vo.getOffreVoyageVo()));
        }
		return commentaire;
	}

	@Override
	public CommentaireVo toVo(Commentaire commentaire) {
		CommentaireVo commentaireVo = new CommentaireVo();
		 if(commentaire.getLibelle()!=null){
	        	commentaireVo.setLibelle(commentaire.getLibelle());
		 }
		 if(commentaire.getVoyageur()!=null && voyageur){
			 commentaireVo.setVoyageurVo(voyageurConverter.toVo(commentaire.getVoyageur()));
	        }
		 if(commentaire.getOffreVoyage()!=null && offreVoyage){
			 commentaireVo.setOffreVoyageVo(offreVoyageConverter.toVo(commentaire.getOffreVoyage()));
	        }
		return commentaireVo;
	}

	public boolean isVoyageur() {
		return voyageur;
	}

	public void setVoyageur(boolean voyageur) {
		this.voyageur = voyageur;
	}

	public boolean isOffreVoyage() {
		return offreVoyage;
	}

	public void setOffreVoyage(boolean offreVoyage) {
		this.offreVoyage = offreVoyage;
	}

	public VoyageurConverter getVoyageurConverter() {
		return voyageurConverter;
	}

	public void setVoyageurConverter(VoyageurConverter voyageurConverter) {
		this.voyageurConverter = voyageurConverter;
	}

	public OffreVoyageConverter getOffreVoyageConverter() {
		return offreVoyageConverter;
	}

	public void setOffreVoyageConverter(OffreVoyageConverter offreVoyageConverter) {
		this.offreVoyageConverter = offreVoyageConverter;
	}

}
