package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mensaje = "";
		
		System.out.print("Ingrese número: ");
		int fact = sc.nextInt();
		int facto = fact;
			
		if (fact > 7) {
			mensaje = "El número es superior de 7";
		}
		
		else {
			for (int x = 1; x < facto; x++) {
				fact = fact * x;
			}
		mensaje = ("El factorial de " + facto + " es: " + fact);
		}
		
		System.out.println(mensaje);
	}

}
