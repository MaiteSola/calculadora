package org.cuatrovientos.entornos.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		float num1, num2; 
		int leer;
		System.out.println("CALCULADORA");
		System.out.println("Introduce el primer número: ");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.println("Introduce el segundo número: ");
		num2 = Integer.parseInt(scan.nextLine());
		do {
		System.out.println("¿Qué deseas hacer con esos números?");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		leer = Integer.parseInt(scan.nextLine());
		
		
		switch (leer) {

		case 1:
			sumar(num1, num2);
			break;
		case 2:
			restar(num1, num2);
			break;
		case 3:
			multiplicar(num1, num2);
			break;
		case 4:
			dividir(num1, num2);
			break;
			
		default:
			System.out.println("Introduce una opción que esté en el menú");
			break;
			
		}
		}while(leer!=1 && leer!=2 && leer !=3 && leer !=4); //TODO Es una calculadora que solo realiza una operación
		
	scan.close();	
}
	/**
	 * Método para dividir dos números de tipo float y devolver un valor de tipo float
	 * @param num1 Primer número que se dividirá
	 * @param num2 Segundo número que se dividirá
	 * @return Resultado de la división de num1 y num2
	 * */

	private static void dividir(float num1, float num2) {
		float resultado;
		resultado=num1/num2;
		System.out.println("El resultado es "+resultado);
	}
	/**
	 * Método para multiplicar dos números de tipo float y devolver un valor de tipo float
	 * @param num1 Primer número que se multiplicará
	 * @param num2 Segundo número que se multiplicará
	 * @return Resultado de la multiplicación de num1 y num2
	 * */

	private static void multiplicar(float num1, float num2) {
		float resultado;
		resultado= num1*num2;
		System.out.println("El resultado es "+resultado);
	}
/**
 * Método para restar dos números de tipo float y devolver un valor de tipo float
 * @param num1 Primer número que se restará
 * @param num2 Segundo número que se restará
 * @return Resultado de la resta de num1 y num2
 */
	private static void restar(float num1, float num2) {
		float resultado;
		resultado= num1-num2;
		System.out.println("El resultado es "+resultado);
	}
	/**
	 * Método para sumar dos números de tipo float y devolver un valor de tipo float
	 * @param num1 Primer número que se sumará
	 * @param num2 Segundo número que se sumará
	 * @return Resultado de la suma de num1 y num2
	 */
	private static void sumar(float num1, float num2) {
		float resultado;
		resultado= num1+ num2;
		System.out.println("El resultado es "+resultado);
	}
	


	

}
