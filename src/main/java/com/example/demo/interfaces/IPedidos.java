package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pedidos;



@Repository
public interface IPedidos extends CrudRepository<Pedidos, Integer>{

}
