package com.voyageOrganise.provide.vo;

import java.util.List;



public class VoyageurVo {

	private String id;
	private String dateNaissance;
	private String nom;
	private String prenom;
	private UtilisateurVo UtilisateurVo;
    private List<ReservationVo> reservationsVo;
    private List<CommentaireVo> commentairesVo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
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
	public UtilisateurVo getUtilisateurVo() {
		return UtilisateurVo;
	}
	public void setUtilisateurVo(UtilisateurVo utilisateurVo) {
		UtilisateurVo = utilisateurVo;
	}
	public List<ReservationVo> getReservationsVo() {
		return reservationsVo;
	}
	public void setReservationsVo(List<ReservationVo> reservationsVo) {
		this.reservationsVo = reservationsVo;
	}
	public List<CommentaireVo> getCommentairesVo() {
		return commentairesVo;
	}
	public void setCommentairesVo(List<CommentaireVo> commentairesVo) {
		this.commentairesVo = commentairesVo;
	}
	public VoyageurVo() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}
