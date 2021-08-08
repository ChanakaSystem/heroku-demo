package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IALicor;
import com.example.demo.model.ALicor;
import com.example.demo.repository.IALicorService;

@Service
public class ALicorService implements IALicorService {
	
	@Autowired
	private IALicor lir;

	@Override
	public List<ALicor> listar() {
		return (List<ALicor>)lir.findAll();
	}

	@Override
	public Optional<ALicor> listarId(int id_RL) {
				return lir.findById(id_RL);
	}

	@Override
	public int save(ALicor ALicors) {
		int resp=0;
		ALicor als=lir.save(ALicors);
		if(!als.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int id_RL) {
		lir.deleteById(id_RL);
		
	}

	}