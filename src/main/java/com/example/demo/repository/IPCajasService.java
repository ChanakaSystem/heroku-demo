package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.PCajas;

public interface IPCajasService {
	public List<PCajas> listar();
	public Optional<PCajas> listarId(int id_PC);
	public int save(PCajas cajas);
	public void delete(int id_PC);
}
