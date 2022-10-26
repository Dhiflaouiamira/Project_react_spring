
package com.tekup.AgenceImmobilier.model;

import javax.persistence.Entity;


import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Reclamation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	private String Description;
	private String Etat;
	private String Type;
	
	
	@ManyToOne
	private Client client;


	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reclamation(long id, String description, String etat, String type) {
		super();
		this.id = id;
		Description = description;
		Etat = etat;
		Type = type;

	}

	

	public Client getreclamation() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getEtat() {
		return Etat;
	}


	public void setEtat(String etat) {
		Etat = etat;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", Description=" + Description + ", Etat=" + Etat + ", Type=" + Type + "]";
	}
	
	
}