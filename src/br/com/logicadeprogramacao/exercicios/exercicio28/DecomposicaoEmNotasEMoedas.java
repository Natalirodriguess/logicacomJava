package br.com.logicadeprogramacao.exercicios.exercicio28;

import java.util.Scanner;

public class DecomposicaoEmNotasEMoedas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numeroRecebido = scan.nextDouble();
        int numero = (int) numeroRecebido;


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

        int numeroComparacao = (int) numeroRecebido;
        double numeroMoeda = numeroRecebido - numeroComparacao;
        double resultadoMoeda = numeroMoeda*100;
        int numeroDaMoeda = (int) resultadoMoeda;

        int divisaoMoedaPor50 = numeroDaMoeda/50;
        numeroDaMoeda -= divisaoMoedaPor50*50;
        int divisaoMoedaPor25 = numeroDaMoeda/25;
        numeroDaMoeda -= divisaoMoedaPor25*25;
        int divisaoMoedaPor10 = numeroDaMoeda/10;
        numeroDaMoeda -= divisaoMoedaPor10*10;
        int divisaoMoedaPor5 =  numeroDaMoeda/5;
        numeroDaMoeda -= divisaoMoedaPor5*5;
        int divisaoMoedaPor1 = numeroDaMoeda/1;



        System.out.printf("NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n" +
                        "%d nota(s) de R$ 20.00%n%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n" +
                        "%d nota(s) de R$ 2.00%n", divisaoPor100, divisaoPor50, divisaoPor20, divisaoPor10,
                divisaoPor5, divisaoPor2);
        System.out.printf("MOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n" +
                        "%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01%n",  divisaoPor1, divisaoMoedaPor50,
                divisaoMoedaPor25, divisaoMoedaPor10, divisaoMoedaPor5, divisaoMoedaPor1);

    }
}