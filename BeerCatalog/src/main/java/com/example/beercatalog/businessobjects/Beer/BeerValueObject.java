package com.example.beercatalog.businessobjects.Beer;

public class BeerValueObject {
	
	private String name;
	private String cityOfManufacture;
	private Long brandId;
	
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
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
}
