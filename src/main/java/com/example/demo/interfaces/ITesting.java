package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Testing;

@Repository
public interface ITesting extends CrudRepository<Testing,Integer> {
	
	

}
