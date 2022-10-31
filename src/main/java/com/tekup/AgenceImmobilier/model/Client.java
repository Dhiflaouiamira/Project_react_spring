package com.tekup.AgenceImmobilier.model;

import javax.persistence.Entity;



import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;

import java.util.List;


@Entity
public class Client {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private int cin;
	private int passport;
    private String prenom ;
    private String nom ;
    private String email ;
    private String sexe ;
    private int tel ;

    
   
    public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Client(int id,int cin, int passport, String prenom, String nom, String email, String sexe, int tel) {
		super();
		this.id = id;
		this.cin = cin;
		this.passport = passport;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.sexe = sexe;
		this.tel = tel;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	
	public int getpassport() {
		return passport;
	}
	public void setpassport(int passport) {
		this.passport = passport;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	   

	@Override
	public String toString() {
		return "Client [id=" + id + ", cin=" + cin + ", passport=" + passport + ", prenom=" + prenom + ", nom=" + nom
				+ ", email=" + email + ", sexe=" + sexe + ", tel=" + tel + "]";
	}



	

    
	
	

}
