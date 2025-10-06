package Exercicios;

import java.util.Scanner;

public class exElseIf04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//// Painel Inicial
		System.out.println("Digite um número para verificar se e PAR ou IMPAR:");

		//// Coleta de Dados
		int valorA = sc.nextInt();

		//// Processamento e Saída de Dados
		if (valorA % 2 == 0) {
			System.out.println("O número " + valorA + " é PAR ! ");
		} else {
			System.out.println("O número " + valorA + " é IMPAR ! ");
		}
		sc.close();
	}
}