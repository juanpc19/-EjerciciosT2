package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numerosDni, numeroEquiv;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca los numeros de su DNI. ");
		
		numerosDni = dogma.nextInt();
	
		if ((numerosDni<10000000) || (numerosDni>99999999)) {
			System.out.print("Error, el numero introducido no es de 8 digitos");
		} 
		
		numeroEquiv = numerosDni%23;
		
		switch (numeroEquiv) {
		
			case 0 ->
			System.out.print("T");
		
			case 1 ->
			System.out.print("R");
			
			case 2 ->
			System.out.print("W");
			
			case 3 ->
			System.out.print("A");
			
			case 4 ->
			System.out.print("G");
			
			case 5 ->
			System.out.print("M");
			
			case 6 ->
			System.out.print("Y");
			
			case 7 ->
			System.out.print("F");
			
			case 8 ->
			System.out.print("P");
			
			case 9 ->
			System.out.print("D");
		
			case 10 ->
			System.out.print("X");
			
			case 11 ->
			System.out.print("B");
			
			case 12 ->
			System.out.print("N");
			
			case 13 ->
			System.out.print("J");
			
			case 14 ->
			System.out.print("Z");
			
			case 15 ->
			System.out.print("S");
			
			case 16 ->
			System.out.print("Q");
			
			case 17 ->
			System.out.print("V");
			
			case 18 ->
			System.out.print("H");
			
			case 19 ->
			System.out.print("L");
			
			case 20 ->
			System.out.print("C");
			
			case 21 ->
			System.out.print("K");
			
			case 22 ->
			System.out.print("E");
			
		}	
		
		dogma.close();

	}

}
