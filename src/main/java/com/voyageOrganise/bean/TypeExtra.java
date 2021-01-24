package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class TypeExtra implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	private double tarif;
	@OneToMany(mappedBy = "typeExtra")
    private List<Extra> extras;
	
	
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

	public List<Extra> getExtras() {
		return extras;
	}

	public void setExtras(List<Extra> extras) {
		this.extras = extras;
	}

	public TypeExtra(String libelle, double tarif) {
		super();
		this.libelle = libelle;
		this.tarif = tarif;
	}

	public TypeExtra() {
		super();
	}

	@Override
	public String toString() {
		return "TypeExtra [id=" + id + ", libelle=" + libelle + ", tarif=" + tarif + ", extras=" + extras + "]";
	}
	
	
	
	
}

