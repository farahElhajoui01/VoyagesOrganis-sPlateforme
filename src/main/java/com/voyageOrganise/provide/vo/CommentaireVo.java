package com.voyageOrganise.provide.vo;





public class CommentaireVo {
	
	
	private String id;
	private String libelle;
    private VoyageurVo voyageurVo;
    private OffreVoyageVo offreVoyageVo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public VoyageurVo getVoyageurVo() {
		return voyageurVo;
	}
	public void setVoyageurVo(VoyageurVo voyageurVo) {
		this.voyageurVo = voyageurVo;
	}
	public OffreVoyageVo getOffreVoyageVo() {
		return offreVoyageVo;
	}
	public void setOffreVoyageVo(OffreVoyageVo offreVoyageVo) {
		this.offreVoyageVo = offreVoyageVo;
	}
	public CommentaireVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    

}
