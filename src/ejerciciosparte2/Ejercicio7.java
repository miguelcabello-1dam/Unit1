package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido por el usuario). Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€. En el caso de que el importe total sea igual o superior a 100€, se aplicará automáticamente un bono descuento del 5%.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la constante del descuento aplicable si el valor supera los 100€
		final int DESCUENTO = 5;
		// Declaracion de la constante del precio de una entrada infantil como double
		final double PRECIO_ENTRADA_INFANTIL = 15.50;
		// Declaracion de la constante del precio de una entrada de adulto como entero
		final int PRECIO_ENTRADA_ADULTO = 20;
		// Declaracion de la variable de la cantidad de entradas infantiles como entero
		int entradasInfantiles;
		// Declaracion de la variable de la cantidad de entradas de adulto como entero
		int entradasAdulto;
		// Declaracion de la variable del precio total de todas entradas como double
		double precioTotalEntradas;
		// Declaracion de la variable del precio total como double
		double precioTotal;
		
		// Pedimos que se introduzca la cantidad de entradas infantiles
		System.out.println("Cuantas entradas infantiles desea comprar?");
		// Escaneamos la cantidad y la metemos en la variable entradasInfantiles
		entradasInfantiles = sc.nextInt();
		// Pedimos que se introduzca la cantidad de entradas de adulto
		System.out.println("Cuantas entradas adultas desea comprar?");
		// Escaneamos la cantidad y la metemos en la variable entradasAdulto
		entradasAdulto = sc.nextInt();
		
		// Se calcula el total de todas las entradas
		precioTotalEntradas = entradasInfantiles * PRECIO_ENTRADA_INFANTIL + entradasAdulto * PRECIO_ENTRADA_ADULTO;
		// Se comprueba si es mayor de 100 para aplicarle el descuento o no
		precioTotal = precioTotalEntradas >= 100 ? precioTotalEntradas - precioTotalEntradas * DESCUENTO / 100 : precioTotalEntradas;
		
		// Se devuelve por pantalla la cantidad total de todas las entradas mas la deduccion del descuento si aplica
		System.out.println("El precio total de las entradas es de " + precioTotal + "€");
		
		// Cerramos el scanner
		sc.close();
	}

}