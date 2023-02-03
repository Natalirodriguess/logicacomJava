package br.com.logicadeprogramacao.exercicios.exercicio19;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double pi = 3.14159;
        double triangulo = (A*C)/2;
        double circulo = pi*(C*C);
        double trapezio = ((A+B)*C)/2;
        double quadrado = (B*B);
        double retangulo = (A*B);

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", triangulo, circulo,trapezio,quadrado,retangulo);


    }
}
