package br.com.logicadeprogramacao.exercicios.exercicio35;

import java.util.Scanner;

public class CoordenadasDoPonto { // 1041
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }else if (x == 0 && y == 0 ){
            System.out.println("Origem");
        } else if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        }else if(x != 0 && y == 0){
            System.out.println("Eixo X");
        }
    }
}
