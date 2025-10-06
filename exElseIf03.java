package Exercicios;

import java.util.Scanner;

public class exElseIf03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//// Painel Inicial
		System.out.println("Digite dois números e direi se são multiplos ou não:");

		//// Coleta de Dados
		System.out.println("Primeiro número:");
		int valorA = sc.nextInt();
		System.out.println("Segundo número:");
		int valorB = sc.nextInt();

		//// Processamento de Dados
		if (valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.printf("Os números %d e %d são multiplos entre si !", valorA, valorB);
		} else {
			System.out.printf("Os números %d e %d não são multiplos !", valorA, valorB);
		}

		sc.close();

	}

}
