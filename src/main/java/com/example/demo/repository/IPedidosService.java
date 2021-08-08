package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Pedidos;


public interface IPedidosService {
	public List<Pedidos> listar();
	public Optional<Pedidos> listarId(int id_Pedido);
	public int save(Pedidos Pedido);
	public void delete(int id_Pedido);
}
