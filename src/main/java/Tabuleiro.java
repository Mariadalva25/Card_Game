//package CardGame;

import java.util.Random;

public class Tabuleiro {

    private Carta[][] tabuleiro;

    public Tabuleiro() {
        this.tabuleiro = new Carta[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                this.tabuleiro[i][j] = new Carta(0, 0, 0, 0, null);
            }
        }
    }

    public Carta[] getLinhaCartas(int i) {
    return this.tabuleiro[i];
  }

    public void distribuirCartas(Jogador jogador) {
        Random r = new Random();
        for(int i=0; i<5; i++) {
            int topo = r.nextInt(10) + 1;
            int fundo = r.nextInt(10) + 1;
            int esquerda = r.nextInt(10) + 1;
            int direita = r.nextInt(10) + 1;
            Carta carta = new Carta(topo, fundo, esquerda, direita, jogador);
            jogador.setCarta(carta);
        }
    }

    public void tomarCarta(Carta cartaJogada, Carta cartaAdjacente) {
        if(cartaAdjacente.getJogador() != null) {
            cartaJogada.getJogador().ganhouCarta();
            cartaAdjacente.getJogador().perdeuCarta();
            cartaAdjacente.setJogador(cartaJogada.getJogador());
        }
    }

    public boolean jogarCarta(Carta carta, int i, int j) {
        this.tabuleiro[i][j] = carta;
        analisarCartasAdjacentes(carta, i, j);
        return true;
    }

    public void analisarCartasAdjacentes(Carta carta, int i, int j) {
        if(i-1 >= 0 && carta.getTopo() > this.tabuleiro[i-1][j].getFundo()) { 
            tomarCarta(carta, this.tabuleiro[i-1][j]);
        }
        if(i+1 <= 2 && carta.getFundo() > this.tabuleiro[i+1][j].getTopo()) { 
            tomarCarta(carta, this.tabuleiro[i+1][j]);
        }
        if(j-1 >= 0 && carta.getEsquerda() > this.tabuleiro[i][j-1].getDireita()) { 
            tomarCarta(carta, this.tabuleiro[i][j-1]);
        }
        if(j+1 <= 2 && carta.getDireita() > this.tabuleiro[i][j+1].getEsquerda()) { 
            tomarCarta(carta, this.tabuleiro[i][j+1]);
        }
    }

    public boolean posicaoValida(int i, int j) {
        if(i <= 2 && i >= 0 && j <= 2 && j >= 0) {
            return true;
        }
        System.out.println("POSIÇÃO DO TABULEIRO INVÁLIDA!");
        return false;
    }

    public boolean posicaoVazia(int i, int j) {
        if(this.tabuleiro[i][j].getTopo() != 0) {
            System.out.println("JÁ EXISTE UMA CARTA NESTA POSIÇÃO!");
            return false;
        } 
        return true;
    }

}
