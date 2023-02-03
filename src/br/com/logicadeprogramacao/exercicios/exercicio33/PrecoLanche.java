package br.com.logicadeprogramacao.exercicios.exercicio33;

import java.util.Scanner;

public class PrecoLanche {
    public static void main(String [] args){  //1038
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int Y = leitor.nextInt();
        double precoUnidadeLanche = 0;
        double precoTotalLanche;

        switch (X){
            case 1:
                precoUnidadeLanche = 4.00;
                break;
            case 2:
                precoUnidadeLanche = 4.50;
                break;
            case 3:
                precoUnidadeLanche = 5.00;
                break;
            case 4:
                precoUnidadeLanche = 2.00;
                break;
            case 5:
                precoUnidadeLanche = 1.50;
                break;
        }
        precoTotalLanche = precoUnidadeLanche * Y;

        System.out.printf("Total: R$ %.2f%n", precoTotalLanche);
    }
}
