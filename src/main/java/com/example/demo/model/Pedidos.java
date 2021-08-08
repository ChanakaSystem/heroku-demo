package com.example.demo.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Pedidos")
public class Pedidos implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Pedido;
	private String producto;
	private String tam;
	private String sabor;
	private String color;
	private int cantidad;
	private String cliente;
	private String tel;
	private String fechaP;
	private String fechaE;
	
	
	public Pedidos() {
		super();
	}


	public Pedidos(int id_Pedido, String producto, String tam, String sabor, String color, int cantidad, String cliente,
			String tel, String fechaP, String fechaE) {
		super();
		this.id_Pedido = id_Pedido;
		this.producto = producto;
		this.tam = tam;
		this.sabor = sabor;
		this.color = color;
		this.cantidad = cantidad;
		this.cliente = cliente;
		this.tel = tel;
		this.fechaP = fechaP;
		this.fechaE = fechaE;
	}


	public int getId_Pedido() {
		return id_Pedido;
	}


	public void setId_Pedido(int id_Pedido) {
		this.id_Pedido = id_Pedido;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public String getTam() {
		return tam;
	}


	public void setTam(String tam) {
		this.tam = tam;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getFechaP() {
		return fechaP;
	}


	public void setFechaP(String fechaP) {
		this.fechaP = fechaP;
	}


	public String getFechaE() {
		return fechaE;
	}


	public void setFechaE(String fechaE) {
		this.fechaE = fechaE;
	}


}