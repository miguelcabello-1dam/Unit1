package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// (Acepta el reto) El cinquecento es un periodo del arte europeo (principalmente italiano) enclavado en pleno Renacimiento. Aunque su nombre esconde el número cinco, en realidad ¡pertenece al siglo XVI! Cinquecento es, abreviadamente, "años [mil] quinientos", en italiano, y es que el siglo XVI comprendió los años desde el 1501 al 1600, igual que el siglo XXI empezó en el 2001, con un 20 en sus dos primeros dígitos y no un 21. Dado un año, ¿de qué siglo es?

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable del año como entero
		int año;
		// Declaracion de la variable del siglo del año como entero
		int siglo;
		
		// Pedimos que se introduzca el año
		System.out.println("Introduce el año");
		// Escaneamos el numero y lo guardamos en la variable año
		año = sc.nextInt();
		
		// Se calcula el numero de año quitando los dos primeros digitos a la derecha y sumando 1
		siglo = año / 100 + 1;
		
		// Devolvemos por pantalla el siglo al que pertenece el año
		System.out.println("El año pertenece al siglo: " + siglo);
		
		// Cerramos el scanner
		sc.close();
	}

}