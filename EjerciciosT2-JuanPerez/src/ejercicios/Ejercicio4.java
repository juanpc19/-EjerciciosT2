package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*casos 1 a 15 nada (quizas poner este swtich al final) 
		 * dar valor a variable con primera cifra y segunda cifra usando % y/ 
		hacer switch para primera cifra y segunda cifra, comprobacion de rango del numero, */

		int numeroIntroducido;
		
		String numeroCadena;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero entre 1 y 99");
		
		numeroIntroducido = dogma.nextInt();
		
		switch (numeroIntroducido) {
			case 1->
				System.out.print("UNO");
			case 2->
				System.out.print("DOS");
			case 3->
				System.out.print("TRES");
			case 4->
				System.out.print("CUATRO");
			case 5->
				System.out.print("CINCO");
			case 6->
				System.out.print("SEIS");
			case 7->
				System.out.print("SIETE");
			case 8->
				System.out.print("OCHO");
			case 9->
				System.out.print("NUEVE");
			case 10->
				System.out.print("DIEZ");
			case 11->
				System.out.print("ONCE");
			case 12->
				System.out.print("DOCE");
			case 13->
				System.out.print("TRECE");
			case 14->
				System.out.print("CATORCE");
			case 15->
				System.out.print("QUINCE");
			
		}
		
		switch (numeroIntroducido) {
			case 16->
				System.out.print("UNO");
		
		

	}

}
