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
        System.out.println("jogador " + jogador1 + " escolha [X] ou [O]");
        escolhaXouOJogador1 = entradas.nextLine();

        if(escolhaXouOJogador1.equalsIgnoreCase("X")) {
            System.out.println("jogador " +jogador1 + " você ficará com [" + escolhaXouOJogador1.toUpperCase()+ "]" );
            escolhaXouOJogador2 = "O";
            System.out.println("jogador " + jogador2 + " você ficará com [" +escolhaXouOJogador2.toUpperCase()+"]");
        } else if (escolhaXouOJogador1.equalsIgnoreCase("O")) {
            System.out.println("jogador " +jogador1 + " você ficará com [" + escolhaXouOJogador1.toUpperCase()+ "]" );
            escolhaXouOJogador2 = "X";
            System.out.println("jogador " + jogador2 + " você ficará com [" +escolhaXouOJogador2.toUpperCase()+"]");
        }
        else {
            System.out.println("Opção inválida! Por favor informe uma das seguintes opções [X] ou [O]");
            System.exit(1);
        }
    }


    public static void escolhaPosicao(){

        int vez = 1;
        int escolhaDaPosicaoJogador1 = 0;
        int escolhaDaPosicaoJogador2 = 0;
        boolean valido;

        String escolhaGeral;

        for(int posicaoNotabuleiro = 1; posicaoNotabuleiro <= 9; posicaoNotabuleiro++ ) {
            valido = false;
            if(vez%2==0){
                while(!valido){
                    System.out.println("jogador " + jogador2 + " escolha uma posição válida de 1 a 9 para [" + escolhaXouOJogador2.toUpperCase() + "]");
                    escolhaDaPosicaoJogador2 = entradas.nextInt();

                    if(escolhaDaPosicaoJogador2 <1 && escolhaDaPosicaoJogador2 > 9 || escolhaDaPosicaoJogador2 == escolhaDaPosicaoJogador1) {
                        System.out.println("Opção inválida! Por favor informe uma posição válida!");
                        valido = false;
                    } else{
                        valido = true;
                    }
                }

            } else {
                while(!valido){
                    System.out.println("jogador " + jogador1 + " escolha uma posição válida de 1 a 9 para [" + escolhaXouOJogador1.toUpperCase() + "]");
                    escolhaDaPosicaoJogador1 = entradas.nextInt();

                    if(escolhaDaPosicaoJogador1 <1 && escolhaDaPosicaoJogador1 > 9 || escolhaDaPosicaoJogador1 == escolhaDaPosicaoJogador2) {
                        System.out.println("Opção inválida! Por favor informe uma posição válida!");
                        valido = false;
                    } else{
                        valido = true;
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

                    if ( minhaMatrizNoTabuleiro[linha][coluna] == "X") {
                        System.out.print("[" + minhaMatrizNoTabuleiro[linha][coluna] + "]");
                    } else if(vez%2!=0 && escolhaDaPosicaoJogador1 == posicaoDisponivel){
                         minhaMatrizNoTabuleiro[linha][coluna] = escolhaXouOJogador1;
                        System.out.print("(" + minhaMatrizNoTabuleiro[linha][coluna] + ")");
                      }
                      else if(vez%2==0 && escolhaDaPosicaoJogador2 == posicaoDisponivel){
                        minhaMatrizNoTabuleiro[linha][coluna] = escolhaXouOJogador2;
                        System.out.print("(" + minhaMatrizNoTabuleiro[linha][coluna] + ")");
                      }
                      else{
                         System.out.print("[" + minhaMatrizNoTabuleiro[linha][coluna] + "]");
                      }


//                    if(vez%2!=0 && escolhaDaPosicaoJogador1 == posicaoDisponivel){
//                        minhaMatrizNoTabuleiro [linha][coluna] = escolhaXouOJogador1.toUpperCase();
//                        System.out.print(minhaMatrizNoTabuleiro [linha][coluna] + "   | ");
//                    } else if (escolhaDaPosicaoJogador2 == posicaoDisponivel) {
//                        minhaMatrizNoTabuleiro [linha][coluna] = escolhaXouOJogador2.toUpperCase();
//                        System.out.print(minhaMatrizNoTabuleiro [linha][coluna] + "   | ");
//                    } else {
//
//                    }

//                    if(minhaMatrizNoTabuleiro[linha][coluna] == "X" || minhaMatrizNoTabuleiro[linha][coluna] == "O") {
////                        System.out.println("Essa posição já está preenchida. Por favor, selecione outra opção");
//                        System.out.print(minhaMatrizNoTabuleiro[linha][coluna] + "   | ");
//                    } else {
//                        if (vez%2!=0 && escolhaDaPosicaoJogador1 == posicaoDisponivel) {
//                            minhaMatrizNoTabuleiro [linha][coluna] = escolhaXouOJogador1.toUpperCase();
//                            System.out.print(minhaMatrizNoTabuleiro [linha][coluna] + "   | ");
//                        } else if(escolhaDaPosicaoJogador2 == posicaoDisponivel){
//                            minhaMatrizNoTabuleiro [linha][coluna] = escolhaXouOJogador2.toUpperCase();
//                            System.out.print(minhaMatrizNoTabuleiro [linha][coluna] + "   | ");
//                        } else {
//                            minhaMatrizNoTabuleiro[linha][coluna] = String.valueOf(posicaoDisponivel);
//                            System.out.print(minhaMatrizNoTabuleiro[linha][coluna] + "   | ");
//                        }
//                    }




//                    if(escolhaDaPosicaoJogador1 == posicaoDisponivel && minhaMatrizNoTabuleiro[linha][coluna] != "X" &&
//                            escolhaDaPosicaoJogador1 == posicaoDisponivel  && minhaMatrizNoTabuleiro[linha][coluna] != "O" ) {
//
//                        minhaMatrizNoTabuleiro [linha][coluna] = escolhaXouOJogador1.toUpperCase();
//                        System.out.print(minhaMatrizNoTabuleiro [linha][coluna] + "   | ");
//
//                    } else if (vez%2!=0 && escolhaDaPosicaoJogador1 == posicaoDisponivel && minhaMatrizNoTabuleiro[linha][coluna] == escolhaXouOJogador1 &&
//                            vez%2!=0 && escolhaDaPosicaoJogador1 == posicaoDisponivel && minhaMatrizNoTabuleiro[linha][coluna] ==escolhaXouOJogador2 ||
//                            (vez%2==0 && escolhaDaPosicaoJogador2 == posicaoDisponivel  && minhaMatrizNoTabuleiro[linha][coluna] == escolhaXouOJogador2 &&
//                            vez%2==0 && escolhaDaPosicaoJogador2 == posicaoDisponivel && minhaMatrizNoTabuleiro[linha][coluna] == escolhaXouOJogador1)){
//
//                        System.out.println("Essa posição já está preenchida. Por favor, selecione outra opção");
//                        valido = false;
//                    }
//                        else if(escolhaDaPosicaoJogador2 == posicaoDisponivel  && minhaMatrizNoTabuleiro[linha][coluna] != escolhaXouOJogador2 ||
//                            escolhaDaPosicaoJogador2 == posicaoDisponivel && minhaMatrizNoTabuleiro[linha][coluna] != escolhaXouOJogador1){
//                        minhaMatrizNoTabuleiro[linha][coluna] = escolhaXouOJogador2;
//                        System.out.print(minhaMatrizNoTabuleiro [linha][coluna] + "   | ");
//                    } else{
//                            if(minhaMatrizNoTabuleiro[linha][coluna] == escolhaXouOJogador1 || minhaMatrizNoTabuleiro [linha][coluna] == escolhaXouOJogador2) {
//                                System.out.print( minhaMatrizNoTabuleiro[linha][coluna] + "   |");
//                            } else{
//                                 minhaMatrizNoTabuleiro[linha][coluna]  = String.valueOf(posicaoDisponivel);
//                                System.out.print( minhaMatrizNoTabuleiro[linha][coluna] + "   |");
//                            }
//
//                    }

                }
                System.out.println("\n                                                          -------------------");
            }
            System.out.println("                                                          ===================");

            vez++;
        }

    }
}