package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta decisión: solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de tener que ir a la biblioteca. Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para salir a la calle.

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables de la lluvia, la tarea, la biblioteca y si puede salir como booleans
		boolean lluvia;
		boolean tareaHecha;
		boolean biblioteca;
		boolean salir;
		
		// Le hacemos las preguntas para los booleans y los guardamos
		System.out.println("Esta lluviendo?");
		lluvia = sc.nextBoolean();
		System.out.println("Has hecho la tarea?");
		tareaHecha = sc.nextBoolean();
		System.out.println("tienes que ir a la biblioteca?");
		biblioteca = sc.nextBoolean();
		
		salir = !lluvia && tareaHecha || biblioteca;
		
		// Devolvemos por pantalla si puede salir
		System.out.println("Puedes salir? " + salir);
		
		// Cerramos el scanner
		sc.close();
	}

}
