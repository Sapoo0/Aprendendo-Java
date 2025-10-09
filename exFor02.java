package Exercicios;

import java.util.Scanner;

public class exFor02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para verificação [10,20]");
		int numero = sc.nextInt();
		
		int dentro = 0;
		int fora = 0;
		
		
		for (int ordem = 1; ordem <= numero; ordem++ ) {
			int numeros = sc.nextInt();
			
		if (numeros >= 10 && numeros <=20) {
			dentro++;
		} else {
			fora++;
		}
	}
		
		System.out.printf("Dentro: %d%nFora: %d%n", dentro, fora);

		sc.close();
		
	}
}
