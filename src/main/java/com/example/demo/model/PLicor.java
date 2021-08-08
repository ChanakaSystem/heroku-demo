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
@Table(name="PLicor")
public class PLicor implements Serializable {
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id_PL;
		private String sabor;
		private int preCB;
		private int preGB;
		
		
		public PLicor() {
			super();
		}


		public PLicor(int id_PL, String sabor, int preCB, int preGB) {
			super();
			this.id_PL = id_PL;
			this.sabor = sabor;
			this.preCB = preCB;
			this.preGB = preGB;
		}


		public int getId_PL() {
			return id_PL;
		}


		public void setId_PL(int id_PL) {
			this.id_PL = id_PL;
		}


		public String getSabor() {
			return sabor;
		}


		public void setSabor(String sabor) {
			this.sabor = sabor;
		}


		public int getPreCB() {
			return preCB;
		}


		public void setPreCB(int preCB) {
			this.preCB = preCB;
		}


		public int getPreGB() {
			return preGB;
		}


		public void setPreGB(int preGB) {
			this.preGB = preGB;
		}
		
}
