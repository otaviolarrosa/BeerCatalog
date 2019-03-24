package com.example.beercatalog.applicationservices.Contracts;

public interface IBeerApplicationService {
	void InsertNewBeer(String name, String cityOfManufacture, Long brandId);
}
