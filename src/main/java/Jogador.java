//package CardGame;

import java.util.List;
import java.util.ArrayList;

public class Jogador {

    private String nome;
    private int pontuacao;
    private List<Carta> cartas;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 5;
        this.cartas = new ArrayList<Carta>();
    }

    public String getNome() {
        return this.nome;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public Carta getCarta(int i) {
        return this.cartas.get(i);
    }

    public Carta[] getCartas() {
        Carta[] vetor = new Carta[this.cartas.size()];
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = this.cartas.get(i);
        }
        return vetor;
    }

    public void setCarta(Carta carta) {
        if(this.cartas.size() == 5) {
            System.out.println(this.getNome() + " JÁ POSSUI AS 5 CARTAS!");
        } else {
            this.cartas.add(carta);
        }
    }

    public void removerCarta(int posicao) {
        this.cartas.remove(posicao);
    }

    public void ganhouCarta() {
        this.pontuacao++;
    }

    public void perdeuCarta() {
        this.pontuacao--;
    }

    public boolean posicaoValida(int posicao) {
        if(posicao < 0 || posicao > this.cartas.size()-1) {
            System.out.println("POSIÇÃO INVÁLIDA!");
            return false;
        }
        return true;
    }

}
