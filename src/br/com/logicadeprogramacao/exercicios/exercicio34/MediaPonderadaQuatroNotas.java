package br.com.logicadeprogramacao.exercicios.exercicio34;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderadaQuatroNotas { //1040
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        float N1 = ler.nextFloat();
        float  N2 = ler.nextFloat();
        float N3 = ler.nextFloat();
        float  N4 = ler.nextFloat();
        int a = 2, b = 3, c = 4, d = 1;

        float mediaPonderada = ((a*N1) + (b*N2) + (c*N3) + (d*N4)) / (a+b+c+d) ;

        if(mediaPonderada >= 7.0){
            System.out.printf("Media: %.1f%n", mediaPonderada);
            System.out.println("Aluno aprovado.");
        } else if(mediaPonderada < 5.0){
            System.out.printf("Media: %.1f%n", mediaPonderada);
            System.out.println("Aluno reprovado.");

        }
        else if(mediaPonderada >= 5.0 && mediaPonderada <= 6.9){
            System.out.printf("Media: %.1f%n", mediaPonderada);
            System.out.println("Aluno em exame.");
            float  N5 = ler.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", N5);
            float  mediaFinal = (N5 + mediaPonderada ) / 2;
            if(mediaFinal >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
            }else if(mediaFinal <= 4.9){
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
            }

        }
    }
}
