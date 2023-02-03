package br.com.logicadeprogramacao.exercicios.exercicio22;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) { // beecrowd
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double distancia = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.printf("%.4f%n", distancia);

    }
}
