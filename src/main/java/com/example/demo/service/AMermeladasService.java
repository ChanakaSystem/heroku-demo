package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IAMermeladas;
import com.example.demo.repository.IAMermeladasService;
import com.example.demo.model.AMermeladas;

@Service
public class AMermeladasService implements IAMermeladasService{

	@Autowired
	private IAMermeladas am;

	@Override
	public List<AMermeladas> listar() {
		return (List<AMermeladas>)am.findAll();
	}

	@Override
	public Optional<AMermeladas> listarId(int id_RM) {
				return am.findById(id_RM);
	}

	@Override
	public int save(AMermeladas AMermelada) {
		int resp=0;
		AMermeladas ams=am.save(AMermelada);
		if(!ams.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int id_RM) {
		am.deleteById(id_RM);
		
	}

	}


