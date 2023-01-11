package br.com.logicadeprogramacao.classica.teste;
import br.com.logicadeprogramacao.classica.classes.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String [] args) {
        String resposta;

        do {
            System.out.println("=============================");
            System.out.println("         CALCULADORA         ");
            System.out.println("=============================");

            Calculadora calculo = new Calculadora();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha uma das opções para indicar a operação no cálculo:");
            System.out.println(" + " +
                    " - " +
                    "/ " +
                    "*");
            String operacao = scanner.next();
//            System.out.println("1 - Somar \n" +
//                    "2 - subtrair \n" +
//                    "3 - dividir \n" +
//                    "4 - multiplicar\n ");
//            Integer operacao = scanner.nextInt();

            System.out.println("Informe o primeiro número:");
            Integer a = scanner.nextInt();
            System.out.println("Informe o segundo número:");
            Integer b = scanner.nextInt();

//            switch (operacao) {
//                case 1:
//                    calculo.somar(a, b);
//                    break;
//                case 2:
//                    calculo.subtrair(a, b);
//                    break;
//                case 3:
//                    calculo.dividir(a, b);
//                    break;
//                case 4:
//                    calculo.multiplicar(a, b);
//                    break;
//            }

            switch (operacao) {
                case "+":
                   calculo.somar(a, b);
                   break;
                case "-":
                   calculo.subtrair(a, b);
                    break;
                case "/":
                    calculo.dividir(a, b);
                    break;
                case "*":
                    calculo.multiplicar(a, b);
                   break;
            }

            System.out.println("Deseja realizar mais um cálculo? (S/N)");
            resposta = scanner.next();

        } while (resposta.equals("S") || resposta.equals("s"));

    }

}
