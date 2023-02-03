package br.com.logicadeprogramacao.exercicios.exercicio21;

import java.util.Scanner;

public class MediaDeConsumo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();
        double litros = scan.nextDouble();
        double mediaDeConsumo = (km/litros);
        System.out.printf("%.3f km/l%n", mediaDeConsumo);
    }
}
