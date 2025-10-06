package Projetos;

import java.util.Scanner;

public class exElseIf01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Coleta de Dados
		System.out.println("Que horas são?");
		int hora = sc.nextInt();

		// Tratamento e Saída de Dados
		if (hora < 12) {
			System.out.println("Tenha um bom dia !");
		} else if (hora < 18) {
			System.out.println("Tenha uma boa tarde !");
		} else {
			System.out.println("Tenha uma boa noite !");
		}

		sc.close();
	}
}
