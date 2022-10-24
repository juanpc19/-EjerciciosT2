package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*Comprobar que los valores de las variables horas, minutos y segundos han sido introducidos de forma correcta,
	 * en caso de no ser asi en cualquiera de las 3 variables ha de imprimirse un mensaje de error por pantalla
	 * pruebo con valor 77 cada una de las 3 variables 
	 * FUNCIONA CORRECTAMENTE
	 * pruebo con valor -1 cada una de las 3 variables
	 * FUNCIONA CORRECTAMENTE
	 * 
	 * Comprobar que si variable segundos es igual o menor a 58, se imprima un mensaje por pantalla
	 * dejando las variables horas y minutos igual pero añadiendo un segundo a la variable segundos
	 * pruebo con valor 43 
	 * FUNCIONA CORRECTAMENTE
	 * 
	 * Comprobar que si variable segundos es igual a 59 y a la vez la variable minutos es igual o menor a 58,
	 * se imprima un mensaje por pantalla dejando la variable horas igual, añadiendo +1 a variable minutos y
	 * dando nuevo valor a variable segundos igual a 0
	 * pruebo con segundos = 59 y minutos = 58
	 * FUNCIONA CORRECTAMENTE
	 * 
	 * Comprobar que si variable segundos es igual a 59 y a la vez variable minutos es igual a 59 
	 * y a la vez la variable horas es igual o menor a 22, 
	 * se imprima un mensaje por pantalla sumando +1 a variable horas, y dando a variables
	 * minutos y segundos valores igual a 0
	 * pruebo con: segundos = 59 y minutos = 59 y horas = 22
	 * FUNCIONA CORRECTAMENTE
	 
	 * Comprobar que si variable segundos es igual a 59 y a la vez la variable minutos es igual a 59
	 * y a la vez la variable horas es igual a 23, se imprima un mensaje por pantalla dando
	 * valor 0 a todas las variables
	 * pruebo con: segundos = 59 y minutos = 59 y horas = 23
	 * FUNCIONA CORRECTAMENTE */

	public static void main(String[] args) {

		int horas, minutos, segundos;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario mediante impresion por pantalla un valor para variable horas
		System.out.print("Proporcione con numeros las horas de la hora actual: ");
		
		//Asigno a variable horas un valor con uso del Scanner
		horas = dogma.nextInt();
		
		//Solicito a usuario mediante impresion por pantalla un valor para variable minutos
		System.out.print("Proporcione con numeros los minutos de la hora actual: ");
		
		//Asigno a variable minutos un valor con uso del Scanner
		minutos = dogma.nextInt();
		
		//Solicito a usuario mediante impresion por pantalla un valor para variable segundos
		System.out.print("Proporcione con numeros los segundos de la hora actual: ");
		
		//Asigno a variable segundos un valor con uso del Scanner
		segundos = dogma.nextInt();
		
		/*Establezco lista de condiciones de la que de cumplirse una de ellas 
		 * se imprimira el siguiente mensaje de error por pantalla*/
		if ((horas<0) || (horas>=24) || (minutos<0) || (minutos>=60) || (segundos<0) || (segundos>=60)) {
			System.out.print("Ha introducido datos erroneos, por favor use datos correctos como los mostrados a continuacion:\n"
				+"numero de 0 a 23 para dato horas, numero de 0 a 59 para dato minutos, numero de 0 a 59 para dato segundos.");
			
		/*Establezo que de no cumplirse la condicion anterior se compruebe la siguiente condicion 
		que de cumplirse imprimira el siguiente mensaje por pantalla*/
		} else if (segundos<=58) {
			System.out.print("La hora actual mas un segundo es: " + horas + " : " + minutos + " : " + ++segundos);
			
		/*Establezo que de no cumplirse la condicion anterior se compruebe la siguiente condicion 
		que de cumplirse imprimira el siguiente mensaje por pantalla*/	
		} else if ((segundos==59) && (minutos<=58)) {
			System.out.print("La hora actual mas un segundo es: " + horas + " : " + ++minutos + " : " + (segundos = 0));
			
		/*Establezo que de no cumplirse la condicion anterior se compruebe la siguiente condicion 
		que de cumplirse imprimira el siguiente mensaje por pantalla*/
		} else if ((segundos==59) && (minutos==59) && (horas<=22)) {
			System.out.print("La hora actual mas un segundo es: " + ++horas + " : " + (minutos = 0) + " : " + (segundos = 0));
			
		/*Establezo que de no cumplirse la condicion anterior se compruebe la siguiente condicion 
		que de cumplirse imprimira el siguiente mensaje por pantalla*/
		} else if ((segundos==59) && (minutos==59) && (horas==23)) {
			System.out.print("La hora actual mas un segundo es: " + (horas = 0) + " : " + (minutos = 0) + " : " + (segundos = 0));
		}	
		
		//Cierro Scanner
		dogma.close();
		
	}

}
