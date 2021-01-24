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
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Ville implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	@ManyToOne
	private Pays pays;
	@OneToMany(mappedBy = "ville")
    private List<Parcour> destinations;
	
	
	
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

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	
	public Ville() {
		super();
	}

	public List<Parcour> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<Parcour> destinations) {
		this.destinations = destinations;
	}

	public Ville(String libelle, Pays pays) {
		super();
		this.libelle = libelle;
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Ville [id=" + id + ", libelle=" + libelle + ", pays=" + pays + ", destinations=" + destinations + "]";
	}
	
	
	
	
}

