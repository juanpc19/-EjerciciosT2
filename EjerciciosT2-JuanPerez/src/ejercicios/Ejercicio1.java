package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numeroIntroducido=0, unidad=numeroIntroducido%10, decena=numeroIntroducido/10,
		 centena=numeroIntroducido/100, millar=numeroIntroducido/1000;
		
		//añadir else a los if de dentro de else if
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero entre 0 y 9999");
		
		numeroIntroducido = dogma.nextInt();
		
		if ((numeroIntroducido<0) || (numeroIntroducido>9999)) {
			System.out.print("Numero erroneo, introduzca un numero entre 0 y 9999");
		} else {
		
		if ((numeroIntroducido>=0) && (numeroIntroducido<=9)) {
			System.out.print("El numero introducido es capicua");
		} else {
			System.out.print("El numero introducido no es capicua");
			}
		
		if (((numeroIntroducido>=10)) && ((numeroIntroducido<=99)) && ((unidad==decena))) {
			System.out.print("El numero introducido es capicua");	
		} else {	
			System.out.print("El numero introducido no es capicua");	
			}
		
		if (((numeroIntroducido>=100)) && ((numeroIntroducido<=999)) && ((unidad==centena))) {
			System.out.print("El numero introducido es capicua");
		} else {
			System.out.print("El numero introducido no es capicua");	
			} 
		
		if (((numeroIntroducido>=100)) && ((numeroIntroducido<=999))
			&& ((unidad==centena)) && ((decena==centena))) {
			System.out.print("El numero introducido es capicua");
		} else {
			System.out.print("El numero introducido no es capicua");	
		
			}
		}	
		dogma.close();
		
	}
}
