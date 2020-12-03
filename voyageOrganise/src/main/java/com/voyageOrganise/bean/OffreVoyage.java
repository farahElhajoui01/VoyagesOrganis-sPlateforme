package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class OffreVoyage implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	private String programme;
	@OneToMany(mappedBy = "offreVoyage")
    private List<Choix> choix;
	@ManyToOne
    private Agence agence;
	@ManyToOne
    private TypeVoyage typeVoyage;
	@OneToMany(mappedBy = "offreVoyage")
    private List<Commentaire> commentaires;
	@OneToMany(mappedBy = "offreVoyage")
    private List<Parcour> destinations;

	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}

