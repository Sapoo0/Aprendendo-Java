package Exercicios;

import java.util.Scanner;

public class exElseIf02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//// Entrada de Dados
		System.out.println("Escreva um número negativo:");
		int valorA = sc.nextInt();

		//// Processamento e Saida de Dados
		if (valorA < 0) {
			System.out.printf("CORRETO !");
		} else {
			System.out.printf("NÃO É NEGATIVO !");
		}

		sc.close();
	}
}
