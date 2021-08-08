package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ASalsas;


@Repository
public interface IASalsas extends CrudRepository<ASalsas, Integer>{

}
