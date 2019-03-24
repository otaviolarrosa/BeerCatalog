package com.example.beercatalog.data.mapping;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Beer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cityOfManufacture;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brand_id", referencedColumnName = "id", nullable = false)
	private Brand brand;
	
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
	public String getCityOfManufacture() {
		return cityOfManufacture;
	}
	public void setCityOfManufacture(String cityOfManufacture) {
		this.cityOfManufacture = cityOfManufacture;
	}
	
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
}
