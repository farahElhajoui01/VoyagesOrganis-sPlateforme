package com.voyageOrganise.provide.vo;

import java.util.List;



public class VilleVo {
	
	private String id;
	private String libelle;
	private PaysVo paysVo;
    private List<ParcourVo> destinationsVo;
    
    
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
	public PaysVo getPaysVo() {
		return paysVo;
	}
	public void setPaysVo(PaysVo paysVo) {
		this.paysVo = paysVo;
	}
	public List<ParcourVo> getDestinationsVo() {
		return destinationsVo;
	}
	public void setDestinationsVo(List<ParcourVo> destinationsVo) {
		this.destinationsVo = destinationsVo;
	}
	public VilleVo() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
