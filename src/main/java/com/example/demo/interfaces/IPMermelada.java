package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PMermelada;


@Repository
public interface IPMermelada extends CrudRepository<PMermelada, Integer>{

}
