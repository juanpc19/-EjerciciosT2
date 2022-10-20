package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca los numeros de su DNI. ");

		numero1 = dogma.nextInt();
		numero1 = numero1%10;

		System.out.print(numero1);
	}

}
