package com.example.beercatalog.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.beercatalog.applicationservices.Contracts.IBeerApplicationService;

@RestController
@RequestMapping("/api/v1")
public class BeerController {
	
	private IBeerApplicationService beerApplicationService;
	
	@Autowired
	public BeerController(IBeerApplicationService beerApplicationService) {
		this.beerApplicationService = beerApplicationService;
	}
	
	@PostMapping("/beer")
	@ResponseStatus(HttpStatus.CREATED)
	public void insertBeer(@RequestParam String name, @RequestParam String cityOfManufacture, @RequestParam Long brandId) {
		beerApplicationService.InsertNewBeer(name, cityOfManufacture, brandId);		
	}
}