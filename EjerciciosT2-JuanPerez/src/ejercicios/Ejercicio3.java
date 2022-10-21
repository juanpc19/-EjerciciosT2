package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double comidaComprada, numeroAnimales, comidaTodos;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Cuanta comida ha comprado? ");

		comidaComprada = dogma.nextDouble();
		
		System.out.print("Cuantos animales ha de alimentar? ");
		
		numeroAnimales = dogma.nextDouble();
		
		System.out.print("Cuanta comida comen todos los animales en total? ");

		comidaTodos = dogma.nextDouble();
		
		if (numeroAnimales==0) {
			System.out.print("El numero de animales que necesitan comida es 0, "
			+ "indique correctamente la cantidad de animales que necesitan comida");
			
		} else if ((comidaComprada-comidaTodos)>=1) {
			System.out.print("Se dispone de comida suficiente para cada animal");
			
		} else {
			System.out.print("No se dispone de comida suficiente para cada animal,"
			+ " a cada animal le corresponde un racion equivalente a: " +
			(comidaComprada/numeroAnimales) + "kilos");
		}
		
		dogma.close();
	}

}
