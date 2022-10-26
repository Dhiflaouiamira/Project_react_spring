package com.tekup.AgenceImmobilier.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String status;
	private long Montant;
	private Date DateDebut;
	private Date DateFin;
	
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reservation(int id, String status, long montant, Date dateDebut, Date dateFin) {
		super();
		this.id = id;
		this.status = status;
		Montant = montant;
		DateDebut = dateDebut;
		DateFin = dateFin;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public long getMontant() {
		return Montant;
	}


	public void setMontant(long montant) {
		Montant = montant;
	}


	public Date getDateDebut() {
		return DateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}


	public Date getDateFin() {
		return DateFin;
	}


	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}


	@Override
	public String toString() {
		return "Reservation [id=" + id + ", status=" + status + ", Montant=" + Montant + ", DateDebut=" + DateDebut
				+ ", DateFin=" + DateFin + "]";
	}
	
	
	
	
}
