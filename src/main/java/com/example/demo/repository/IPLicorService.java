package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.PLicor;

public interface IPLicorService {
	public List<PLicor> listar();
	public Optional<PLicor> listarId(int id_PL);
	public int save(PLicor licor);
	public void delete(int id_PL);

}

