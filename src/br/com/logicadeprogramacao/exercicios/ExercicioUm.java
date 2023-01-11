package br.com.logicadeprogramacao.exercicios;


import java.util.Scanner;
import java.util.Locale;

public class ExercicioUm {

    public static void main(String [] args){

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        Double primeiroNumero = numero.nextDouble();
        System.out.println("Digite o segundo número:");
        Double segundoNumero = numero.nextDouble();

        Double resultadoPrimeiro = (primeiroNumero + (primeiroNumero * 0.30));
        Double resultadoSegundo = (segundoNumero - (segundoNumero * 0.25111));

        System.out.println("O primeiro número com acréscimo de 30% resulta em: " + resultadoPrimeiro);
        System.out.println("O segundo número com desconto de 25% resulta em: "+ resultadoSegundo);

        numero.close();
    }
}
