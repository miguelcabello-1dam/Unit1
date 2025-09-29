package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee), pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm. Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera correspondiente en centímetros. Utiliza la conversión de tipos.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable de los metros de longitud del lanzamiento como double
		double metros;
		// Declaracion de la variable de los centimetros de longitud del lanzamiento como entero
		int centimetros;
		
		// Pedimos que se introduzca la cantidad de metros de longitud del lanzamiento
		System.out.println("Introduce la longitud del lanzamiento en metros");
		// Escaneamos la longitud y la metemos en la variable metros
		metros = sc.nextDouble();
		
		// Calculamos la longitud en centimetros y truncamos para quitar los decimales
		centimetros = (int) (metros * 100);
		
		// Devolvemos por pantalla la longitud del lanzamiento en centimetros
		System.out.println("La longitud del lanzamiento en centimetros es de " + centimetros + "cm");
		
		// Cerramos el scanner
		sc.close();
	}

}