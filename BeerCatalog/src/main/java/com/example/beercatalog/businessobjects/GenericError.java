package com.example.beercatalog.businessobjects;

import java.util.List;

public abstract class GenericError{
	List<Error> errors;
	
	public void AddError(Error error) {
		this.errors.add(error);
	}
}