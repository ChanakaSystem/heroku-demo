package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PLicor;


@Repository
public interface IPLicor extends CrudRepository<PLicor, Integer> {

}
