package com.voyageOrganise.provide.vo;

import java.util.List;



public class PaysVo {
	
	
	private String id;
	private String libelle;
	private List<VilleVo> villesVo;
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
	public List<VilleVo> getVillesVo() {
		return villesVo;
	}
	public void setVillesVo(List<VilleVo> villesVo) {
		this.villesVo = villesVo;
	}
	public PaysVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
