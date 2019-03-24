package com.example.beercatalog.api;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.beercatalog.applicationservices.Contracts.IBrandApplicationService;

@RestController
@RequestMapping("/api/v1")
public class BrandController {
	
	@Autowired
	private IBrandApplicationService brandApplicationService;
	
	
	@PostMapping("/brand")
	@ResponseStatus(HttpStatus.CREATED)
	public void insertBrand(@RequestParam String name, @RequestParam String dateOfFoundation) throws ParseException{
		brandApplicationService.insertNewBrand(name, dateOfFoundation);
	}
}
