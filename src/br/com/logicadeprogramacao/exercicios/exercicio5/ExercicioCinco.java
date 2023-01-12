package br.com.logicadeprogramacao.exercicios.exercicio5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String [] args){

        String resposta;
        do {
            Scanner area = new Scanner(System.in);
            System.out.println("======================================================\n" +
                    "          CALCULADORA DE ÁREAS PELO FORMATO       \n" +
                    "======================================================\n" +
                    "Escolha qual o formato da área que deseja calcular: \n" +
                    "1 - Retângulo \n" +
                    "2 - Quadrado \n" +
                    "3 - Círculo \n");

            int forma = area.nextInt();

            switch (forma) {
                case 1:
                    System.out.println("Informe o tamanho do lado maior do retângulo:");
                    double lado1 = area.nextDouble();
                    System.out.println("Informe o tamanho do lado menor do retângulo:");
                    double lado2 = area.nextDouble();
                    System.out.println("A área do retângulo, de lados " + lado1 + " e " + lado2 + " é: " +
                            +areaRetangulo(lado1, lado2));
                    if (lado1 == lado2) {
                        System.out.println("Esse retângulo é também um quadrado!");
                    }
                    break;
                case 2:
                    System.out.println("Informe o tamanho de um dos lados do quadrado:");
                    double ladoQuadradro = area.nextDouble();
                    System.out.println("A área do quadrado de lado " + ladoQuadradro + " é: "
                            + areaQuadrado(ladoQuadradro));
                    break;
                case 3:
                    System.out.println("Informe o raio do cículo que deseja calcular:");
                    double raio = area.nextDouble();
                    System.out.println("A área do círculo de raio " + raio + " é: " + areaCirculo(raio));
                    break;
            }
            if (!(forma <= 3)) {
                System.out.println("Opção inválida!, tente novamente!");
            }
            System.out.println("Deseja realizar mais um cáculo?");
            resposta = area.next();
        } while(resposta.toUpperCase().equals("SIM"));

    }

    private static double areaCirculo(double raio) {
        double areaCirculo = 3.14 * (raio*raio);
        return areaCirculo;
    }

    private static double areaQuadrado(double ladoQuadradro) {
        double areaQuadrado = ladoQuadradro * ladoQuadradro;
        return areaQuadrado;
    }

    public static double areaRetangulo(double lado1, double lado2){
        double areaRetangulo = lado1*lado2; // Área do retângulo é dado por A=b*h
        return areaRetangulo;
    }
}
