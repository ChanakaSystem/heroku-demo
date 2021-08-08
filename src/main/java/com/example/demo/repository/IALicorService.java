package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.ALicor;



public interface IALicorService {
	public List<ALicor> listar();
	public Optional<ALicor> listarId(int id_RL);
	public int save(ALicor ALicors);
	public void delete(int id_RL);
}
