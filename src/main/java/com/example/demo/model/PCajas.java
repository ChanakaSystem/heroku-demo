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
@Table(name="PCajas")
public class PCajas implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_PC;
	private String tam;
	private int preb;
	private int d10;
	private int d20;
	private int d30;
	private int d40;
	
	public PCajas() {
		super();
	}

	public PCajas(int id_PC, String tam, int preb, int d10, int d20, int d30, int d40) {
		super();
		this.id_PC = id_PC;
		this.tam = tam;
		this.preb = preb;
		this.d10 = d10;
		this.d20 = d20;
		this.d30 = d30;
		this.d40 = d40;
	}

	public int getId_PC() {
		return id_PC;
	}

	public void setId_PC(int id_PC) {
		this.id_PC = id_PC;
	}

	public String getTam() {
		return tam;
	}

	public void setTam(String tam) {
		this.tam = tam;
	}

	public int getPreb() {
		return preb;
	}

	public void setPreb(int preb) {
		this.preb = preb;
	}

	public int getD10() {
		return d10;
	}

	public void setD10(int d10) {
		this.d10 = d10;
	}

	public int getD20() {
		return d20;
	}

	public void setD20(int d20) {
		this.d20 = d20;
	}

	public int getD30() {
		return d30;
	}

	public void setD30(int d30) {
		this.d30 = d30;
	}

	public int getD40() {
		return d40;
	}

	public void setD40(int d40) {
		this.d40 = d40;
	}

}