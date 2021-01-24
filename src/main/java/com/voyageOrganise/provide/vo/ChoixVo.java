package com.voyageOrganise.provide.vo;

import java.util.List;



public class ChoixVo {
	private String id;
	private String dateDebut;
	private String dateFin;
	private String tarifDeBase;
    private OffreVoyageVo offreVoyagevo;
    private List<ReservationVo> reservationsVo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public String getTarifDeBase() {
		return tarifDeBase;
	}
	public void setTarifDeBase(String tarifDeBase) {
		this.tarifDeBase = tarifDeBase;
	}
	public OffreVoyageVo getOffreVoyagevo() {
		return offreVoyagevo;
	}
	public void setOffreVoyagevo(OffreVoyageVo offreVoyagevo) {
		this.offreVoyagevo = offreVoyagevo;
	}
	public List<ReservationVo> getReservationsVo() {
		return reservationsVo;
	}
	public void setReservationsVo(List<ReservationVo> reservationsVo) {
		this.reservationsVo = reservationsVo;
	}
	public ChoixVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

    
}
