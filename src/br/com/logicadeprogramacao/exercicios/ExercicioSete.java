package br.com.logicadeprogramacao.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioSete {


    static String[][] velha = new String[][] {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    static String turno = "X";
    static String  resposta = " ";

    public static void main(String[] args) {

        do{

            int jogadas = 0;

            mostraTabuleiro();


            while (jogadas < 9) {

                int posicao = lerEscolha();
                boolean jogou = jogarVelha(posicao);
                jogarVelha(posicao);
                if (jogou) {

                    if (verificaVencedor()) {
                        System.out.println("O vencedor é " + turno);

                        break;
                    }

                    trocaTurno();
                    jogadas++;
                    limpaTela();
                    mostraTabuleiro();


                    }
                }
            if(jogadas == 9 || verificaVencedor()==true){
                jogadas = 0;
                zeraTabuleiro();
                System.out.println("Deseja continuar?");
                Scanner valor = new Scanner(System.in);
                resposta = valor.next();
            }
        } while(resposta.equals("S"));
}


    public  static void zeraTabuleiro(){
         String[][] velha = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    }

    public static boolean jogarVelha(int posicao){

        int linha = (posicao - 1) /3;
        int coluna =  (posicao - 1)% 3;

        if(posicao >0 && posicao <10 ){
            velha[linha][coluna] = turno;
            return true;

        } else {
            System.out.println("Posicão inválida!\n" +
                    "Tente novamente!");
            return false;
        }

    }

    public static String trocaTurno(){
        if(turno.equals("X")){
            turno = "O";
        } else{
          turno ="X";
        }
        return turno;
    }

    public static boolean verificaVencedor(){
        boolean vencedor = false;

        // linhas:
        for(int linha = 0; linha <3; linha ++){
            for(int i = 0; i < 3; i++){
                int coluna = 0;
                if(velha[linha][ coluna] == velha[linha][ coluna+1] && velha[linha][ coluna+1] == velha[linha][ coluna+2])  {
                    vencedor = true;
                }
            }
        }
        //colunas
        for(int coluna = 0; coluna < 3 ; coluna ++){
            for(int i = 0; i < 3; i++){
                int linha = 0;
                if(velha[linha][ coluna] == velha[linha + 1][ coluna] && velha[linha +1 ][ coluna] == velha[linha + 2][ coluna])  {
                    vencedor = true;
                }
            }

        }

        if(velha[0][0] == velha [1][1] && velha[1][1] == velha[2][2]){
            vencedor = true;
        } else if (velha[0][2] == velha [1][1] && velha[1][1] == velha[2][0]){
            vencedor = true;
        }


        return vencedor;
    }

    public static void limpaTela(){
        System.out.println("\n \n \n \n \n \n \n \n" +
                "\n \n \n \n \n \n \n \n" +
                "\n \n \n \n \n \n \n \n");
    }

    public static int lerEscolha() throws InputMismatchException {
            Scanner scan = new Scanner(System.in);
            int posicao = scan.nextInt();
            return posicao;
    }

    public static void mostraTabuleiro(){

        System.out.println("==================");
        System.out.println("   JOGO DA VELHA  ");
        System.out.println("------------------");
        for(int linha = 0; linha < 3; linha++){

            System.out.print("|");
            for(int coluna = 0; coluna < 3; coluna++){
                System.out.print("  "+velha[linha][coluna]+" | ");

            }
            System.out.println(" ");
            System.out.println("------------------");
        }
        System.out.println("==================");

    }

}



