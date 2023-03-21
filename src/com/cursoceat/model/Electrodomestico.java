package com.cursoceat.model;

public class Electrodomestico {

	protected String tipo;
	protected String marca;
	protected double potencia;
	

public Electrodomestico(String tipo, String marca, double potencia) {
		
		this.tipo = tipo;
		this.marca = marca;
		this.potencia = potencia;
}

public Electrodomestico() {
	
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public double getPotencia() {
	return potencia;
}

public void setPotencia(double potencia) {
	this.potencia = potencia;
}

@Override
public String toString() {
	return "Electrodoméstico [tipo:" + tipo + ", marca:" + marca + ", potencia:" + potencia + "KW]";
}

public double getConsumo(int horas) {

    double totalKW = this.potencia * horas;
	
	return totalKW; 
}

	
public double getCosteConsumo(int horas) {
	double precioKWh = 0.132;
	
	double precioTotal = precioKWh*horas;
	
	return precioTotal;
}
	
	
	
}
