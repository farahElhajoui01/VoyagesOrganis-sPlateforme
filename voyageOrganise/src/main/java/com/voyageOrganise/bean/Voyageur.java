package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Voyageur implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date dateNaissance;
	private String nom;
	private String prenom;
	@OneToOne
	private Utilisateur Utilisateur;
	@OneToMany(mappedBy = "voyageur")
    private List<Reservation> reservations;
	@OneToMany(mappedBy = "voyageur")
    private List<Commentaire> commentaires;
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}

