package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IPMermelada;
import com.example.demo.model.PMermelada;
import com.example.demo.repository.IPMermeladaService;


@Service
public class PMermeladaService implements IPMermeladaService{
	
	@Autowired
	private IPMermelada im;

	@Override
	public List<PMermelada> listar() {
		return (List<PMermelada>)im.findAll();
	}

	@Override
	public Optional<PMermelada> listarId(int id_PM) {
				return im.findById(id_PM);
	}

	@Override
	public int save(PMermelada mermelada) {
		int resp=0;
		PMermelada pm=im.save(mermelada);
		if(!pm.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int id_PM) {
		im.deleteById(id_PM);
		
	}

}


