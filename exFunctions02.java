package Exercicios;

import java.util.Scanner;

public class exFunctions02 {
	public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite 3 números:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int high = max(a, b, c);
	
	mostreResultado(high);
	
	sc.close();
	
	}
	
	public static int max(int x, int y, int z) {
		
		int XYZ;
		if (x > y && x > z) {
			XYZ = x;
		}
		  else if (y > z) {
			XYZ = y;
		}
		  else {
			XYZ = z;
		}
		return XYZ;
		
	}
	
	public static void mostreResultado(int valor) {
		System.out.printf("O maior número é: %d%n", valor);
		
	}
}	