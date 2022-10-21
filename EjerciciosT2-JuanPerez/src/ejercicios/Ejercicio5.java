package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.print(numeroIntroducido<=0 ? 
		"El valor absoluto del numero introducido es: " +  numeroIntroducido*-1 : "El valor"
		+ " absoluto del numero introducido es: " + numeroIntroducido);
		
		dogma.close();

	}

}
