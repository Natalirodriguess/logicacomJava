package br.com.logicadeprogramacao.exercicios.exercicio25;

import java.util.Scanner;

public class DecomposicaoNotas {
    public static void main(String[] args) { //Beecrowd 1018
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int mostraNumero = numero;
        int divisaoPor100 = numero/100;
        numero = ( numero - divisaoPor100*100);
        int divisaoPor50 = (numero)/50;
        numero = numero - divisaoPor50*50;
        int divisaoPor20 = numero/20;
        numero = (numero - divisaoPor20*20);
        int divisaoPor10 = numero/10;
        numero = numero - divisaoPor10*10;
        int divisaoPor5 = numero/5;
        numero = numero - divisaoPor5*5;
        int divisaoPor2 = numero/2;
        numero = numero - divisaoPor2*2;
        int divisaoPor1 = numero/1;

        System.out.printf("%d%n%d nota(s) de R$ 100,00%n%d nota(s) de R$ 50,00%n" +
                "%d nota(s) de R$ 20,00%n%d nota(s) de R$ 10,00%n%d nota(s) de R$ 5,00%n" +
                "%d nota(s) de R$ 2,00%n%d nota(s) de R$ 1,00%n", mostraNumero, divisaoPor100, divisaoPor50, divisaoPor20, divisaoPor10,
                divisaoPor5, divisaoPor2, divisaoPor1);

    }
}
