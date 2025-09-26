package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán al usuario). El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo la parte entera) y como se usa en el expediente académico (con decimales).
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables de las notas del primer segundo y tercer trimestre como enteras, la media entera como entera y la mediaboletin como double para los decimales
		int notas1;
		int notas2;
		int notas3;
		int mediaboletin;
		double mediaexpediente;
		
		// Le hacemos las preguntas para las notas y las guardamos
		System.out.println("Nota del primer trimestre");
		notas1 = sc.nextInt();
		System.out.println("Nota del segundo trimestre");
		notas2 = sc.nextInt();
		System.out.println("Nota del tercer trimestre");
		notas3 = sc.nextInt();
		
		mediaboletin = (notas1 + notas2 + notas3) / 3;
		mediaexpediente = (double) (notas1 + notas2 + notas3) / 3;
		
		// Devolvemos por pantalla las medias
		System.out.println("Media en boletin:  " + mediaboletin);
		System.out.println("Media en expediente:  " + mediaexpediente);
		
		// Cerramos el scanner
		sc.close();
	}

}
