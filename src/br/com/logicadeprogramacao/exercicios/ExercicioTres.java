package br.com.logicadeprogramacao.exercicios;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String [] args){

        Scanner valor = new Scanner(System.in);


        String resposta = "";

        do {
            System.out.println("Digite um limite para a sequência:");
            Integer numero = valor.nextInt();

            Integer anterior = 0;
            Integer posterior = 1;

            for (int i = 0; i <= numero; i++) {
                Integer soma = anterior + posterior;
                posterior = anterior;
                anterior = soma;
                System.out.println(soma);
            }
            System.out.println("Deseja visualizar mais um limite diferente da sequência?");
            resposta = valor.next();

        } while (resposta.toUpperCase().equals("S"));

        valor.close();
    }
}
