package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
		/*Compruebo que de ser variable numeroIntroducido menor que 0 la multiplica por -1
		 * imprimiendo por pantalla un mensaje con el valor absoluto del numero
		 * pruebo con -1
		 * FUNCIONA CORRECTAMENTE
		 * 
		 * Compruebo que de ser variable numeroIntroducido igual o mayor que 0 
		 * imprime por pantalla el numeroIntroducido lo cual sera igual al valor absoluto 
		 * pruebo con 0 y con 3 
		 * FUNCIONA CORRECTAMENTE*/

	public static void main(String[] args) {
		
		double numeroIntroducido;//Declaro la variable
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero por consola
		System.out.print("Introduzca un numero ");
		
		//Asigno a la variable numeroIntroducido un valor mediante uso del Scanner
		numeroIntroducido = dogma.nextDouble();
		
		//Uso operador ternario con condicion de: variable numeroIntroducido menor que 0
		System.out.print(numeroIntroducido<0 ? 
				
		//De cumplirse la condicion imprimo el mensaje mostrado a continuacion
		"El valor absoluto del numero introducido es: " +  numeroIntroducido*-1 :
			
		//De no cumplirse la condicion imprimo el mensaje mostrado a continuacion
		"El valor absoluto del numero introducido es: " + numeroIntroducido);
		
		//Cierro Scanner
		dogma.close();

	}

}
