package com.voyageOrganise.provide.vo;

import java.util.List;



public class AgenceVo {
	
	
	private String id;
	private String raisonSociale;
	private String description;
	private String photo;
	private String rating;
    private List<OffreVoyageVo> offreVoyagesVo;
	private UtilisateurVo utilisateurVo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public List<OffreVoyageVo> getOffreVoyagesVo() {
		return offreVoyagesVo;
	}
	public void setOffreVoyagesVo(List<OffreVoyageVo> offreVoyagesVo) {
		this.offreVoyagesVo = offreVoyagesVo;
	}
	public UtilisateurVo getUtilisateurVo() {
		return utilisateurVo;
	}
	public void setUtilisateurVo(UtilisateurVo utilisateurVo) {
		this.utilisateurVo = utilisateurVo;
	}
	public AgenceVo() {
		super();
	}
	
	
	
	
	
 	
}
