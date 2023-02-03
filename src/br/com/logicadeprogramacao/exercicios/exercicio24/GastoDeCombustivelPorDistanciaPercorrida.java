package br.com.logicadeprogramacao.exercicios.exercicio24;

import java.util.Scanner;

public class GastoDeCombustivelPorDistanciaPercorrida {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempo = scan.nextInt();
        int velocidadeMedia = scan.nextInt();
        int distanciaPercorrida = velocidadeMedia*tempo;
        double gastoDeCombustível = (distanciaPercorrida)/12.0;
        System.out.printf("%.3f%n", gastoDeCombustível);

    }
}
