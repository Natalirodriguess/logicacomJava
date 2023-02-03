package br.com.logicadeprogramacao.exercicios.jogodavelha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        String resposta = " ";
        do {

            String[][] velha = new String[3][3];
            int jogadas = 0, posicao = 0;
            //String temporaria;
            int coluna, linha = 0;
            Scanner valor = new Scanner(System.in);
            String turno = "X";
            boolean jogou = false, valido;

            //imprimir tabuleiro:
            mostraTabuleiro(velha);
            //---------------------------------------------------

            //laço da partida (jogadas deve ser até 9)

            while (jogadas < 9) {

                valido = false;
                while (!valido) {

                    try {
                        System.out.println("Digite uma posição de 1 a 9:");
                        posicao = valor.nextInt();
                        valido = true;
                    } catch (InputMismatchException e) {
                        valor.next();
                        System.out.println("Entrada inválida! Por favor, digite um número inteiro!");
                    }
                }

                if (posicao > 0 && posicao < 10) {
                    linha = (posicao - 1) / 3;
                    coluna = (posicao - 1) % 3;
                    if ((velha[linha][coluna] != "X") && (velha[linha][coluna] != "O")) {
                        velha[linha][coluna] = turno;
                        jogadas++;

                        //verificar o vencedor

                        if (velha[0][0] == "X" && velha[0][1] == "X" && velha[0][2] == "X" ||
                                velha[1][0] == "X" && velha[1][1] == "X" && velha[1][2] == "X" ||
                                velha[2][0] == "X" && velha[2][1] == "X" && velha[1][2] == "X" ||
                                // colunas:
                                velha[0][0] == "X" && velha[1][0] == "X" && velha[2][0] == "X" ||
                                velha[0][1] == "X" && velha[1][1] == "X" && velha[1][1] == "X" ||
                                velha[0][2] == "X" && velha[1][2] == "X" && velha[2][2] == "X" ||
                                // diagonais:
                                velha[0][0] == "X" && velha[1][1] == "X" && velha[2][2] == "X" ||
                                velha[0][2] == "X" && velha[1][1] == "X" && velha[2][0] == "X") {

                            jogou = true;
                        } else if (velha[0][0] == "O" && velha[0][1] == "O" && velha[0][2] == "O" ||
                                velha[1][0] == "O" && velha[1][1] == "O" && velha[1][2] == "O" ||
                                velha[2][0] == "O" && velha[2][1] == "O" && velha[1][2] == "O" ||
                                // colunas:
                                velha[0][0] == "O" && velha[1][0] == "O" && velha[2][0] == "O" ||
                                velha[0][1] == "O" && velha[1][1] == "O" && velha[1][1] == "O" ||
                                velha[0][2] == "O" && velha[1][2] == "O" && velha[2][2] == "O" ||
                                // diagonais:
                                velha[0][0] == "O" && velha[1][1] == "O" && velha[2][2] == "O" ||
                                velha[0][2] == "O" && velha[1][1] == "O" && velha[2][0] == "O") {
                            jogou = true;
                        }


                        //---------------------------
                        // verificar se o jogador venceu
                        if (jogou == true) {
                            System.out.println("O vencendor é " + turno);
                            break;

                        } else if (jogadas > 9) {
                            System.out.println("Ninguém venceu essa partida!");
                            break;

                        }
                        //----------------------------------------------------------------------------------------------

                    } else {
                        System.out.println("esta posição já está ocupada, tente novamente!");
                        continue;
                    }
                    if (turno == "X") {
                        turno = "O";
                    } else {
                        turno = "X";
                    }
                } else {
                    System.out.println("Posicão inválida, tente outra posição!");
                    continue;
                }

                System.out.println("\n \n \n \n \n \n \n \n \n \n \n");
                // imprimir tabuleiro
                mostraTabuleiro(velha);

            }
            System.out.println("Deseja jogar mais uma rodada?");
            resposta = valor.next();
        } while (resposta.equals("S"));
    }

    public static void mostraTabuleiro(String[][] velha) {
        System.out.println("=============== \n" +
                "JOGO DA VELHA \n" +
                "=============== ");
        int linha;
        int coluna;
        System.out.println();
        for (linha = 0; linha < velha.length; linha++) {
            for (coluna = 0; coluna < velha[linha].length; coluna++) {
                System.out.print(velha[linha][coluna] + "| ");
            }
            System.out.println();

        }
        System.out.println();
    }
}