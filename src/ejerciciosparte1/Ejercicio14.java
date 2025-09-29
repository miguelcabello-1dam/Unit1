package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán al usuario). El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo la parte entera) y como se usa en el expediente académico (con decimales).
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable de las notas del primer trimestre como entero
		int notas1;
		// Declaracion de la variable de las notas del segundo trimestre como entero
		int notas2;
		// Declaracion de la variable de las notas del tercer trimestre como entero
		int notas3;
		// Declaracion de la variable de la media de las notas que aparece en el boletin como entero
		int mediaBoletin;
		// Declaracion de la variable de la media de las notas que aparece en el expediente academico como double
		double mediaExpediente;
		
		// Pregunta de las notas del primer trimestre
		System.out.println("Nota del primer trimestre");
		// Se guarda en la variable notas1
		notas1 = sc.nextInt();
		// Pregunta de las notas del segundo trimestre
		System.out.println("Nota del segundo trimestre");
		// Se guarda en la variable notas2
		notas2 = sc.nextInt();
		// Pregunta de las notas del tercer trimestre
		System.out.println("Nota del tercer trimestre");
		// Se guarda en la variable notas3
		notas3 = sc.nextInt();
		
		// Calculo de la media del boletin sumando todas y dividiendo entre el numero total de notas
		mediaBoletin = (notas1 + notas2 + notas3) / 3;
		// Calculo de la media del expediente academico sumando todas y dividiendo entre el numero total de notas
		mediaExpediente = (double) (notas1 + notas2 + notas3) / 3;
		
		// Devolvemos por pantalla la media del boletin
		System.out.println("Media en boletin:  " + mediaBoletin);
		// Devolvemos por pantalla la media del expediente academico
		System.out.println("Media en expediente:  " + mediaExpediente);
		
		// Cerramos el scanner
		sc.close();
	}

}
