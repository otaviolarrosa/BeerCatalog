package com.example.beercatalog.applicationservices;

import com.example.beercatalog.businessobjects.Brand.Validation.BrandValidatorObject;

import java.util.List;

//TODO: Trabalhar com inicialização de propriedades via construtor
public class InsertBrandOutput {

    private String name;
    private String dateOfFoundation;

    List<BrandValidatorObject> errors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(String dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public List<BrandValidatorObject> getErrors() {
        return errors;
    }

    public void setErrors(List<BrandValidatorObject> errors) {
        this.errors = errors;
    }
}
