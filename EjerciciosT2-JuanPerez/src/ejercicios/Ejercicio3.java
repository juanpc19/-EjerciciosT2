package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
		/*Compruebo que de introducir el usuario un valor asignable a variable numeroAnimales igual a 0,
		 * se imprima por pantalla un mensaje de error, impidiendo asi divisiones por 0 en la aplicacion
		 * 
		 * Compruebo que de introducir el usuario un valor asignable a variable numeroAnimales diferente a 0,
		 * se ejecute el resto del programa con normalidad
		 *
		 *Compruebo que ser la comida comprada mayor a la comida necesaria se imprima por pantalla
		 * un mensaje indicando que hay alimento suficiente para cada animal
		 * 
		 * Compruebo que en cualquier otro caso o lo que es lo mismo de ser la comida necesaria
		 *  mayor a la comida comprada se imprima un mensaje por pantalla indicando esto 
		 *  y que racion corresponde a cada animal*/

	public static void main(String[] args) {
		
		double comidaComprada, numeroAnimales, comidaNecesaria;//Declaro las variables
		
		//Creo el Scanner, lo nombro dogma y lo importo 
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario un valor para variable comidaComprada
		System.out.print("Cuantos kilos de comida ha comprado? ");
		
		//Asigno un valor a variable comidaComprada mediante uso del Scanner	
		comidaComprada = dogma.nextDouble();
		
		//Solicito al usuario un valor para variable numeroAnimales
		System.out.print("Cuantos animales ha de alimentar? ");
		
		//Asigno un valor a variable numeroAnimales mediante uso del Scanner
		numeroAnimales = dogma.nextDouble();
		
		//Solicito al usuario un valor para variable comidaTodos
		System.out.print("Cuantos kilos de comida comen todos los animales en total? ");
		
		//Asigno un valor a variable comidaTodos mediante uso del Scanner
		comidaNecesaria = dogma.nextDouble();
		
		/*Establezco la condicion de que si numeroAnimales igual a 0 se imprima el siguiente mensaje de error por pantalla
		evitando asi divisiones por 0*/
		if (numeroAnimales==0) {
			System.out.print("El numero de animales que necesitan comida es 0, "
			+ "indique correctamente la cantidad de animales que necesitan comida");
			
		/*Establezco que de no cumplirse la condicion anterior se compruebe la siguiente condicion,
		que de cumplirse imprimira por pantalla el siguiente mensaje*/
		} else if (comidaComprada>=comidaNecesaria) {
			System.out.print("Se dispone de comida suficiente para cada animal");
			
		/*Establezco que de no cumplirse ninguna condicion anterior se imprimira por pantalla el siguiente mensaje*/	
		} else {
			System.out.print("No se dispone de comida suficiente para cada animal,"
			+ " a cada animal le corresponde un racion equivalente a: " +
			(comidaComprada/numeroAnimales) + "kilos");
		}
		
		//Cierro el Scanner
		dogma.close();
	}

}
