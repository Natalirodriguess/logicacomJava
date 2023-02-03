package br.com.logicadeprogramacao.exercicios.exercicio27;

import java.util.Scanner;

public class ConverterDias { //1020 converter dias em anos, meses e horas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();
        int ano = dias/365;
        int meses = (dias%365)/30;
        dias = (dias%365)%30;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", ano, meses, dias);
    }
}