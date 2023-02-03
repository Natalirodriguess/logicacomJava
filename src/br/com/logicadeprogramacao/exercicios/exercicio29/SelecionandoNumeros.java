package br.com.logicadeprogramacao.exercicios.exercicio29;

import java.util.Scanner;

public class SelecionandoNumeros { //beecrowd 1035
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if (D>A & B > C & (D+C > A +B) & (C > 0) & (D > 0)  & (A%2 == 0) ){
            System.out.println("Valores aceitos ");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
