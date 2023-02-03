package br.com.logicadeprogramacao.exercicios.exercicio30;

import java.util.Scanner;


public class FormulaBaskara {
    public static void main(String[] args) { //beecrowd 1036

        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        if(A == 0 || (B*B - 4*A*C < 0)){
            System.out.println("Impossivel calcular");

        } else {
            double raiz = Math.sqrt(B*B - 4*A*C);
            double R1 = (-B + raiz)  / (2 * A);
            double R2 = (-B - raiz) / (2 * A);

            System.out.println(String.format("R1 = %.5f", R1));
            System.out.println(String.format("R2 = %.5f", R2));
        }
    }
}
