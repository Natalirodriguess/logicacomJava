package br.com.logicadeprogramacao.exercicios.exercicio2;

import java.util.Scanner;

public class ExercicioDois {

    public static void main (String [] args){

        Scanner valor = new Scanner(System.in);

        try {
            System.out.print("Digite o valor do salário fixo: R$");
            Double salarioFixo = valor.nextDouble();
            System.out.println("Informe o total de vendas ocorreram nesse mês:");
            Double totalVendas = valor.nextDouble();

            Double comissao = (totalVendas * 0.15);
            Double salarioTotal = comissao + salarioFixo;


            System.out.println("O salário fixo é: " + salarioFixo);
            System.out.println("A comissão que você ganhará é de: " + comissao);
            System.out.println("O salário total é de: " + salarioTotal);

            valor.close();
        } catch (ArithmeticException e){
            System.out.println("O s");
        }

    }
}
