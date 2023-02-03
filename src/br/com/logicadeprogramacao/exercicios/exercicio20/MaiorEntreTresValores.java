package br.com.logicadeprogramacao.exercicios.exercicio20;

import java.util.Scanner;

import static java.lang.Math.abs;

public class MaiorEntreTresValores { //Beecrowd

    public static void main(String [] args){
        Scanner objeto = new Scanner(System.in);
        int a = objeto.nextInt();
        int b = objeto.nextInt();
        int c = objeto.nextInt();
        int MaiorAB = (a+b+abs(a-b))/2;
        int MaiorABC = (MaiorAB + c + abs(MaiorAB - c))/2;

        System.out.println(MaiorABC + " eh o maior");
    }
}