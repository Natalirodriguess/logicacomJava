package br.com.logicadeprogramacao.exercicios.exercicio9;

import java.io.IOException;
import java.util.Scanner;

public class AreaCirculo {
    //Area do círculo
        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            double R = scan.nextDouble();
            double pi = 3.14159;
            double A = (pi*R*R);
            System.out.printf("A=%.4f", A);
            System.out.println();

        }
}
