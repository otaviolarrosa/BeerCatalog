package com.example.beercatalog.businessobjects.Beer.Validation;

import com.example.beercatalog.businessobjects.Error;

public class BeerValidatorObject extends Error{
	
	public BeerValidatorObject() {
		
	}
	
	public BeerValidatorObject(String error, String field) {
		super.setError(error);
		super.setField(field);
	}
	
	public BeerValidatorObject(String error) {
		super.setError(error);
	}
}


