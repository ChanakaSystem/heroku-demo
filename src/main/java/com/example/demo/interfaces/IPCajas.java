package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PCajas;

@Repository
public interface IPCajas extends CrudRepository<PCajas, Integer>{

}
