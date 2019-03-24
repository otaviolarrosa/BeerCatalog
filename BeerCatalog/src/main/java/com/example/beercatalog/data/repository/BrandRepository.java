package com.example.beercatalog.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.beercatalog.data.mapping.Brand;

public interface BrandRepository extends CrudRepository<Brand, Long>{ }
