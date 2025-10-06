package Exercicios;

import java.util.Scanner;

public class CalculadoraDoMenos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Painel inicial
		System.out.println("=== CALCULADORA DO - === ");

		// Entrada de Dados
		System.out.println("Digite um número: ");
		int valorA = sc.nextInt();

		System.out.println("Digite outro número: ");
		int valorB = sc.nextInt();

		// Saida de Dados
		System.out.printf("%d - %d = %d%n", valorA, valorB, valorA - valorB);

		sc.close();
	}
}