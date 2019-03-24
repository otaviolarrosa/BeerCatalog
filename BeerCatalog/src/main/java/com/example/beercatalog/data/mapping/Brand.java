package com.example.beercatalog.data.mapping;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Date dateOfFoundation;
	
	@OneToMany(mappedBy = "brand",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Beer> beers;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDateOfFoundation() {
		return dateOfFoundation;
	}
	
	public void setDateOfFoundation(Date dateOfFoundation) {
		this.dateOfFoundation = dateOfFoundation;
	} 
}
