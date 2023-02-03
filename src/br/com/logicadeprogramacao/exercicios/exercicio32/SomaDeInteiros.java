package br.com.logicadeprogramacao.exercicios.exercicio32;

import java.util.Scanner;

public class SomaDeInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, X ;
        A = scan.nextInt();
        B = scan.nextInt();
        X = A + B;

        System.out.printf("X = %d%n", X);
    }
}
