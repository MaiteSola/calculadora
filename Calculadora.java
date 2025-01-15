package org.cuatrovientos.entornos.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		float numero1, numero2;
		int leer;
		float resultado;
		

		System.out.println("CALCULADORA");
		System.out.println("Introduce el primer número: ");
		numero1 = Integer.parseInt(scan.nextLine());
		System.out.println("Introduce el segundo número: ");
		numero2 = Integer.parseInt(scan.nextLine());
		do {
		System.out.println("¿Qué deseas hacer con esos números?");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		leer = Integer.parseInt(scan.nextLine());
		
		
		switch (leer) {

		case 1:
			resultado= numero1+ numero2;
			System.out.println("El resultado es "+resultado);
			//FIXME FALTA UN BREAK
		case 2:
			resultado= numero1-numero2;
			System.out.println("El resultado es "+resultado);
			break;
		case 3:
			resultado= numero1*numero2;
			System.out.println("El resultado es "+resultado);
			break;
		case 4:
			resultado=numero1/numero2;
			System.out.println("El resultado es "+resultado);
			break;
			
		default:
			System.out.println("Introduce una opción que esté en el menú");
			break;
			
		}
		}while(leer!=1 && leer!=2 && leer !=3 && leer !=4); //TODO Es una calculadora que solo realiza una operación
		
	scan.close();	
}
	


	

}
