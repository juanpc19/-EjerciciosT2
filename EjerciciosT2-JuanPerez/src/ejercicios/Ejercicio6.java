package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int numeroRandom1, numeroRandom2;
		
		Scanner dogma = new Scanner(System.in);

		numeroRandom1 = (int) (Math.random()*100);
		
		numeroRandom2 = (int) (Math.random()*100);
		
		System.out.println("El primer numero aleatorio es: " + numeroRandom1);
		
		System.out.println("El segundo numero aleatorio es: " + numeroRandom2);
		
		System.out.print("La suma de ambos numeros es:" + numeroRandom2 + numeroRandom1);

		//indicar a usuario si correcto o incorrecto
	}

}
