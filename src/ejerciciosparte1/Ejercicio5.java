package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el usuario debe introducir el radio, que puede contener decimales. Usa Math.PI para tomar el valor de PI. (longitud = 2πr, área=πr2)
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable del radio como double
		double radio;
		// Declaracion de la variable de la longitud como double
		double longitud;
		// Declaracion de la variable del area como double
		double area;
		
		// Pedimos que se introduzca el radio
		System.out.println("Introduce el radio de la circunferencia");
		// Escaneamos el radio y lo metemos en la variable radio
		radio = sc.nextDouble();
		
		// Calculamos la longitud
		longitud = 2 * Math.PI * radio;
		
		// Calculamos el area
		area = Math.PI * radio * radio;
		
		// Se devuelve por pantalla la longitud y el area
		System.out.println("La longitud de la circunferencia es " + longitud + " y el area es " + area);
		
		// Cerramos el scanner
		sc.close();
	}

}