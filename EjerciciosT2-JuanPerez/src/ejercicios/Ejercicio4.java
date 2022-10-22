package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numeroIntroducido, decena, unidad;//Declaro las variables de tipo int
		
		String numeroCadena = ""; /*Declaro la variable de tipo String y la inicio dejandola 
		vacia para poder usarla sin problemas posteriormente*/
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero por consola comprendido en el intervalo [1,99]
		System.out.print("Introduzca un número entero entre 1 y 99: ");
		
		
		//Asigno a la variable numeroIntroducido un valor mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Establezco que de cumplirse cualquiera de las dos condiciones siguientes se imprima el siguiente mensaje por pantalla
		if ((numeroIntroducido<=0) || (numeroIntroducido>=100)) {
			System.out.print("El numero introducido no es valido, introduzca un numero entre 1 y 99");
		}
		
		/*Asigno valor a variable decena, igual a numeroIntroducido dividido entre diez, 
		para poder usar decena para poder averiguar la primera cifra del numeroIntroducido de ser este de 2 cifras*/
		decena = numeroIntroducido/10;
				
		/*Asigno valor a variable unidad, igual al resto de la division de numeroIntroducido dividido entre diez, 
		para poder usar unidad para averiguar la segunda cifra del numeroIntroducido de ser este de 2 cifras 
		o la unica cifra de ser este numero de una sola cifra*/
		unidad = numeroIntroducido%10;
		
		//Establezco que de cumplirse ambas condiciones a continuacion escritas se ejecute el siguiente switch
		if ((numeroIntroducido>10) && (numeroIntroducido<16)) {
		
		/*Le doy al switch la variable a comprobar (numeroIntroducido para numeros del 11 al 15)
		y segun el valor de la variable ejecutara el contenido del case correspondiente imprimiendo un mensaje por pantalla,
		finalizando aqui el programa*/
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
		
		//Establezco que de no cumplirse ambas condiciones anteriores se ejecuten los dos switch siguientes
		} else {
		
		/*Le doy al switch la variable a comprobar (decena) y segun el valor de la variable	 ejecutara el contenido del case correspondiente
		 Creo un if dentro de cada case que añade un valor a la variable de tipo string numeroCadena (mediante uso de operador suma y asigna)
		 en caso que la unidad del numero introducido sea 0
		 y a continuacion creo un else para que añada un valor distinto en caso que no sea 0 */
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
					numeroCadena+="VEINTI";
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
		
		/*Le doy al switch la variable a comprobar (unidad) y segun el valor de la variable	 ejecutara el contenido del case correspondiente
		 añadiendo un valor a la variable de tipo string numeroCadena (mediante uso de operador suma y asigna) */
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
		
		
		//Imprimo mensaje por pantalla mostrando EL VALOR FINAL de numeroCadena mediante impresion por pantalla
		System.out.print(numeroCadena);
		
		//Cierro el Scanner
		dogma.close();
	}

}
