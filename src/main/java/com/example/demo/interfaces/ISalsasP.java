package com.example.demo.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SalsasP;

@Repository
public interface ISalsasP extends CrudRepository<SalsasP,Integer> {

}
