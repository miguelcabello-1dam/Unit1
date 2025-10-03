package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable de los segundos como entero
		int segundos;
		// Declaramos la variable de los minutos como entero
		int minutos;
		// Declaramos la variable de las horas como entero
		int horas;
		
		// Pedimos que se introduzca el numero de segundos
		System.out.println("Introduce los segundos");
		// Escaneamos los segundos y lo metemos en la variable segundos
		segundos = sc.nextInt();
		
		// Calculamos las horas
		horas = segundos / 3600;
		// Se resta a la cantidad total
		segundos %= 3600;
		// Calculamos los minutos
		minutos = segundos / 60;
		// Se resta a la cantidad total y nos quedamos con los segundos sobrantes
		segundos %= 60;
		
		// Se devuelve por pantalla la cantidad de horas minutos y segundos de la cantidad de segundos introducida
		System.out.println("Lo segundos se dividen en: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
		
		// Cerramos el scanner
		sc.close();
	}
}