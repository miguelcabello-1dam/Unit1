package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribir una aplicación que pida el año actual y el año de nacimiento del usuario. Debe calcular su edad.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables del año actual, del año de nacimiento y de la edad como enteros
		int año;
		int nac;
		int edad;
		
		// Pedimos que se introduzca el año actual
		System.out.println("Introduce el año actual");
		// Escaneamos la edad y lo metemos en la variable edad
		año = sc.nextInt();
		
		// Pedimos que se introduzca el año de nacimiento
		System.out.println("Introduce el año de nacimiento");
		// Escaneamos la edad y lo metemos en la variable edad
		nac = sc.nextInt();
		
		// Calculamos la edad
		edad = año - nac;
		
		// Se devuelve por pantalla la edad
		System.out.println("Tienes " + edad + " años");
		
		// Cerramos el scanner
		sc.close();
	}

}