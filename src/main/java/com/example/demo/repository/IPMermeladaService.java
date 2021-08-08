package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.PMermelada;

public interface IPMermeladaService {
	public List<PMermelada> listar();
	public Optional<PMermelada> listarId(int id_PM);
	public int save(PMermelada mermelada);
	public void delete(int id_PM);

}
