package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.Electrodomestico;
import com.cursoceat.model.Lavadora;

public class Controller {

static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Electrodomestico miElectrodomestico  = new Electrodomestico("Nevera", "Samsung",0.35);
Electrodomestico miElectrodomestico2 = new Electrodomestico("Horno", "LG", 2.2);

//OBJETO 1

System.out.println(miElectrodomestico.toString());
System.out.println("¿Cuántas horas ha consumido su "+ miElectrodomestico.getTipo() +"?");	
	int horas = entrada.nextInt();

System.out.printf("El consumo de Kw de su "+ miElectrodomestico.getTipo()+" ha sido: %.2f KW",miElectrodomestico.getConsumo(horas));

System.out.println("\nEl precio total a pagar es: "+ miElectrodomestico.getCosteConsumo(horas)+ " €");

//OBJETO 2

System.out.println(miElectrodomestico2.toString());
System.out.println("¿Cuántas horas ha consumido su "+ miElectrodomestico2.getTipo()+"?");	
      horas = entrada.nextInt();

System.out.printf("El consumo de Kw de su "+ miElectrodomestico2.getTipo()+" ha sido: %.2f KW" ,miElectrodomestico2.getConsumo(horas));

System.out.println("\nEl precio total a pagar es: "+ miElectrodomestico2.getCosteConsumo(horas)+ " €");

//OBJETO 3 DE SUBCLASE
Lavadora miLavadora = new Lavadora( "Delonghi",2.2 ,600 , false);

System.out.println(miLavadora.toString());

System.out.println("¿Cuántas horas ha consumido su Lavadora?");	
horas = entrada.nextInt();

System.out.printf("El consumo de Kw de su Lavadora ha sido: %.2f KW" ,miLavadora.getConsumo(horas));

System.out.println("\nEl precio total a pagar es: "+ miLavadora.getCosteConsumo(horas)+ " €");


	}

}
