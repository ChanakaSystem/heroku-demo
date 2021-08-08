package com.example.demo.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ALicor;


@Repository
public interface IALicor extends CrudRepository<ALicor, Integer>{

}
