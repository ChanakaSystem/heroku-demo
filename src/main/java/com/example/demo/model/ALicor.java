package com.example.demo.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="ALicor")
public class ALicor implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_RL;
	private String sabor;
	private String tam;
	private int cantidad;
	private Date fechaR = new Date();
	private String fechaC;
	
	
	public ALicor() {
		super();
	}


	public ALicor(int id_RL, String sabor, String tam, int cantidad, Date fechaR, String fechaC) {
		super();
		this.id_RL = id_RL;
		this.sabor = sabor;
		this.tam = tam;
		this.cantidad = cantidad;
		this.fechaR = fechaR;
		this.fechaC = fechaC;
	}


	public int getId_RL() {
		return id_RL;
	}


	public void setId_RL(int id_RL) {
		this.id_RL = id_RL;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getTam() {
		return tam;
	}


	public void setTam(String tam) {
		this.tam = tam;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public Date getFechaR() {
		return fechaR;
	}


	public void setFechaR(Date fechaR) {
		this.fechaR = fechaR;
	}


	public String getFechaC() {
		return fechaC;
	}


	public void setFechaC(String fechaC) {
		this.fechaC = fechaC;
	}


}