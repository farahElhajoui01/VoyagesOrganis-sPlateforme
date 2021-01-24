package com.voyageOrganise.provide.vo;

import java.util.List;


public class TypeVoyageVo {
	
	private String id;
	private String libelle;
	private List<OffreVoyageVo> offreVoyagesVo;
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
	public List<OffreVoyageVo> getOffreVoyagesVo() {
		return offreVoyagesVo;
	}
	public void setOffreVoyagesVo(List<OffreVoyageVo> offreVoyagesVo) {
		this.offreVoyagesVo = offreVoyagesVo;
	}
	public TypeVoyageVo() {
		super();
		// TODO Auto-generated constructor stub
	}
 

}
