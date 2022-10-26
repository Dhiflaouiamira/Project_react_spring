package com.tekup.AgenceImmobilier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Annonces {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private String type ;
	private String Description;
	
	public Annonces() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Annonces(int id, String type,String Description) {
		super();
		this.id = id;
		this.type = type;
		this.Description = Description;
	}



	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Annonces [id=" + id + ", type=" + type + "]";
	}

	
	
	
	
	
	
}
