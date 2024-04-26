//package cardGame;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Jogador p1 = new Jogador("Player1");
        Jogador p2 = new Jogador("Player2");

        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.distribuirCartas(p1);
    tabuleiro.distribuirCartas(p2);

        Jogo jogo = new Jogo();
        int numJogadas = 9;

        for(int i=0; i<numJogadas; i++) {
            jogo.printCabecalho();
            Jogador jogadorAtual;
            if(i % 2 == 0) jogadorAtual = p1;
            else jogadorAtual = p2;
            System.out.println("Jogada " + (i+1) + "/9:\n");
            jogo.printTabuleiro(tabuleiro);
            jogo.printPlacar(p1, p2);
            jogo.printCartas(jogadorAtual.getCartas());
            if(!jogar(tabuleiro, jogadorAtual)) i--;
            limparConsole();
        }

        jogo.printCabecalho();
        jogo.printTabuleiro(tabuleiro);
        jogo.printPlacar(p1, p2);
        jogo.printVencedor(p1, p2);
    }

    public static boolean jogar(Tabuleiro tabuleiro, Jogador jogador) {
    System.out.print(jogador.getNome() + " escolha uma carta para jogar: ");
    int posicao = sc.nextInt()-1;
    if(!jogador.posicaoValida(posicao)) return false;

    System.out.print("Digite a linha do tabuleiro: ");
    int lin = sc.nextInt() -1;
    System.out.print("Digite a coluna do tabuleiro: ");
    int col = sc.nextInt() -1;
    if(!tabuleiro.posicaoValida(lin, col)) return false;
    if(!tabuleiro.posicaoVazia(lin, col)) return false;

    Carta carta = jogador.getCarta(posicao);
    jogador.removerCarta(posicao);
    return tabuleiro.jogarCarta(carta, lin, col);
  }

    public static void limparConsole() {
        System.out.print("\033[H\033[2J");
    System.out.flush();
    }

}
