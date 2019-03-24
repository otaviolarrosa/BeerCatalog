package com.example.beercatalog.domain.contracts;

import java.util.List;
import com.example.beercatalog.businessobjects.Beer.BeerValueObject;
import com.example.beercatalog.businessobjects.Beer.Validation.BeerValidatorObject;

public interface IBeerDomain {
	void CreateNewBeer(BeerValueObject beer);
	List<BeerValidatorObject> validateBeer(BeerValueObject beer);
}
