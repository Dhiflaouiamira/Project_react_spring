package com.tekup.AgenceImmobilier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BienImmobilier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long Id;
	private long nom;
	private String nbPieces;
	private long localication;
	private long prix;
	private long photos;
	private long contact;
	private long description;
	private long type;
	
	public BienImmobilier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public BienImmobilier(long id, long nom, String nbPieces, long localication, long prix, long photos, long contact,
			long description, long type) {
		super();
		Id = id;
		this.nom = nom;
		this.nbPieces = nbPieces;
		this.localication = localication;
		this.prix = prix;
		this.photos = photos;
		this.contact = contact;
		this.description = description;
		this.type = type;
	}





	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public long getNom() {
		return nom;
	}
	public void setNom(long nom) {
		this.nom = nom;
	}
	public String getNbPieces() {
		return nbPieces;
	}
	public void setNbPieces(String nbPieces) {
		this.nbPieces = nbPieces;
	}
	public long getLocalication() {
		return localication;
	}
	public void setLocalication(long localication) {
		this.localication = localication;
	}
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public long getPhotos() {
		return photos;
	}
	public void setPhotos(long photos) {
		this.photos = photos;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public long getDescription() {
		return description;
	}
	public void setDescription(long description) {
		this.description = description;
	}
	public long getType() {
		return type;
	}
	public void setType(long type) {
		this.type = type;
	}





	@Override
	public String toString() {
		return "BienImmobilier [Id=" + Id + ", nom=" + nom + ", nbPieces=" + nbPieces + ", localication=" + localication
				+ ", prix=" + prix + ", photos=" + photos + ", contact=" + contact + ", description=" + description
				+ ", type=" + type + "]";
	}
	
	
	
	

}
