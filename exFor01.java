package Exercicios;

import java.util.Scanner;

public class exFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        System.out.printf("Números ímpares até %d:%n", numero);
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}