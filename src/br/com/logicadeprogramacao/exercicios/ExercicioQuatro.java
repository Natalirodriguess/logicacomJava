package br.com.logicadeprogramacao.exercicios;

import java.util.Scanner;

public class ExercicioQuatro { //o código verifica se um número é ou não primo

    public static void main (String [] args){

        System.out.println("Digite um número para verificar se ele é primo ou não:");
        Scanner valor = new Scanner(System.in);
        int numero = valor.nextInt();
        valor.close();

        printPrimo(numero);
    }

    public static boolean verificaPrimo(int numero){
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimo(int numero){
        if(verificaPrimo(numero)){
            System.out.println("O número é primo!");
        } else{
            System.out.println("O número não é primo!");
        }
    }
}
