package com.voyageOrganise.provide.vo;

import java.util.Date;





public class ReservationVo {

	private String id;
	private String TotalAPayer;
	private String dateRes;
	private String annule;
    private VoyageurVo voyageurVo;
    private ChoixVo choixVo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTotalAPayer() {
		return TotalAPayer;
	}
	public void setTotalAPayer(String totalAPayer) {
		TotalAPayer = totalAPayer;
	}
	public String getDateRes() {
		return dateRes;
	}
	public void setDateRes(String dateRes) {
		this.dateRes = dateRes;
	}
	public String getAnnule() {
		return annule;
	}
	public void setAnnule(String annule) {
		this.annule = annule;
	}
	public VoyageurVo getVoyageurVo() {
		return voyageurVo;
	}
	public void setVoyageurVo(VoyageurVo voyageurVo) {
		this.voyageurVo = voyageurVo;
	}
	public ChoixVo getChoixVo() {
		return choixVo;
	}
	public void setChoixVo(ChoixVo choixVo) {
		this.choixVo = choixVo;
	}
	public ReservationVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
