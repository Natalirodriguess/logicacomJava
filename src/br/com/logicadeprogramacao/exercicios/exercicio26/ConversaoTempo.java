package br.com.logicadeprogramacao.exercicios.exercicio26;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) { //1019 transformar segundos no formato 00:00:00

        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();
        int horas;
        int minutos;

            horas = segundos/3600;
            minutos = (segundos%3600)/60;
            segundos = (segundos%60)/1;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }
}