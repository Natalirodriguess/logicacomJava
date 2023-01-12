package br.com.logicadeprogramacao.exercicios.exercicio14;

import java.util.Scanner;

public class Diferenca {
    //beecrow
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int DIFERENCA = ((A*B) - (C*D));
        System.out.printf("DIFERENCA = %d%n", DIFERENCA);
    }
}
