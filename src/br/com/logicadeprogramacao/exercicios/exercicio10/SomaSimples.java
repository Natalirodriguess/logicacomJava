package br.com.logicadeprogramacao.exercicios.exercicio10;
import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {

    public static void main(String [] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);

    }
}
