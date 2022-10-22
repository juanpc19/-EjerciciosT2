package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
		/* Comprobar que variable "numeroIntroducido" proporcionada por usuario mediante Scanner esta en el rango solicitado [0,9999]
		 * y que de no estarlo un mensaje de error aparece en pantalla
		 * 
		 * Comprobar que al introducir un numero comprendido en el intervalo [0,9] el numero es capicua 
		 * 
		 * Comprobar que al introducir un numero comprendido en el intervalo [10,99] 
		 * cuya decena sea igual a su unidad, el numero es capicua 
		 * 
		 * Comprobar que al introducir un numero comprendido en el intervalo [100,999] 
		 * cuya centena sea igual a su unidad, el numero es capicua 
		 * 
		 * Comprobar que al introducir un numero comprendido en el intervalo [1000,9999] 
		 * cuya centena sea igual a su decena y su unidad sea igual a su millar, el numero es capicua
		 * 
		 * Comprobar que variable "numeroIntroducido" proporcionada por usuario mediante Scanner esta en el rango solicitado [0,9999]
		 * pero no cumple ningun conjunto de condiciones (if), en cuyo caso el mensaje debe decir que no es capicua*/
	
	public static void main(String[] args) {

		int numeroIntroducido, unidad, decena, centena, millar; //Declaro las variables
		
		//Creo el Scanner, lo nombro dogma y lo importo 
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario un numero por consola comprendido en el intervalo [0,9999]
		System.out.print("Introduzca un numero entero entre 0 y 9999 ");
		
		//Asigno valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Asigno valor a variable unidad con modulo 10
		unidad=numeroIntroducido%10;
		
		//Divido numeroIntroducido entre 10 y luego uso modulo 10 para dar un valor a variable decena 
		decena=(numeroIntroducido/10)%10;

		//Divido numeroIntroducido entre 100 y luego uso modulo 10 para dar un valor a variable centena 
		centena=(numeroIntroducido/100)%10;
		
		//Divido numeroIntroducido entre 1000 para dar valor a variable millar
		millar=numeroIntroducido/1000;
		
		//Establezco que de cumplirse una de las dos condiciones siguientes se imprima el siguiente mensaje por pantalla
		if ((numeroIntroducido<0) || (numeroIntroducido>9999)) {
			System.out.print("Numero erroneo, introduzca un numero entre 0 y 9999");
			
		/*Establezco que de no cumplirse las condiciones anteriores se comprueben las siguientes y
		de cumplirse todas las condiciones establecidas a continuacion se imprima el siguiente mensaje por pantalla*/
			} else if ((numeroIntroducido>=0) && (numeroIntroducido<=9)) {
				System.out.print("El numero introducido es capicua");
				
		/*Establezco que de no cumplirse las condiciones anteriores se comprueben las siguientes y
		de cumplirse todas las condiciones establecidas a continuacion se imprima el siguiente mensaje por pantalla*/		
			} else if ((numeroIntroducido>=10) && (numeroIntroducido<=99) && (unidad==decena)) {
				System.out.print("El numero introducido es capicua");	
				
		/*Establezco que de no cumplirse las condiciones anteriores se comprueben las siguientes y
		de cumplirse todas las condiciones establecidas a continuacion se imprima el siguiente mensaje por pantalla*/
			} else if ((numeroIntroducido>=100) && (numeroIntroducido<=999) && (unidad==centena)) {
				System.out.print("El numero introducido es capicua");
				
		/*Establezco que de no cumplirse las condiciones anteriores se comprueben las siguientes y
		de cumplirse todas las condiciones establecidas a continuacion se imprima el siguiente mensaje por pantalla*/	
			} else if ((numeroIntroducido>=1000) && (numeroIntroducido<=9999)
				&& (unidad==millar) && (decena==centena)) {
				System.out.print("El numero introducido es capicua");
				
		//Establezco que de no cumplirse ningun conjunto de condiciones anteriores se imprima el siguiente mensaje por pantalla	
			} else {
				System.out.print("El numero introducido no es capicua");	
				}
		
		//Cierro el Scanner
		dogma.close();
		
	}
}
