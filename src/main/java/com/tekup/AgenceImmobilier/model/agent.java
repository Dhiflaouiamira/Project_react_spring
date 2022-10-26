package com.tekup.AgenceImmobilier.model;
 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class agent {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
       private long Id;
	   private String username;
       private String passWord;
	   

       
	public agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public agent(long Id, String username, String passWord ,String ername) {
		super();
		this.Id = Id;
		this.username = username;
		this.passWord = passWord;
		

	}
	
	

	public long getId() {
		return Id;
	}
	public void setId(long Id) {
		this.Id = Id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "agent [Id=" + Id + ", username=" + username + ", passWord=" + passWord + "]";
	}
       
       
       
    
}

