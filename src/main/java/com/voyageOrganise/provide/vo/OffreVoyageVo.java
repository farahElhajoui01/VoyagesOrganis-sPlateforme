package com.voyageOrganise.provide.vo;

import java.util.List;







public class OffreVoyageVo {
	
	private String id;
	private String description;
	private String programme;
	private String rating;
	private String dateCreation;
	private String tarifBase;
	private String titre;
	private String photo;
    private List<ChoixVo> choixVo;
    private AgenceVo agenceVo;
    private TypeVoyageVo typeVoyageVo;
    private List<CommentaireVo> commentairesVo;
    private List<ParcourVo> destinationsVo;
    private List<ExtraVo> extrasVo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getTarifBase() {
		return tarifBase;
	}
	public void setTarifBase(String tarifBase) {
		this.tarifBase = tarifBase;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<ChoixVo> getChoixVo() {
		return choixVo;
	}
	public void setChoixVo(List<ChoixVo> choixVo) {
		this.choixVo = choixVo;
	}
	public AgenceVo getAgenceVo() {
		return agenceVo;
	}
	public void setAgenceVo(AgenceVo agenceVo) {
		this.agenceVo = agenceVo;
	}
	public TypeVoyageVo getTypeVoyageVo() {
		return typeVoyageVo;
	}
	public void setTypeVoyageVo(TypeVoyageVo typeVoyageVo) {
		this.typeVoyageVo = typeVoyageVo;
	}
	public List<CommentaireVo> getCommentairesVo() {
		return commentairesVo;
	}
	public void setCommentairesVo(List<CommentaireVo> commentairesVo) {
		this.commentairesVo = commentairesVo;
	}
	public List<ParcourVo> getDestinationsVo() {
		return destinationsVo;
	}
	public void setDestinationsVo(List<ParcourVo> destinationsVo) {
		this.destinationsVo = destinationsVo;
	}
	public List<ExtraVo> getExtrasVo() {
		return extrasVo;
	}
	public void setExtrasVo(List<ExtraVo> extrasVo) {
		this.extrasVo = extrasVo;
	}
	public OffreVoyageVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    

}
