//package CardGame;

public class Carta {

    private int topo;
    private int fundo;
    private int esquerda;
    private int direita;
    private Jogador jogador;

    public Carta(int topo, int fundo, int esquerda, int direita, Jogador jogador) {
        this.topo = topo;
        this.fundo = fundo;
        this.esquerda = esquerda;
        this.direita = direita;
        this.jogador = jogador;
    }

    public int getTopo() {
        return this.topo;
    }

    public int getFundo() {
        return this.fundo;
    }

    public int getEsquerda() {
        return this.esquerda;
    }

    public int getDireita() {
        return this.direita;
    }

    public Jogador getJogador() {
        return this.jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

}
