package br.com.logicadeprogramacao.exercicios.exercicio34;

import java.util.Scanner;

public class MediaPonderadaQuatroNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double N1 = ler.nextDouble();
        double N2 = ler.nextDouble();
        double N3 = ler.nextDouble();
        double N4 = ler.nextDouble();

        double mediaPonderada = (2*N1 + 3*N2 + 4*N3 + 1*N4) / 10 ;

        if(mediaPonderada >= 7.0){
            System.out.printf("Media: %.1f%n", mediaPonderada);
            System.out.println("Aluno aprovado");
        }else if(mediaPonderada >= 5.0 && mediaPonderada < 6.9){
            System.out.printf("Media: %.1f%n", mediaPonderada);
            System.out.println("Aluno em exame.");
            double N5 = ler.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", N5);
            double novaMedia = (mediaPonderada + N5) / 2;
            if(novaMedia >= 5.0){
                System.out.println("Aluno aprovado");
                System.out.printf("Media final: %.1f%n", novaMedia);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", novaMedia);
            }
        } else if(mediaPonderada < 5.0){
            System.out.printf("Media: %.1f%n", mediaPonderada);
            System.out.println("Aluno reprovado.");
        }
    }
}
