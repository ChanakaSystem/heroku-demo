package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IPCajas;
import com.example.demo.model.PCajas;
import com.example.demo.repository.IPCajasService;

@Service
public class PCajasService implements IPCajasService {

	@Autowired
	private IPCajas ic;

	@Override
	public List<PCajas> listar() {
		return (List<PCajas>)ic.findAll();
	}

	@Override
	public Optional<PCajas> listarId(int id_PC) {
				return ic.findById(id_PC);
	}

	@Override
	public int save(PCajas cajas) {
		int resp=0;
		PCajas pc=ic.save(cajas);
		if(!pc.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int id_PC) {
		ic.deleteById(id_PC);
		
	}
}
