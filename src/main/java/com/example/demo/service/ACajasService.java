package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IACajas;
import com.example.demo.model.ACajas;
import com.example.demo.repository.IACajasService;



@Service
public class ACajasService implements IACajasService {
	@Autowired
	private IACajas ac;

	@Override
	public List<ACajas> listar() {
		return (List<ACajas>)ac.findAll();
	}

	@Override
	public Optional<ACajas> listarId(int id_RC) {
				return ac.findById(id_RC);
	}

	@Override
	public int save(ACajas ACaja) {
		int resp=0;
		ACajas acs=ac.save(ACaja);
		if(!acs.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int id_RC) {
		ac.deleteById(id_RC);
		
	}

	}



