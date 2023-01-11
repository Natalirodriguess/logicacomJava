package br.com.logicadeprogramacao.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioOito {
    //Teste Try Catch
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        boolean feito = false;

        while(!feito) {
            try {
                System.out.println("Digite um número:");
                numero = scan.nextInt();
                feito = true;

            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("Valor inválido, por favor digite um número inteiro!");
            }
        }
        System.out.println("O número digitado foi: " + numero);
    }
}
