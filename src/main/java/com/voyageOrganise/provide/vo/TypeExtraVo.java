package com.voyageOrganise.provide.vo;

import java.util.List;





public class TypeExtraVo {
	private String id;
	private String libelle;
	private String tarif;
    private List<ExtraVo> extrasVo;
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
	public String getTarif() {
		return tarif;
	}
	public void setTarif(String tarif) {
		this.tarif = tarif;
	}
	public List<ExtraVo> getExtrasVo() {
		return extrasVo;
	}
	public void setExtrasVo(List<ExtraVo> extrasVo) {
		this.extrasVo = extrasVo;
	}
	public TypeExtraVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
