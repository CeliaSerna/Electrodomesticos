package com.cursoceat.model;

public class Lavadora extends Electrodomestico {

	protected double precio;
	protected boolean aguaCaliente;

public Lavadora( String marca, double potencia, double precio, boolean aguaCaliente) {
		super( marca, potencia);
		this.precio = precio;
		this.aguaCaliente = aguaCaliente;
		this.aguaCaliente = false;
	}


public Lavadora() {
	
}

public double getPrecio() {
	return precio;
}

public boolean isAguaCaliente() {
	return aguaCaliente;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public void setAguaCaliente(boolean aguaCaliente) {
	this.aguaCaliente = aguaCaliente;
}

@Override
public String getTipo() {
	
	return super.getTipo();
}

@Override
public void setTipo(String tipo) {

	super.setTipo(tipo);
}

@Override
public String getMarca() {

	return super.getMarca();
}

@Override
public void setMarca(String marca) {
	
	super.setMarca(marca);
}

@Override
public double getPotencia() {

	return super.getPotencia();
}

@Override
public void setPotencia(double potencia) {
	
	super.setPotencia(potencia);
}

@Override
public double getConsumo(int horas) {

	return super.getConsumo(horas);
}

@Override
public double getCosteConsumo(int horas) {

	return super.getCosteConsumo(horas);
}

@Override
public String toString() {

return super.toString()+ "Lavadora [precio:" + precio + "€, aguaCaliente:" + aguaCaliente  + "]";
}











	

	
	
	
	
	
	
}
