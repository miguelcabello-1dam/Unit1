package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos, tanto de las peras como de las manzanas). La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable de las ventas de los kilos de peras como entero
		int ventaKilosPeras;
		// Declaracion de la variable de las ventas de los kilos de manzanas como entero
		int ventaKilosManzanas;
		// Declaracion de la constante del precio del kilo de pera como double
		final double precioKiloPera = 1.95;
		// Declaracion de la constante del precio del kilo de manzana como double
		final double precioKiloManzana = 2.35;
		// Declaracion de la variable del beneficio anual como double
		double beneficioAnual;
		
		// Pedimos que se introduzcan los kilos de peras
		System.out.println("Introduce la cantidad de venta de kilos de pera");
		// Se guarda en la variable ventakilosperas
		ventaKilosPeras = sc.nextInt();
		// Pedimos que se introduzcan los kilos de manzanas
		System.out.println("Introduce la cantidad de venta de kilos de manzana");
		// Se guarda en la variable ventakilosmanzanas
		ventaKilosManzanas = sc.nextInt();
		
		// Calculo del beneficio anual multiplicando los kilos por su precio y sumando el totals
		beneficioAnual = ventaKilosPeras * precioKiloPera + ventaKilosManzanas * precioKiloManzana;
		
		// Devolvemos por pantalla el beneficio anual
		System.out.println("El beneficio anual de las ventas es de: " + beneficioAnual + "€");
		
		// Cerramos el scanner
		sc.close();
	}

}
