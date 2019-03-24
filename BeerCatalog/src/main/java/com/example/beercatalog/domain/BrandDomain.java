package com.example.beercatalog.domain;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beercatalog.businessobjects.Brand.BrandValueObject;
import com.example.beercatalog.businessobjects.Brand.Validation.BrandValidatorObject;
import com.example.beercatalog.data.mapping.Brand;
import com.example.beercatalog.data.repository.BrandRepository;
import com.example.beercatalog.domain.contracts.IBrandDomain;
import com.example.beercatalog.utils.extensions.DateTimeExtensions;
import com.example.beercatalog.utils.extensions.StringExtensions;

@Service
public class BrandDomain implements IBrandDomain {

	@Autowired
	BrandRepository brandRepository;
	
	public void InsertNewBrand(BrandValueObject brand) throws ParseException {
		Brand entity = new Brand();
		entity.setName(brand.getName());
		entity.setDateOfFoundation(DateTimeExtensions.ToDate("yyyy-MM-dd", brand.getDateOfFoundation()));
		brandRepository.save(entity);
		
	}

	public List<BrandValidatorObject> validateBrand(BrandValueObject brand) {
		List<BrandValidatorObject> errors = new ArrayList<BrandValidatorObject>();
		
		if( StringExtensions.isNullOrEmpty(brand.getName())) {
			errors.add(new BrandValidatorObject("Field not informed", "name"));
		}
		
		if (DateTimeExtensions.isValidDate(brand.getDateOfFoundation())) {
			errors.add(new BrandValidatorObject("Field not informed", "dateOfFoundation"));
		}
		
		return errors;
	}
}
