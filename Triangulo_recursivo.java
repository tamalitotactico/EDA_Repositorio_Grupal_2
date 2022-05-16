package Ejercicios;

import java.util.Scanner;

public class Triangulo_recursivo {
	public static void main(String[] args) {
		Scanner obtener = new Scanner(System.in);
		System.out.println("Introducir la base del triángulo a graficar:");
		int base=obtener.nextInt();
		DibujarTriangulo(base);
	}
	public static void DibujarTriangulo(int base) {
		int x=1; 
		while(x<=base) { 
			for(int i=1;i<=x; i++) { 
				System.out.print("*");
			} 
			System.out.print("\n");
			x++;
		}
	}
}
