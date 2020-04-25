package com.capg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	private int authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private long phoneNo;
	
	public Author(){
		
	}
	public Author(int authorId,String firstName,String middleName,String lastName, long phoneNo){
		this.setAuthorId(authorId);
		this.setFirstName(firstName);
		this.setMiddleName(middleName);
		this.setLastName(lastName);
		this.setPhoneNo(phoneNo);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String toString(){
		return "Id :"+authorId+" Name :"+firstName+" "+middleName+" "+lastName+" Phone No. :"+phoneNo;
	}
}
