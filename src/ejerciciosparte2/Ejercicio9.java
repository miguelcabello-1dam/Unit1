package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// (Acepta el reto) En muchos jueces on-line (¡Acepta el reto! entre ellos) cada problema tiene un identificador único para poderlo referenciar de manera unívoca dentro del sistema. Los identificadores son números naturales correlativos, y el primer problema recibe el número 100. Empezar en 100, en lugar de en 1 (o en 0), no es un capricho. Los problemas se "archivan" en volúmenes, cada uno compuesto por 100 problemas. Al asignar el número 100 al primer problema, es fácil saber en qué volumen está cualquier problema a partir de su identificador. En concreto, el primer volumen de problemas contiene a aquellos que tienen como identificador los números entre 100 y 199, el volumen 2 contiene los problemas con identificadores 200-299, etcétera. Dado un problema, ¿en qué volumen está?

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable del numero de problema como entero
		int problema;
		// Declaracion de la variable del volumen del problema como entero
		int volumen;
		
		// Pedimos que se introduzca el numero de problema
		System.out.println("Introduce el numero de problema");
		// Escaneamos el numero y lo guardamos en la variable problema
		problema = sc.nextInt();
		
		// Se calcula el numero de volumen quitando los dos primeros digitos a la derecha
		volumen = problema / 100;
		
		// Devolvemos por pantalla el numero de volumen
		System.out.println("El numero de volumen del problema es: " + volumen);
		
		// Cerramos el scanner
		sc.close();
	}

}