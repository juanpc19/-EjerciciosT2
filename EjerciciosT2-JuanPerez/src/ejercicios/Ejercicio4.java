package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*casos 1 a 15 nada (quizas poner este swtich al final) 
		 * dar valor a variable con primera cifra y segunda cifra usando % y/ 
		hacer switch para primera cifra y segunda cifra, comprobacion de rango del numero, */

		int numeroIntroducido, decena, unidad;
		
		String numeroCadena = "";
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero entre 1 y 99: ");
		
		numeroIntroducido = dogma.nextInt();
		
		if ((numeroIntroducido<=0) || (numeroIntroducido>=100)) {
			System.out.print("El numero introducido no es valido, introduzca un numero entre 1 y 99");
		}
		
		decena = numeroIntroducido/10;
				
		unidad = numeroIntroducido%10;
		
		if ((numeroIntroducido>10) && (numeroIntroducido<16)) {
		
		switch (numeroIntroducido) {
			
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
		
		} else {
		
		switch (decena) {
			
			case 1->{
				
				if (unidad==0) {
					numeroCadena+="DIEZ";
				} else {
					numeroCadena+="DIECI";
				}
			}
			
			case 2->{
				
				if (unidad==0) {
					numeroCadena+="VEINTE";
				} else {
					numeroCadena+="VEINTE Y ";
				}
			}
				
			case 3->{
				
				if (unidad==0) {
					numeroCadena+="TREINTA";
				} else {
					numeroCadena+="TREINTA Y ";
				}
			}
			case 4->{
				
				if (unidad==0) {
					numeroCadena+="CUARENTA";
				} else {
					numeroCadena+="CUARENTA Y ";
				}
			}
			
			case 5->{
				
				if (unidad==0) {
					numeroCadena+="CINCUENTA";
				} else {
					numeroCadena+="CINCUENTA Y ";
				}
			}
			case 6->{
				
				if (unidad==0) {
					numeroCadena+="SESENTA";
				} else {
					numeroCadena+="SESENTA Y ";
				}
			}
			
			case 7->{
				
				if (unidad==0) {
					numeroCadena+="SETENTA";
				} else {
					numeroCadena+="SETENTA Y ";
				}
			}
			
			case 8->{
				
				if (unidad==0) {
					numeroCadena+="OCHENTA";
				} else {
					numeroCadena+="OCHENTA Y ";
				}
			}
			case 9->{
				
				if (unidad==0) {
					numeroCadena+="NOVENTA";
				} else {
					numeroCadena+="NOVENTA Y ";
				}
			}
		}
		
		switch (unidad) {
		
			case 1->
				numeroCadena+="UNO";
			
			case 2->
				numeroCadena+="DOS";
				
			case 3->
				numeroCadena+="TRES";
				
			case 4->
				numeroCadena+="CUATRO";
			
			case 5->
				numeroCadena+="CINCO";
			
			case 6->
				numeroCadena+="SEIS";
			
			case 7->
				numeroCadena+="SIETE";
			
			case 8->
				numeroCadena+="OCHO";
				
			case 9->
				numeroCadena+="NUEVE";
				}
		}
		
		
		
		System.out.print(numeroCadena);
		
		dogma.close();
	}

}
