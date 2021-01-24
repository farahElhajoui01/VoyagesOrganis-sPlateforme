package com.voyageOrganise.provide.vo;




public class UtilisateurVo {
	
	private String id;
	private String email;
	private String Mdp;
	private String tel;
	private String adresse;
	private AgenceVo agenceVo;
	private VoyageurVo voyageurVo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return Mdp;
	}
	public void setMdp(String mdp) {
		Mdp = mdp;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public AgenceVo getAgenceVo() {
		return agenceVo;
	}
	public void setAgenceVo(AgenceVo agenceVo) {
		this.agenceVo = agenceVo;
	}
	public VoyageurVo getVoyageurVo() {
		return voyageurVo;
	}
	public void setVoyageurVo(VoyageurVo voyageurVo) {
		this.voyageurVo = voyageurVo;
	}
	public UtilisateurVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
