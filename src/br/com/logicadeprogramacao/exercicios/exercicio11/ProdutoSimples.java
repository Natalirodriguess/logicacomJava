package br.com.logicadeprogramacao.exercicios.exercicio11;

import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int PROD = a * b;
        System.out.println("PROD = " + PROD);
    }
}