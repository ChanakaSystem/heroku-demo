package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.SalsasP;

public interface ISalsasPService {
	
	public List<SalsasP> listar();
	public Optional<SalsasP> listarId(int idPS);
	public int save(SalsasP salp);
	public void delete(int idPS);

}
