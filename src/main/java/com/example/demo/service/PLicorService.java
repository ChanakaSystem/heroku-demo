package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IPLicor;
import com.example.demo.repository.IPLicorService;
import com.example.demo.model.PLicor;



@Service
public class PLicorService implements IPLicorService {

	@Autowired
	private IPLicor il;

	@Override
	public List<PLicor> listar() {
		return (List<PLicor>)il.findAll();
	}

	@Override
	public Optional<PLicor> listarId(int id_PL) {
				return il.findById(id_PL);
	}

	@Override
	public int save(PLicor licor) {
		int resp=0;
		PLicor pl=il.save(licor);
		if(!pl.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int id_PL) {
		il.deleteById(id_PL);
		
	}

	}

