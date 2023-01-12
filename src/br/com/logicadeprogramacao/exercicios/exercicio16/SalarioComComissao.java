package br.com.logicadeprogramacao.exercicios.exercicio16;

import java.util.Scanner;

public class SalarioComComissao {
    //Beecrowd
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        double salarioFixo = scan.nextDouble();
        double vendaMes = scan.nextDouble();

        double salarioTotal = (salarioFixo +(vendaMes*0.15f));
        System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
    }
}
