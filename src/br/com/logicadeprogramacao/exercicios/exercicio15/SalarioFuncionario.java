package br.com.logicadeprogramacao.exercicios.exercicio15;

import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int NUMBER = scan.nextInt();
        int horaTrabalhada = scan.nextInt();
        float valorHoraTrabalhada = scan.nextFloat();

        float SALARY = (horaTrabalhada*valorHoraTrabalhada);
        System.out.printf("NUMBER = %d%n", NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);
    }
}
