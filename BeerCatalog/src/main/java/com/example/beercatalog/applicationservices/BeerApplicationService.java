package com.example.beercatalog.applicationservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.beercatalog.applicationservices.Contracts.IBeerApplicationService;
import com.example.beercatalog.businessobjects.Beer.BeerValueObject;
import com.example.beercatalog.businessobjects.Beer.Validation.BeerValidatorObject;
import com.example.beercatalog.domain.BeerDomain;
import com.example.beercatalog.utils.extensions.ListExtensions;

@Service
public class BeerApplicationService implements IBeerApplicationService {

	@Autowired
	BeerDomain beerDomain;
	
	public void InsertNewBeer(String name, String cityOfManufacture, Long brandId) {
		BeerValueObject beer = new BeerValueObject();
		beer.setCityOfManufacture(cityOfManufacture);
		beer.setName(name);
		beer.setBrandId(brandId);
		List<BeerValidatorObject> validation = beerDomain.validateBeer(beer);
		if(!ListExtensions.any(validation)) {
			beerDomain.CreateNewBeer(beer);
		}
	}
}
