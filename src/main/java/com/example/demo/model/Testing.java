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
@Table(name="testing")
public class Testing implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTesting;
	private String modelo;
	private String procesador;
	private String ram;
	private String app;
    private java.util.Date fecha = new Date();
	private String hora_ev;
	private String temp_m;
	
	
	public Testing() {
		super();
	}


	public Testing(int idTesting, String modelo, String procesador, String ram, String app, java.util.Date fecha,
			String hora_ev, String temp_m) {
		super();
		this.idTesting = idTesting;
		this.modelo = modelo;
		this.procesador = procesador;
		this.ram = ram;
		this.app = app;
		this.fecha = fecha;
		this.hora_ev = hora_ev;
		this.temp_m = temp_m;
	}


	public int getIdTesting() {
		return idTesting;
	}


	public void setIdTesting(int idTesting) {
		this.idTesting = idTesting;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getApp() {
		return app;
	}


	public void setApp(String app) {
		this.app = app;
	}


	public java.util.Date getFecha() {
		return fecha;
	}


	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}


	public String getHora_ev() {
		return hora_ev;
	}


	public void setHora_ev(String hora_ev) {
		this.hora_ev = hora_ev;
	}


	public String getTemp_m() {
		return temp_m;
	}


	public void setTemp_m(String temp_m) {
		this.temp_m = temp_m;
	}
	
	
	
	

}
