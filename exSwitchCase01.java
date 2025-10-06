package Exercicios;

import java.util.Scanner;

public class exSwitchCase01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Painel Inicial
        System.out.println("Qual o código do pedido?");
        System.out.println("1 - Pastel de Queijo com Calabresa");
        System.out.println("2 - Pastel de Carne com Queijo");
        System.out.println("3 - Coca-Cola 2L");
        System.out.println("4 - Amendoim 55g");
        System.out.println("5 - Chiclete");
        System.out.print("Digite o código: ");
        int codigo = sc.nextInt();

        System.out.print("Qual a quantidade desejada? ");
        int quantidade = sc.nextInt();

        // Processamento de Dados
        String nomeProduto;
        double preco;

        switch (codigo) {
            case 1:
                nomeProduto = "Pastel de Queijo com Calabresa";
                preco = 12.0;
                break;
            case 2:
                nomeProduto = "Pastel de Carne com Queijo";
                preco = 10.50;
                break;
            case 3:
                nomeProduto = "Coca-Cola 2L";
                preco = 9.0;
                break;
            case 4:
                nomeProduto = "Amendoim 55g";
                preco = 3.0;
                break;
            case 5:
                nomeProduto = "Chiclete";
                preco = 0.50;
                break;
            default:
                nomeProduto = "Código Inválido";
                preco = 0.0;
        }

        // Saída de Dados
        if (preco == 0.0) {
            System.out.println("Erro: Código de produto inválido!");
        } else {
            double total = quantidade * preco;
            System.out.printf("%nItem: %s%nQuantidade: %d%nTotal: R$ %.2f%n", nomeProduto, quantidade, total);
        }

        sc.close();
    }
}
