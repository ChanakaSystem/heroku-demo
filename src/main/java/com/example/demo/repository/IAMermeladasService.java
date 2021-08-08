package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.AMermeladas;

public interface IAMermeladasService {
	
	public List<AMermeladas> listar();
	public Optional<AMermeladas> listarId(int id_RM);
	public int save(AMermeladas AMermelada);
	public void delete(int id_RM);

}
