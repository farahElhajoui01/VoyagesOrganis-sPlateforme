package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Extra implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	private double tarif;
	@ManyToOne
    private Choix choix;
	@ManyToOne
    private OffreVoyage offreVoyage;
	@ManyToOne
    private TypeExtra typeExtra;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public Choix getChoix() {
		return choix;
	}

	public void setChoix(Choix choix) {
		this.choix = choix;
	}

	public OffreVoyage getOffreVoyage() {
		return offreVoyage;
	}

	public void setOffreVoyage(OffreVoyage offreVoyage) {
		this.offreVoyage = offreVoyage;
	}

	public TypeExtra getTypeExtra() {
		return typeExtra;
	}

	public void setTypeExtra(TypeExtra typeExtra) {
		this.typeExtra = typeExtra;
	}

	
	public Extra(String libelle, double tarif, Choix choix, OffreVoyage offreVoyage, TypeExtra typeExtra) {
		super();
		this.libelle = libelle;
		this.tarif = tarif;
		this.choix = choix;
		this.offreVoyage = offreVoyage;
		this.typeExtra = typeExtra;
	}

	public Extra() {
		super();
	}
	
	
	
	
	
}

