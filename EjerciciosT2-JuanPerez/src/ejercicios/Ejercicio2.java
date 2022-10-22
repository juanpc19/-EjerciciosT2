package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
		/*Comprobar que variable "numerosDni" proporcionada por usuario mediante Scanner esta 
		 * en el rango solicitado (es decir 8 digitos) [10000000,99999999] en cuyo caso el programa se ejecutara con normalidad
		 * y que de no estarlo un mensaje de error aparece en pantalla
		 * 
		 *Comprobar que el switch funciona introduciendo un numero de 8 digitos,
		 *Comprobar uno a uno que cada case imprime por pantalla el mensaje con la letra correspondiente a su numero */
	
	public static void main(String[] args) {

		int numerosDni, numeroEquivalente;//Declaro las variables
		
		//Creo el Scanner, lo nombro dogma y lo importo 
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario los numeros de su DNI por consola
		System.out.print("Introduzca los numeros de su DNI. ");
		
		//Asigno valor a variable numerosDni mediante uso del Scanner
		numerosDni = dogma.nextInt();
	
		//Establezco que de cumplirse una de las dos condiciones siguientes se imprima el siguiente mensaje por pantalla
		if ((numerosDni<10000000) || (numerosDni>99999999)) {
			System.out.print("Error, el numero introducido no es de 8 digitos");
			
		//Establezco que de no cumplirse ninguna de las dos condiciones anteriores el programa se siga ejecutando con normalidad
		} else {
		
		//Le doy a variable numeroEquivalente valor igual al modulo (resto) de numerosDni dividido entre 23
		numeroEquivalente = numerosDni%23;
		
		/*Le doy al switch la variable a comprobar (numeroEquivalente) y segun el valor de la variable
		ejecutara el contenido del case correspondiente (imprimiendo por pantalla la letra correspondiente)*/
		switch (numeroEquivalente) {
		
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
		}	
		
		//Cierro el Scanner
		dogma.close();

	}

}
