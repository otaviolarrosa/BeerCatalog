package com.example.beercatalog.businessobjects.Brand.Validation;

import com.example.beercatalog.businessobjects.Error;

public class BrandValidatorObject extends Error {
	public BrandValidatorObject() {
	}
	
	public BrandValidatorObject(String error, String field) {
		super.setError(error);
		super.setField(field);
	}
	
	public BrandValidatorObject(String error) {
		super.setError(error);
	}
	
}
