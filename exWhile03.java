package Exercicios;

import java.util.Scanner;

public class exWhile03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Painel
		System.out.println("Com qual combustivel quer abastecer?");
		System.out.println("1 : Alcool");
		System.out.println("2 : Gasolina");
		System.out.println("3 : Diesel");
		System.out.println("4 : Fim do Programa");
		
		//Dados
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();	
		
		//Tratamento de Dados
		while(tipo != 4) {
			
			if (tipo == 1) {
				alcool = alcool + 1;
			} 
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			} 
			else if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}
		
		//Resultado do tratamento
		System.out.println("MUITO OBRIGADO :>");
		System.out.println("Alcool:" + alcool);
		System.out.println("Gasolina:" + gasolina);
		System.out.println("Diesel:" + diesel);
			
		sc.close();
	}
}