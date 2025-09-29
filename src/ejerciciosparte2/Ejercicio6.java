package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Solicita al usuario tres distancias: La primera, medida en milímetros. La segunda, medida en centímetros. La última, medida en metros. Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable de los milimetros como entero
		int milimetros;
		// Declaramos la variable de los centimetros como entero
		int centimetros;
		// Declaramos la variable de los metros como entero
		int metros;
		// Declaramos la variable del total de centimetros como double
		double totalCentimetros;
		
		// Pedimos que se introduzca la primera cantidad en milimetros
		System.out.println("Introduce los milimetros");
		// Escaneamos los milimetros y lo metemos en la variable milimetros
		milimetros = sc.nextInt();
		// Pedimos que se introduzca la primera cantidad en centimetros
		System.out.println("Introduce los centimetros");
		// Escaneamos los milimetros y lo metemos en la variable centimetros
		centimetros = sc.nextInt();
		// Pedimos que se introduzca la primera cantidad en metros
		System.out.println("Introduce los metros");
		// Escaneamos los milimetros y lo metemos en la variable metros
		metros = sc.nextInt();
		
		totalCentimetros = milimetros*0.1 + centimetros + metros*100;
		
		// Se devuelve por pantalla el total de centimetros
		System.out.println("El total en centimetros es: " + totalCentimetros + "cm");
		
		// Cerramos el scanner
		sc.close();
	}

}