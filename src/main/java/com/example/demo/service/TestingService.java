package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ITesting;
import com.example.demo.model.Testing;
import com.example.demo.repository.ITestingService;

@Service
public class TestingService implements ITestingService{
	
	@Autowired
	private ITesting ir;

	@Override
	public List<Testing> listar() {
		
		return (List<Testing>)ir.findAll();
	}

	@Override
	public Optional<Testing> listarId(int IdTesting) {
		
		return ir.findById(IdTesting);
	}

	@Override
	public int save(Testing testing) {
		int resp=0;
		Testing r=ir.save(testing);
		if(!r.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int IdTesting) {
		ir.deleteById(IdTesting);
		
	}

}
