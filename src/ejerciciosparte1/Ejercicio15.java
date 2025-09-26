package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Escribe un programa en el que declares una constante IVA de valor igual a 21. A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la constante del iva como entero y las variables del precio y el precio total como doubles para los decimales
		final int iva = 21;
		double precio;
		double preciototal;
		
		// Preguntamos el precio
		System.out.println("Introduce el precio");
		precio = sc.nextDouble();
		
		preciototal = iva * precio / 100 + precio;
		
		// Devolvemos por pantalla el precio total
		System.out.println("El precio total incluyendo el iva es de: " + preciototal);
		
		// Cerramos el scanner
		sc.close();
	}

}
