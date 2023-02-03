package br.com.logicadeprogramacao.exercicios.exercicio18;

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double R = scan.nextDouble();
        double pi = 3.14159;
        double volumeEsfera = (4.0/3)*(pi*(R*R*R));
        System.out.printf("VOLUME = %.3f%n", volumeEsfera);
    }
}