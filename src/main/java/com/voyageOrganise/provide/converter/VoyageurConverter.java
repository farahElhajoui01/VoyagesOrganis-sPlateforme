package com.voyageOrganise.provide.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Agence;
import com.voyageOrganise.bean.Voyageur;
import com.voyageOrganise.provide.vo.AgenceVo;
import com.voyageOrganise.provide.vo.VoyageurVo;
import com.voyageOrganise.service.util.ListUtil;
import com.voyageOrganise.service.util.StringUtil;
@Component
public class VoyageurConverter extends AbstractConverter<Voyageur,VoyageurVo>{

	private boolean commentaires; 
	private boolean reservations; 
	private boolean utilisateur; 


    @Autowired
    private CommentairesConverter commentaireConverter;
    @Autowired
    private ReservationConverter reservationConverter;
    @Autowired
    private UtilisateurConverter utilisateurConverter;
	
	
	@Override
	public Voyageur toBean(VoyageurVo vo) {
		
		Voyageur voyageur=new Voyageur();
		
      
        if (StringUtil.isNotEmpty(vo.getId())){
        	voyageur.setId(StringUtil.toLong(vo.getId()));
        }
        
        if (StringUtil.isNotEmpty(vo.getNom())){
        	voyageur.setNom(vo.getNom());
        }
        if (StringUtil.isNotEmpty(vo.getPrenom())){
        	voyageur.setPrenom(vo.getPrenom());
        }
        
        if (commentaires  && ListUtil.isNotEmpty(vo.getCommentairesVo())){
        	voyageur.setCommentaires(commentaireConverter.toBean(vo.getCommentairesVo()));
        }
        if (reservations  && ListUtil.isNotEmpty(vo.getReservationsVo())){
        	voyageur.setReservations(reservationConverter.toBean(vo.getReservationsVo()));
        }
        if (utilisateur  && vo.getUtilisateurVo()!=null){
        	voyageur.setUtilisateur(utilisateurConverter.toBean(vo.getUtilisateurVo()));
        }
        return voyageur;
	}

	@Override
	public VoyageurVo toVo(Voyageur bean) {
       
		VoyageurVo voyageurVo=new VoyageurVo();
		
        
        if (bean.getId()!=null){
        	voyageurVo.setId(StringUtil.toString(bean.getId()));
        }
        
        if (StringUtil.isNotEmpty(bean.getNom())){
        	voyageurVo.setNom(bean.getNom());
        }
        if (StringUtil.isNotEmpty(bean.getPrenom())){
        	voyageurVo.setPrenom(bean.getPrenom());
        }
        
        if (commentaires  && ListUtil.isNotEmpty(bean.getCommentaires())){
        	voyageurVo.setCommentairesVo(commentaireConverter.toVo(bean.getCommentaires()));
        }
        if (reservations  && ListUtil.isNotEmpty(bean.getReservations())){
        	voyageurVo.setReservationsVo(reservationConverter.toVo(bean.getReservations()));
        }
        if (utilisateur  && bean.getUtilisateur()!=null){
        	voyageurVo.setUtilisateurVo(utilisateurConverter.toVo(bean.getUtilisateur()));
        }
        return voyageurVo;
	}

	

}
