package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.interfaces.IPedidos;
import com.example.demo.model.Pedidos;
import com.example.demo.repository.IPedidosService;

@Service
public class PedidosService implements IPedidosService {
	@Autowired
	private IPedidos pe;

	@Override
	public List<Pedidos> listar() {
		return (List<Pedidos>)pe.findAll();
	}

	@Override
	public Optional<Pedidos> listarId(int id_Pedido) {
				return pe.findById(id_Pedido);
	}

	@Override
	public int save(Pedidos Pedido) {
		int resp=0;
		Pedidos ped=pe.save(Pedido);
		if(!ped.equals(null))
			resp=1;
		return resp;
	}

	@Override
	public void delete(int id_Pedido) {
		pe.deleteById(id_Pedido);
		
	}

	}

