package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AMermeladas;


@Repository
public interface IAMermeladas extends CrudRepository<AMermeladas, Integer>{

}
