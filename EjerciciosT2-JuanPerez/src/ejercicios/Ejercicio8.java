package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*Comprobar que si variable distanciaRecorrida es mayor a 800 y variable diasEstancia es mayor a 7
	 * se imprima por pantalla un mensaje con la variable precioBillete con un descuento del 30% aplicado
	 * pruebo con distanciaRecorrida = 801 y diasEstancia = 8
	 * FUNCIONA CORRECTAMENTE
	 * 
	 * Comprobar que de no cumplirse que variable distanciaRecorrida es mayor a 800 y variable diasEstancia es mayor a 7
	 * se imprima por pantalla un mensaje con la variable precioBillete 
	 * pruebo con distanciaRecorrida = 801 y diasEstancia = 7
	 * FUNCIONA CORRECTAMENTE
	 * pruebo con distanciaRecorrida = 600 y diasEstancia = 8
	 * FUNCIONA CORRECTAMENTE*/

	public static void main(String[] args) {

		double distanciaRecorrida, diasEstancia, precioBillete;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario mediante impresion por pantalla un valor para variable distanciaRecorrida
		System.out.print("Cuantos kilometros tiene la distancia de su recorrido? ");
		
		//Asigno a variable distanciaRecorrida un valor con uso del Scanner
		distanciaRecorrida = dogma.nextDouble();
		
		//Solicito a usuario mediante impresion por pantalla un valor para variable diasEstancia
		System.out.print("Cuantos dias va a quedarse en su destino? ");
		
		//Asigno a variable diasEstancia un valor con uso del Scanner
		diasEstancia = dogma.nextDouble();
		
		//Doy valor a variable precioBillete multiplicando la variable distanciaRecorrida por 2,5
		precioBillete = distanciaRecorrida*2.5;
		
		/*Establezco que de cumplirse la siguiente condicion se imprima por pantalla el siguiente mensaje
		 aplicando un descuento del 30% al precio del billete
		 hago el descuento mediante multiplicacion de variable precioBillete por 0,7 */
		if ((distanciaRecorrida>800) && (diasEstancia>7)) {
			System.out.print("El precio de su billete con descuento ya aplicado es: " + precioBillete*0.7 + " euros");
			
		/*Establezco que de no cumplirse la condicion anterior se imprima por pantalla el siguiente mensaje
		 * mostrando el precio del billete sin descuento aplicado*/
		} else {
			System.out.print("El precio de su billete es: " + precioBillete + " euros");
		}
		
		//Cierro Scanner
		dogma.close();

	}

}
