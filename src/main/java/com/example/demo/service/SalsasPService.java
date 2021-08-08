package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ISalsasP;
import com.example.demo.model.SalsasP;
import com.example.demo.repository.ISalsasPService;


@Service
public class SalsasPService implements ISalsasPService {

	@Autowired
	private ISalsasP as;

	@Override
	public List<SalsasP> listar() {
				return (List<SalsasP>)as.findAll();
	}

	@Override
	public Optional<SalsasP> listarId(int idPS) {
				return as.findById(idPS);
	}

	@Override
	public int save(SalsasP salp) {
		int resp=0;
		SalsasP r=as.save(salp);
		if(!r.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int idPS) {
		as.deleteById(idPS);
		
	}

}

