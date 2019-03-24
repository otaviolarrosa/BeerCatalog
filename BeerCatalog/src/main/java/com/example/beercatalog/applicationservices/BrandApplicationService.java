package com.example.beercatalog.applicationservices;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beercatalog.applicationservices.Contracts.IBrandApplicationService;
import com.example.beercatalog.businessobjects.Brand.BrandValueObject;
import com.example.beercatalog.businessobjects.Brand.Validation.BrandValidatorObject;
import com.example.beercatalog.domain.contracts.IBrandDomain;
import com.example.beercatalog.utils.extensions.ListExtensions;

@Service
public class BrandApplicationService implements IBrandApplicationService {

	@Autowired
	IBrandDomain brandDomain;
	
	public void insertNewBrand(String name, String dateOfFoundation) throws ParseException {
		BrandValueObject brand = new BrandValueObject();
		brand.setName(name);
		brand.setDateOfFoundation(dateOfFoundation);
		List<BrandValidatorObject> validator = new ArrayList<BrandValidatorObject>();
		validator = brandDomain.validateBrand(brand);
		if(!ListExtensions.any(validator)) {
			brandDomain.InsertNewBrand(brand);
		}
	}
}
