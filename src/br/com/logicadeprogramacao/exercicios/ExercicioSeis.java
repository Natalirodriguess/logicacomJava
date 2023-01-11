package br.com.logicadeprogramacao.exercicios;

import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String [] args){
        String resposta;
        Scanner valor = new Scanner(System.in);
        do {

           System.out.println("===================");
           System.out.println("      TABUADA      ");
           System.out.println("===================");

           System.out.println("Digite o número para verificar a tabuada:");
           int numero = valor.nextInt();

           tabuada(numero);
            System.out.println("Deseja realizar mais uma tabuada?");
           resposta = valor.next();

       } while(resposta.toUpperCase().equals("S"));
        valor.close();
    }

    public static void tabuada(int numero){
        for(int i = 1; i <=10; i++) {
            int tabuada = numero * i;
            System.out.println(numero + "x" + i + " = " + tabuada);
        }
    }

}
