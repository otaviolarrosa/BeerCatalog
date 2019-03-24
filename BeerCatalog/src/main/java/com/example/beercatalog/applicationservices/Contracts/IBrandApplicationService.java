package com.example.beercatalog.applicationservices.Contracts;

import java.text.ParseException;

public interface IBrandApplicationService {
	
	void insertNewBrand(String name, String dateOfFoundation) throws ParseException;
	
}
