package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.ACajas;


public interface IACajasService {
	public List<ACajas> listar();
	public Optional<ACajas> listarId(int id_RC);
	public int save(ACajas ACaja);
	public void delete(int id_RC);
}
