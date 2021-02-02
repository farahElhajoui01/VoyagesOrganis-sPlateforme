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
	
	
	
	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Utilisateur getUtilisateur() {
		return Utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		Utilisateur = utilisateur;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}

