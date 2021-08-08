package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.ASalsas;

public interface IASalsasService {

	public List<ASalsas> listar();
	public Optional<ASalsas> listarId(int id_RS);
	public int save(ASalsas ASalsa);
	public void delete(int id_RS);
}
