package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*Comprobar que de cumplirse la condicion (sumaNumeros==numeroRandom1+numeroRandom2) 
	 * se imprima por pantalla un mensaje diciendo La suma de ambos numeros es correcta 
	 * recibo numero 13 y 23 del programa los sumo manualmente e introduzco mediante teclado
	 * escribiendo 39 que se asigna a varible sumaNumeros
	 * FUNCIONA CORRECTAMENTE
	 * 
	 * Comprobar que de no cumplirse la condicion (sumaNumeros==numeroRandom1+numeroRandom2) 
	 * se imprima por pantalla un mensaje diciendo La suma de ambos numeros no es correcta 
	 * recibo numero 2 y 43  del programa los sumo MAL manualmente e introduzco mediante teclado
	 * escribiendo 67 que se asigna a varible sumaNumeros
	 * FUNCIONA CORRECTAMENTE*/

	public static void main(String[] args) {

		int numeroRandom1, numeroRandom2, sumaNumeros;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		/*Le asigno a variable numeroRandom1 su valor multiplicando el valor obtenido de Math.random por 100
		(hago cast al resultado de la operacion para asignar a la variable numeroRandom1 un valor tipo int
		 en lugar de double, que es lo que obtendria de la operacion ya que Math.random funciona con tipo double,
		 dando al usuario un numero tipo int truncado que es mas facil de sumar*/
		numeroRandom1 = (int) (Math.random()*100);
		
		//Repito el proceso anterior para variable numeroRandom2
		numeroRandom2 = (int) (Math.random()*100);
		
		//Imprimo por pantalla el primer numero aleatorio para el usuario
		System.out.println("El primer numero aleatorio es: " + numeroRandom1);
		
		//Imprimo por pantalla el segundo numero aleatorio para el usuario
		System.out.println("El segundo numero aleatorio es: " + numeroRandom2);
		
		//Solicito al usuario el resultado de la suma de los numeros aleatorios
		System.out.print("Introduzca el resultado de la suma de los numeros proporcionados: ");
		
		//Asigno valor a variable sumaNumeros mediante uso del Scanner
		sumaNumeros = dogma.nextInt();
		
		/*Establezco que de cumplirse la siguiente condicion (el usuario ha hecho la suma bien)
		se imprima por pantalla el siguiente mensaje*/
		if (sumaNumeros==numeroRandom1+numeroRandom2) {
			System.out.print("La suma de ambos numeros es correcta ");
			
		/*Establezco que de no cumplirse la condicion anterior (el usuario no ha hecho la suma bien)
		se imprima por pantalla el siguiente mensaje*/
		} else {
			System.out.print("La suma de ambos numeros no es correcta ");
		}

		dogma.close();
	}

}
