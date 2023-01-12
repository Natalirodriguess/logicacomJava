package br.com.logicadeprogramacao.exercicios.exercicio17;

import java.util.Scanner;

public class ProdutosTotalAPagar {
    //Beecrowd
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        int codigoProduto1 = scan.nextInt();
        int quantidadeProduto1 =  scan.nextInt();
        double precoProduto1 = scan.nextDouble();

        int codigoProduto2 =  scan.nextInt();
        int quantidadeProduto2 =  scan.nextInt();
        double precoProduto2 = scan.nextDouble();

        double totalAPagar = ((precoProduto1*quantidadeProduto1) + (precoProduto2*quantidadeProduto2));
        System.out.printf("VALOR A PAGAR = R$ %.2f%n", totalAPagar);

    }
}
