package com.example.beercatalog.domain;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.beercatalog.businessobjects.Beer.BeerValueObject;
import com.example.beercatalog.businessobjects.Beer.Validation.BeerValidatorObject;
import com.example.beercatalog.data.mapping.Beer;
import com.example.beercatalog.data.repository.BeerRepository;
import com.example.beercatalog.domain.contracts.IBeerDomain;
import com.example.beercatalog.utils.extensions.IntegerExtensions;
import com.example.beercatalog.utils.extensions.StringExtensions;

@Service
public class BeerDomain implements IBeerDomain {
	
	@Autowired
	private BeerRepository beerRepository;
	
	public void CreateNewBeer(BeerValueObject beer) {
		Beer entity = new Beer();
		entity.setName(beer.getName());
		entity.setCityOfManufacture(beer.getCityOfManufacture());
		beerRepository.save(entity);
	}
	
	public List<BeerValidatorObject> validateBeer(BeerValueObject beer) {
		
		List<BeerValidatorObject> errors = new ArrayList<BeerValidatorObject>();
		
		if( StringExtensions.isNullOrEmpty(beer.getName())) {
			errors.add(new BeerValidatorObject("Field not informed", "name"));
		}
		
		if( StringExtensions.isNullOrEmpty(beer.getCityOfManufacture())) {
			errors.add(new BeerValidatorObject("Field not informed", "cityOfManufacture"));
		}
		
		if(IntegerExtensions.isNullOrZero(beer.getBrandId())) {
			errors.add(new BeerValidatorObject("Field not informed", "BrandId"));
		}		
		return errors;
	}
}
