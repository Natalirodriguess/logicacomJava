package br.com.logicadeprogramacao.exercicios.exercicio23;

import java.util.Scanner;

public class TempoGastoDistaciaPercorrida { //beecrowd 1016
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();
        int tempoGasto = km*2;
        System.out.printf("%d minutos%n", tempoGasto);
    }
}
