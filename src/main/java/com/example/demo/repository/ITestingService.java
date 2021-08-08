package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Testing;

public interface ITestingService {
	
	public List<Testing> listar();
	public Optional<Testing> listarId(int idTesting);
	public int save(Testing Testing);
	public void delete(int idTesting);

}
