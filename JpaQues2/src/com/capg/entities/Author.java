package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="author_data")
@NamedQuery(name="getBooks",query="select a from Author a")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class Author {
	
	@Id
	@Column(name="aid")
	private int id;
	@Column(name="aname",length=20)
	private String name;
	
	public Author(){
		
	}
	public Author(int id,String name){
		super();
		this.id=id;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Author id=" + id + ", name=" + name + "";
	}
	

}
