package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta decisión: solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de tener que ir a la biblioteca. Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para salir a la calle.

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable de si esta lloviendo como booleano
		boolean lluvia;
		// Declaracion de la variable de si ha hecho la tarea como booleano
		boolean tareaHecha;
		// Declaracion de la variable de si tiene que ir a la biblioteca como booleano
		boolean biblioteca;
		// Declaracion de la variable de si sale como booleano
		boolean salir;
		
		// Pregunta te true o false si llueve
		System.out.println("Esta lloviendo?");
		// Se guarda en la variable lluvia
		lluvia = sc.nextBoolean();
		// Pregunta te true o false si ha hecho la tarea
		System.out.println("Has hecho la tarea?");
		// Se guarda en la variable tareaHecha
		tareaHecha = sc.nextBoolean();
		// Pregunta te true o false si tiene que ir a la biblioteca
		System.out.println("tienes que ir a la biblioteca?");
		// Se guarda en la variable biblioteca
		biblioteca = sc.nextBoolean();
		
		// Calculo del booleano salir, si no llueve y tiene la tarea hecha puede salir, o si tiene que ir a la biblioteca, puede salir, cualquier otro caso da como resultado false
		salir = !lluvia && tareaHecha || biblioteca;
		
		// Devolvemos por pantalla si puede salir
		System.out.println("Puedes salir? " + salir);
		
		// Cerramos el scanner
		sc.close();
	}

}
