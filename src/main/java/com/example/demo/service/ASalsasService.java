package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.interfaces.IASalsas;
import com.example.demo.model.ASalsas;
import com.example.demo.repository.IASalsasService;



@Service
public class ASalsasService implements IASalsasService{
	
	@Autowired
	private IASalsas as;

	@Override
	public List<ASalsas> listar() {
		return (List<ASalsas>)as.findAll();
	}

	@Override
	public Optional<ASalsas> listarId(int id_RS) {
				return as.findById(id_RS);
	}

	@Override
	public int save(ASalsas ASalsa) {
		int resp=0;
		ASalsas nsa=as.save(ASalsa);
		if(!nsa.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int id_RS) {
		as.deleteById(id_RS);
		
	}

	}

