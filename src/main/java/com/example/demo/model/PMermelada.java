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
@Table(name="PMermelada")
public class PMermelada implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_PM;
	private String sabor;
	private int c30g;
	private int c110g;
	private int c250g;
	private int c450g;
	
	public PMermelada() {
		super();
	}

	public PMermelada(int id_PM, String sabor, int c30g, int c110g, int c250g, int c450g) {
		super();
		this.id_PM = id_PM;
		this.sabor = sabor;
		this.c30g = c30g;
		this.c110g = c110g;
		this.c250g = c250g;
		this.c450g = c450g;
	}

	public int getId_PM() {
		return id_PM;
	}

	public void setId_PM(int id_PM) {
		this.id_PM = id_PM;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getC30g() {
		return c30g;
	}

	public void setC30g(int c30g) {
		this.c30g = c30g;
	}

	public int getC110g() {
		return c110g;
	}

	public void setC110g(int c110g) {
		this.c110g = c110g;
	}

	public int getC250g() {
		return c250g;
	}

	public void setC250g(int c250g) {
		this.c250g = c250g;
	}

	public int getC450g() {
		return c450g;
	}

	public void setC450g(int c450g) {
		this.c450g = c450g;
	}

}
