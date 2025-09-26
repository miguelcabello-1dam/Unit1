package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crear una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la nota media puede tener decimales.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables de la primera nota, la segunda nota y la media como Doubles por si contienen decimales
		double nota1;
		double nota2;
		double media;
		
		// Pedimos que se introduzca la primera nota
		System.out.println("Introduce la primera nota");
		// Escaneamos la nota y la metemos en la variable nota1
		nota1 = sc.nextDouble();
		
		// Pedimos que se introduzca la segunda nota
		System.out.println("Introduce la segunda nota");
		// Escaneamos la nota y la metemos en la variable nota2
		nota2 = sc.nextDouble();
		
		// Calculamos la media
		media = (nota1 + nota2)/2;
		
		// Se devuelve por pantalla la edad
		System.out.println("La media de las dos notas es  " + media);
		
		// Cerramos el scanner
		sc.close();
	}

}