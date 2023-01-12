package br.com.logicadeprogramacao.exercicios.exercicio12;

import java.util.Scanner;

public class MediaAlunoComPeso {
//Beecrowd
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();

        double MEDIA = ((A*3.5) + (B*7.5))/11;
        System.out.printf("MEDIA = %.5f %n",  MEDIA);

    }
}
