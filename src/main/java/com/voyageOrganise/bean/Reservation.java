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

@Entity
public class Reservation implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double TotalAPayer;
	private Date dateRes;
	private boolean annule;
	@ManyToOne
    private Voyageur voyageur;
	@ManyToOne
    private Choix choix;
	
	
	
	public double getTotalAPayer() {
		return TotalAPayer;
	}

	public void setTotalAPayer(double totalAPayer) {
		TotalAPayer = totalAPayer;
	}

	public Date getDateRes() {
		return dateRes;
	}

	public void setDateRes(Date dateRes) {
		this.dateRes = dateRes;
	}

	public boolean isAnnule() {
		return annule;
	}

	public void setAnnule(boolean annule) {
		this.annule = annule;
	}

	public Voyageur getVoyageur() {
		return voyageur;
	}

	public void setVoyageur(Voyageur voyageur) {
		this.voyageur = voyageur;
	}

	public Choix getChoix() {
		return choix;
	}

	public void setChoix(Choix choix) {
		this.choix = choix;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}

