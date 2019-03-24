package com.example.beercatalog.domain.contracts;

import java.text.ParseException;
import java.util.List;

import com.example.beercatalog.businessobjects.Brand.BrandValueObject;
import com.example.beercatalog.businessobjects.Brand.Validation.BrandValidatorObject;


public interface IBrandDomain {
	void InsertNewBrand(BrandValueObject brand) throws ParseException;
	List<BrandValidatorObject> validateBrand(BrandValueObject brand);
}
