package com.example.beercatalog.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.beercatalog.data.mapping.Beer;

public interface BeerRepository extends CrudRepository<Beer, Long>{ }
