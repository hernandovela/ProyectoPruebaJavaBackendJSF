package com.example.ProyectoPrueba.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consulta {
	@Id
	private String placa;
	private String empresa;
	private long Numero_Documento;
	private int cant;
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public long getNumero_Documento() {
		return Numero_Documento;
	}

	public void setNumero_Documento(int numero_Documento) {
		Numero_Documento = numero_Documento;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

}
