package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ACajas;


@Repository
public interface IACajas extends CrudRepository<ACajas, Integer> {

}
