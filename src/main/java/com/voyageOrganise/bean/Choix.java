package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Choix implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date dateDebut;
	private Date dateFin;
	private double tarifDeBase;
	@ManyToOne
    private OffreVoyage offreVoyage;
	@OneToMany(mappedBy = "choix")
    private List<Reservation> reservations;
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public double getTarifDeBase() {
		return tarifDeBase;
	}

	public void setTarifDeBase(double tarifDeBase) {
		this.tarifDeBase = tarifDeBase;
	}

	public OffreVoyage getOffreVoyage() {
		return offreVoyage;
	}

	public void setOffreVoyage(OffreVoyage offreVoyage) {
		this.offreVoyage = offreVoyage;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Choix(Date dateDebut, Date dateFin, double tarifDeBase, OffreVoyage offreVoyage) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tarifDeBase = tarifDeBase;
		this.offreVoyage = offreVoyage;
	}

	public Choix() {
		super();
	}
	
	
	
	
}

