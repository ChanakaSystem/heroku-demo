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
@Table(name="ACajas")
public class ACajas implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_RC;
	private String tam;
	private String color;
	private int cantidad;
	private Date fechaR = new Date();
	private String fechaC;
	
	
	public ACajas() {
		super();
	}


	public ACajas(int id_RC, String tam, String color, int cantidad, Date fechaR, String fechaC) {
		super();
		this.id_RC = id_RC;
		this.tam = tam;
		this.color = color;
		this.cantidad = cantidad;
		this.fechaR = fechaR;
		this.fechaC = fechaC;
	}


	public int getId_RC() {
		return id_RC;
	}


	public void setId_RC(int id_RC) {
		this.id_RC = id_RC;
	}


	public String getTam() {
		return tam;
	}


	public void setTam(String tam) {
		this.tam = tam;
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
	