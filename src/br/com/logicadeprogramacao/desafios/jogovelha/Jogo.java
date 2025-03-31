package br.com.logicadeprogramacao.desafios.jogovelha;

import java.util.Scanner;

public class Jogo {

    static String escolhaXouOJogador1;
    static String escolhaXouOJogador2;

    static String jogador1 = "1";
    static String jogador2 = "2";

    static String [][] minhaMatrizNoTabuleiro = new String[3][3];

    static Scanner entradas = new Scanner(System.in);

    public static void mostraTabuleiro() {
        int posicoes= 0;
        System.out.println("                                                          ===================");
        System.out.println("                                                            JOGO DA VELHA");
        System.out.println("                                                          ===================");
        for(int linha = 0; linha <= 2; linha++) {
            System.out.print("                                                          |  ");
            for(int coluna = 0; coluna <= 2; coluna++) {
                posicoes++;
                System.out.print( posicoes + "   | ");
            }
            System.out.println("\n                                                          -------------------");
        }
        System.out.println("                                                          ===================");
    }

    public static void escolhaXouO(){
       boolean escolhaValida = false;
        while(!escolhaValida) {

            System.out.println("jogador " + jogador1 + " escolha [X] ou [O]");
            escolhaXouOJogador1 = entradas.nextLine().toUpperCase();

            if(escolhaXouOJogador1.equalsIgnoreCase("X")) {
                System.out.println("jogador " +jogador1 + " você ficará com [" + escolhaXouOJogador1+ "]" );
                escolhaXouOJogador2 = "O";
                System.out.println("jogador " + jogador2 + " você ficará com [" +escolhaXouOJogador2+"]");
                escolhaValida = true;
            } else if (escolhaXouOJogador1.equalsIgnoreCase("O")) {
                System.out.println("jogador " +jogador1 + " você ficará com [" + escolhaXouOJogador1+ "]" );
                escolhaXouOJogador2 = "X";
                System.out.println("jogador " + jogador2 + " você ficará com [" +escolhaXouOJogador2+"]");
                escolhaValida = true;
            }
            else {
                System.out.println("Opção inválida! Por favor informe uma das seguintes opções [X] ou [O]");
            }
        }

    }


    public static void escolhaPosicao(){

        int vez = 1;
        int escolhaDaPosicaoJogador1 = 0;
        int escolhaDaPosicaoJogador2 = 0;
        boolean valido;
        boolean venceu = false;
        boolean deuvelha = false;
        int vezValida = 0;

       while(!venceu) {
            valido = false;
            if(vez%2==0){
                while(!valido){
                    System.out.println("jogador " + jogador2 + " escolha uma posição válida de 1 a 9 para [" + escolhaXouOJogador2 + "]");
                    escolhaDaPosicaoJogador2 = entradas.nextInt();

                    if((escolhaDaPosicaoJogador2 < 1 || escolhaDaPosicaoJogador2 > 9) || escolhaDaPosicaoJogador2 == escolhaDaPosicaoJogador1 ) {
                        System.out.println("Opção inválida! Por favor informe uma posição válida!");
                        valido = false;
                    } else{
                        valido = true;
                        vezValida++;
                    }
                }

            } else {
                while(!valido){
                    System.out.println("jogador " + jogador1 + " escolha uma posição válida de 1 a 9 para [" + escolhaXouOJogador1 + "]");
                    escolhaDaPosicaoJogador1 = entradas.nextInt();

                    if((escolhaDaPosicaoJogador1 <1 || escolhaDaPosicaoJogador1 > 9) || escolhaDaPosicaoJogador1 == escolhaDaPosicaoJogador2) {
                        System.out.println("Opção inválida! Por favor informe uma posição válida!");
                        valido = false;
                    } else{
                        valido = true;
                        vezValida++;
                    }
                }

            }

            Integer posicaoDisponivel= 0;

            System.out.println("                                                          ===================");
            System.out.println("                                                            JOGO DA VELHA");
            System.out.println("                                                          ===================");
            for(int linha = 0; linha <= 2; linha++) {
                System.out.print("                                                          |  ");
                for(int coluna = 0; coluna <= 2; coluna++) {
                    posicaoDisponivel++;
                    if(minhaMatrizNoTabuleiro[0][0] ==escolhaXouOJogador1  && minhaMatrizNoTabuleiro[1][0] == escolhaXouOJogador1 &&
                            minhaMatrizNoTabuleiro[2][0]== escolhaXouOJogador1 ||minhaMatrizNoTabuleiro[0][0] == escolhaXouOJogador2  && minhaMatrizNoTabuleiro[1][0] == escolhaXouOJogador2 &&
                            minhaMatrizNoTabuleiro[2][0]== escolhaXouOJogador2){ //coluna um
                        venceu = true;
                    } else if(minhaMatrizNoTabuleiro[0][1] ==escolhaXouOJogador1  && minhaMatrizNoTabuleiro[1][1] == escolhaXouOJogador1 &&
                            minhaMatrizNoTabuleiro[2][1]== escolhaXouOJogador1 ||minhaMatrizNoTabuleiro[0][1] == escolhaXouOJogador2  && minhaMatrizNoTabuleiro[1][1] == escolhaXouOJogador2 &&
                            minhaMatrizNoTabuleiro[1][2]== escolhaXouOJogador2){ //coluna dois
                        venceu = true;
                    } else if (minhaMatrizNoTabuleiro[0][2] ==escolhaXouOJogador1  && minhaMatrizNoTabuleiro[1][2] == escolhaXouOJogador1 &&
                            minhaMatrizNoTabuleiro[2][2]== escolhaXouOJogador1 ||minhaMatrizNoTabuleiro[0][2] == escolhaXouOJogador2  && minhaMatrizNoTabuleiro[1][2] == escolhaXouOJogador2 &&
                            minhaMatrizNoTabuleiro[2][2]== escolhaXouOJogador2) { //coluna três
                        venceu = true;
                    } else if(minhaMatrizNoTabuleiro[0][0] == escolhaXouOJogador1  && minhaMatrizNoTabuleiro[0][1] == escolhaXouOJogador1 &&
                            minhaMatrizNoTabuleiro[0][2]== escolhaXouOJogador1 || minhaMatrizNoTabuleiro[0][0] == escolhaXouOJogador2  && minhaMatrizNoTabuleiro[0][1] == escolhaXouOJogador2 &&
                            minhaMatrizNoTabuleiro[0][2]== escolhaXouOJogador2){ //linha um
                        venceu = true;
                    } else if(minhaMatrizNoTabuleiro[1][0] ==escolhaXouOJogador1  && minhaMatrizNoTabuleiro[1][1] == escolhaXouOJogador1 &&
                            minhaMatrizNoTabuleiro[1][2]== escolhaXouOJogador1 || minhaMatrizNoTabuleiro[1][0] == escolhaXouOJogador2  && minhaMatrizNoTabuleiro[1][1] == escolhaXouOJogador2 &&
                            minhaMatrizNoTabuleiro[1][2]== escolhaXouOJogador2){ //linha dois
                        venceu = true;
                    } else if (minhaMatrizNoTabuleiro[2][0] ==escolhaXouOJogador1  && minhaMatrizNoTabuleiro[2][1] == escolhaXouOJogador1 &&
                            minhaMatrizNoTabuleiro[2][2]== escolhaXouOJogador1 || minhaMatrizNoTabuleiro[2][0] == escolhaXouOJogador2  && minhaMatrizNoTabuleiro[2][1] == escolhaXouOJogador2 &&
                            minhaMatrizNoTabuleiro[2][2]== escolhaXouOJogador2){ //linha tres
                        venceu = true;
                    }

                    if (minhaMatrizNoTabuleiro[linha][coluna] == escolhaXouOJogador1 || minhaMatrizNoTabuleiro[linha][coluna] == escolhaXouOJogador2) {
                        System.out.print("" + minhaMatrizNoTabuleiro[linha][coluna] + "   | ");
                        }
                        else if (vez%2!=0 && escolhaDaPosicaoJogador1 == posicaoDisponivel){
                         minhaMatrizNoTabuleiro[linha][coluna] = escolhaXouOJogador1;
                        System.out.print("" + minhaMatrizNoTabuleiro[linha][coluna] + "   | ");
                        }
                        else if(vez%2==0 && escolhaDaPosicaoJogador2 == posicaoDisponivel){
                        minhaMatrizNoTabuleiro[linha][coluna] = escolhaXouOJogador2;
                        System.out.print("" + minhaMatrizNoTabuleiro[linha][coluna] + "   | ");
                         }
                        else{
                          minhaMatrizNoTabuleiro[linha][coluna] = String.valueOf(posicaoDisponivel);
                         System.out.print("" + minhaMatrizNoTabuleiro[linha][coluna] + "   | ");
                        }

                    
                    if(minhaMatrizNoTabuleiro[0][0] == escolhaXouOJogador1  && minhaMatrizNoTabuleiro[1][1] == escolhaXouOJogador1 &&
                            minhaMatrizNoTabuleiro[2][2]== escolhaXouOJogador1 || minhaMatrizNoTabuleiro[0][0] == escolhaXouOJogador2  && minhaMatrizNoTabuleiro[1][1] == escolhaXouOJogador2 &&
                            minhaMatrizNoTabuleiro[2][2] == escolhaXouOJogador2){ //diagonal primária
                        venceu = true;
                    }else if(minhaMatrizNoTabuleiro[0][2] ==escolhaXouOJogador1  && minhaMatrizNoTabuleiro[1][1] == escolhaXouOJogador1 &&
                            minhaMatrizNoTabuleiro[2][0]== escolhaXouOJogador1 || minhaMatrizNoTabuleiro[0][2] == escolhaXouOJogador2  && minhaMatrizNoTabuleiro[1][1] == escolhaXouOJogador2 &&
                            minhaMatrizNoTabuleiro[2][0]== escolhaXouOJogador2){ //diagonal secundária
                        venceu = true;
                    }


                }
                System.out.println("\n                                                          -------------------");
            }
            System.out.println("                                                          ===================");

               if( venceu && vez%2!=0){
                   System.out.print("O jogador " + jogador1 + " venceu !");
               }else if (venceu && vez%2==0){
                   System.out.print("O jogador " + jogador2 + " venceu !");
               } else if(vezValida == 9){
                   System.out.println("Deu velha");
                   venceu = true; //falso positivo apenas para encerrar o jogo
                  // deuvelha = true;
               }

            vez++;

        }


    }
}
